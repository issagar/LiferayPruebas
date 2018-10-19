package portletmvc.portlet;

import portletmvc.constants.PortletMVCPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.servlet.HttpHeaders;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import org.apache.commons.io.IOUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author migarcia
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + PortletMVCPortletKeys.PortletMVC,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class PortletMVCPortlet extends MVCPortlet {
	  	private static Log _log = LogFactoryUtil.getLog(PortletMVCPortlet.class);
	  	
		public void addRegistro(ActionRequest actionRequest, ActionResponse actionResponse){
			
			String nombre= ParamUtil.getString(actionRequest, "nombre");
			String email=ParamUtil.getString(actionRequest, "email");
			String password = ParamUtil.getString(actionRequest, "password");
			 _log.trace("Nombre: " + nombre);
		     _log.trace("Email: " + email);
		     actionResponse.setRenderParameter("jspPage", "/addRegistro.jsp");
		}
		/*
		@ServeResourceMethod(resourceID = download)
		public void download(ResourceRequest resourceRequest, ResourceResponse resourceResponse) {

		}
		*/
		
	    public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse) {

	        if ("download".equals(resourceRequest.getResourceID())) {

	            try {
	                resourceResponse.setContentType("text/csv");
	                resourceResponse.addProperty(HttpHeaders.CONTENT_DISPOSITION,
	                        "attachment;filename=miFichero.csv");
	                OutputStream out = resourceResponse.getPortletOutputStream();
	                String names = "Curso , Liferay";

	                InputStream in = new ByteArrayInputStream(names.getBytes());
	                IOUtils.copy(in, out);
	            } catch (Exception e) {
	                _log.error(e);
	            }
	        } else if ("ajax".equals(resourceRequest.getResourceID())) {
	            //LLalmada ajax
	            try {
	                resourceResponse.getWriter().write("Hola!!");
	            } catch (IOException e) {
	                _log.error(e);
	            }
	        }
	    }
	
}