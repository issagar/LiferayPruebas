<!DOCTYPE html>

<#include init />

<html class="${root_css_class}" dir="<@liferay.language key="lang.dir" />" lang="${w3c_language_id}">

	<head>
		<title>${the_title} - ${company_name}</title>
		<meta content="initial-scale=1.0, width=device-width" name="viewport" />
		<@liferay_util["include"] page=top_head_include />
		<link href="https://fonts.googleapis.com/css?family=Roboto+Condensed" rel="stylesheet">
	</head>

	<body class="${css_class}">

		<@liferay_ui["quick-access"] contentId="#main-content" />
		
		<@liferay_util["include"] page=body_top_include />
		
		<@liferay.control_menu />

		<div id="wrapper">
			<header id="banner" role="banner">
				<div id="heading">
				<div class= "container">
				<div class= "row">
				<div class="col-sm-2">
					<div class="menu">
						<a class="botonMenu" data-toggle="collapse" href="#collapseExample" role="button" aria-expanded="false" aria-controls="collapseExample"><img src="${themeDisplay.getPathThemeImages()}/menu1.png" class="menuIcon" /></a>
						<a class="enlacesMenu" data-toggle="collapse" href="#collapseExample" role="button" aria-expanded="false" aria-controls="collapseExample">MENU</a>		
					</div>
				</div>
					
					
				<div class="col-sm-6">  	
					<div class="navarra">
						<a href="#" title="enlaceIndex"><img src="${themeDisplay.getPathThemeImages()}/menu.png" class="menuIcon" /></a>
						<a href="#" class="navarraTxt" title="enlaceIndex" >navarra.es</a>
					</div>
				</div>
				<div class="col-sm-4">  
					 	<div class="teAtendemos">
							<a href="#"  title="enlaceIndex"><img src="${themeDisplay.getPathThemeImages()}/teAtendemos.png" class="menuIcon" /></a>
							<a href="#collapseExample3" data-toggle="collapse" class="enlacesMenu" title="enlaceIndex" >TE ATENDEMOS</a>
								
						</div>


					<div class="idiomas">
						<a href="#" title="enlaceIndex"><img src="${themeDisplay.getPathThemeImages()}/idioma.png" class="menuIcon" /></a>
						<a href="#collapseExample2" data-toggle="collapse" class="enlacesMenu" title="enlaceIndex" >IDIOMAS</a>
							<div class="collapse" id="collapseExample2"><br/>
								<div class="card card-body">
									<@liferay_portlet["runtime"]
						    			portletName="com_liferay_site_navigation_language_web_portlet_SiteNavigationLanguagePortlet"/>
								</div>
							</div>
					</div>
				</div>
						
					</div>
					</div>
				</div>	
			</header>
			<div class="container">
			<div class="collapse" id="collapseExample">
			     <@liferay_portlet["runtime"] portletName="com_liferay_journal_content_web_portlet_JournalContentPortlet" />
			</div>
			</div>
			<div class="container">
			<div class="collapse" id="collapseExample3">
			     <@liferay_portlet["runtime"] portletName="com_liferay_journal_content_web_portlet_JournalContentPortlet" />
			</div>
			</div>
			
			<div class="busqueda">		
				<form class="form-inline">
					<i class="fa fa-search" aria-hidden="true"></i>
					<div class="container">
					<input class="form-control form-control-sm ml-12 w-75" type="text" placeholder="Buscar en navarra.es" aria-label="search">
					</div>
				</form>	
			
			</div>
			<section id="content">
				<h1 class="hide-accessible">${the_title}</h1>
				<#if selectable>
					<@liferay_util["include"] page=content_include />
				<#else>
					${portletDisplay.recycle()}
					<!--${portletDisplay.setTitle(the_title)}-->
					<@liferay_theme["wrap-portlet"] page="portlet.ftl">
						<@liferay_util["include"] page=content_include />
					</@>
				</#if>
			</section>

			<footer id="footer" role="contentinfo">
			  <div class="footer">
			  <div class="container">
			  <div class="menuTop">
			  <div class="row">
				  <div class="col-md-2">
					<img src="${themeDisplay.getPathThemeImages()}/gobierno-navarra.png" class="imgGobiernoNavarra"/>
				   </div>
					<div class="col-md-8">
						<ul>
							<a href="#"><li>Contacto</li></a>
							<a href="#"><li>Accesibilidad</li></a>
							<a href="#"><li>Aviso Legal</li></a>
						</ul>
					</div>
					<div class="col-md-2">
			
					</div>
				</div>
				</div>
				</div>
				<div class="container">
					<div class="row">
			          <@liferay_portlet["runtime"]
					    instanceId="footer"
					    portletName="com_liferay_journal_content_web_portlet_JournalContentPortlet"/>
					</div>
				</div>
			</div>
		</footer>
	</div>

<@liferay_util["include"] page=body_bottom_include />

<@liferay_util["include"] page=bottom_include />

</body>

</html>