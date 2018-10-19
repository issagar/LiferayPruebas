package coche.crud.portlet.portlet;

import coche.crud.portlet.constants.CocheCrudPortletKeys;
import coche.crud.sb.service.CocheLocalServiceUtil;
import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactory;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;

import java.io.IOException;
import java.sql.Date;
import java.time.Instant;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import coche.crud.sb.model.Coche;

import coche.crud.sb.service.CocheLocalService;


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
		"javax.portlet.name=" + CocheCrudPortletKeys.CocheCrud,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class CocheCrudPortlet extends MVCPortlet {
	
		@Reference
		private CocheLocalService _cocheLocalService;
		
		@Override
		public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException{
			renderRequest.setAttribute("cocheLocalService", _cocheLocalService);
			super.render(renderRequest, renderResponse);
			
		}
		
		
		@ProcessAction(name="addCoche")
		public void addCoche(ActionRequest actionRequest, ActionResponse actionResponse){
			
			final ThemeDisplay theme= (ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
			String marca= ParamUtil.getString(actionRequest, "marca");
			String modelo = ParamUtil.getString(actionRequest, "modelo");
			Double precio = ParamUtil.getDouble(actionRequest, "precio");
			_cocheLocalService.addCoche(theme.getCompanyId(), theme.getUserId(), theme.getDoAsUserId(), marca, modelo,precio);
		}
    

		@ProcessAction(name="deleteCoche")
		public void deleteCoche(ActionRequest actionRequest, ActionResponse actionResponse){
			
			long cocheId = ParamUtil.getLong(actionRequest, "CocheId");
			
			Coche coche= _cocheLocalService.createCoche(cocheId);
			
			_cocheLocalService.deleteCoche(coche);
		}
		
		@ProcessAction(name="editCoche")
		public void editCoche(ActionRequest actionRequest, ActionResponse actionResponse){
			long cocheId = ParamUtil.getLong(actionRequest, "CocheId", 0);
			String marca= ParamUtil.getString(actionRequest, "marca");
			String modelo = ParamUtil.getString(actionRequest, "modelo");
			Double precio = ParamUtil.getDouble(actionRequest, "precio");

			try {
				_cocheLocalService.updateCoche(cocheId, marca, modelo, precio);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			actionResponse.setRenderParameter("mvcPath", "/view.jsp");
		}
}
			
		
