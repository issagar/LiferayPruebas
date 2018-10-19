package com.cursoliferay.service.wrapper;

import com.liferay.portal.kernel.service.LayoutLocalServiceWrapper;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceWrapper;

import org.osgi.service.component.annotations.Component;

/**
 * @author migarcia
 */
@Component(
	immediate = true,
	property = {
	},
	service = ServiceWrapper.class
)
public class LayoutLocalServiceOverride extends LayoutLocalServiceWrapper {

	public LayoutLocalServiceOverride() {
		super(null);
	}
	
	public com.liferay.portal.kernel.model.Layout addLayout(com.liferay.portal.kernel.model.Layout layout){
		
		System.out.println("Nuevo layout");
		
		return super.addLayout(layout);
		
	}
	public com.liferay.portal.kernel.model.Layout addLayout(long userId,
			long groupId, boolean privateLayout, long parentLayoutId,
			java.util.Map<java.util.Locale, String> nameMap,
			java.util.Map<java.util.Locale, String> titleMap,
			java.util.Map<java.util.Locale, String> descriptionMap,
			java.util.Map<java.util.Locale, String> keywordsMap,
			java.util.Map<java.util.Locale, String> robotsMap, String type,
			String typeSettings, boolean hidden,
			java.util.Map<java.util.Locale, String> friendlyURLMap,
			ServiceContext serviceContext)
throws com.liferay.portal.kernel.exception.PortalException {

System.out.println("Nuevo layout");

return super.addLayout(userId, groupId, privateLayout,
parentLayoutId, nameMap, titleMap, descriptionMap, keywordsMap,
robotsMap, type, typeSettings, hidden, friendlyURLMap,
serviceContext);
}

public com.liferay.portal.kernel.model.Layout addLayout(long userId,
			long groupId, boolean privateLayout, long parentLayoutId, String name,
			String title, String description, String type, boolean hidden,
			String friendlyURL, ServiceContext serviceContext)
throws com.liferay.portal.kernel.exception.PortalException {

System.out.println("Nuevo layout");

return super.addLayout(userId, groupId, privateLayout,
parentLayoutId, name, title, description, type, hidden,
friendlyURL, serviceContext);
}

}