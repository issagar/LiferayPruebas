<!DOCTYPE html>

<#include init />

<html class="${root_css_class}" dir="<@liferay.language key="lang.dir" />" lang="${w3c_language_id}">

<head>
	<title>Pagina de prueba</title>

	<meta content="initial-scale=1.0, width=device-width" name="viewport" />

	<@liferay_util["include"] page=top_head_include />
</head>


<body class="${css_class}" style="background-color:${chooseColor}">

<@liferay_ui["quick-access"] contentId="#main-content" />

<@liferay_util["include"] page=body_top_include />

<@liferay.control_menu />

<div class="container-fluid" id="wrapper">
	<header id="banner" role="banner">
		<div id="heading">

		</div>

		<#if !is_signed_in>
			<a data-redirect="${is_login_redirect_required?string}" href="${sign_in_url}" id="sign-in" rel="nofollow">${sign_in_text}</a>
		</#if>

	</header>

	<section id="content">
		<h1 class="hide-accessible">Pagina de prueba</h1>
			<@liferay.navigation_menu instance_id="footer_navigation_menu"/>
			<nav id="breadcrumbs">
				<@liferay.breadcrumbs />
			</nav>
			<#if isShowNavigation>
				<@liferay_portlet["runtime"] instanceId="navigationIsa" portletName="com_liferay_site_navigation_menu_web_portlet_SiteNavigationMenuPortlet_INSTANCE_vDbsM2gmyOzl" />
			</#if>
			<#if selectable>
				<@liferay_util["include"] page=content_include />
			<#else>
				${portletDisplay.recycle()}
	<div class ="titulo">
				${portletDisplay.setTitle(the_title)}
	</div>
				<@liferay_theme["wrap-portlet"] page="portlet.ftl">
					<@liferay_util["include"] page=content_include />
				</@>
			</#if>
	</section>

	<footer id="footer" role="contentinfo">
		<p class="powered-by">
				
		</p>
	</footer>
</div>

<@liferay_util["include"] page=body_bottom_include />

<@liferay_util["include"] page=bottom_include />


</body>

</html>