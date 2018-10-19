<#--
This file allows you to override and define new FreeMarker variables.
-->
<#assign isPortalAdmin = permissionChecker.isCompanyAdmin(company_id) />
<#assign isWebsiteAdmin = permissionChecker.isGroupAdmin(group_id) || permissionChecker.isGroupOwner(group_id) />
<#assign isShowbreadcrumb = getterUtil.getBoolean(theme_settings["showBreadcrumb"]) />
<#assign chooseColor = getterUtil.getString(theme_settings["chooseColor"]) />
<#assign isShowNavigation = getterUtil.getBoolean(theme_settings["showNavigation"]) />

