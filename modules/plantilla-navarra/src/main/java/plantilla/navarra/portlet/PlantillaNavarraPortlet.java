package plantilla.navarra.portlet;

import plantilla.navarra.constants.PlantillaNavarraPortletKeys;

import java.io.IOException;
import java.io.PrintWriter;

import javax.portlet.GenericPortlet;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author migarcia
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=PlantillaNavarra",
		"javax.portlet.name=" + PlantillaNavarraPortletKeys.PlantillaNavarra,
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class PlantillaNavarraPortlet extends GenericPortlet implements FreeMarkerTool {

	@Override
	protected void doView(
			RenderRequest renderRequest, RenderResponse renderResponse)
		throws IOException, PortletException {

		PrintWriter printWriter = renderResponse.getWriter();

		printWriter.print("Hello from PlantillaNavarra!");
	}

	@Override
	public String verAdt() {
		// TODO Auto-generated method stub
		return null;
	}
	
	


}