<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.dao.search.DisplayTerms"%>
<%@page import="com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.util.OrderByComparator"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="coche.crud.sb.model.Coche"%>
<%@page import="coche.crud.sb.service.CocheLocalService" %>

<%@ include file="./init.jsp" %>

<h2><liferay-ui:message key="cochecrud.caption"/></h2>

<liferay-portlet:renderURL var="addConductorURL">
	<liferay-portlet:param name="jspPage" value="/addConductor.jsp" />
</liferay-portlet:renderURL>

<liferay-portlet:renderURL var="addCocheURL">
	<liferay-portlet:param name="jspPage" value="/addCoche.jsp" />
</liferay-portlet:renderURL>
	
<liferay-portlet:renderURL var="viewConductoresURL">
	<liferay-portlet:param name="jspPage" value="/viewConductores.jsp" />
</liferay-portlet:renderURL>


<liferay-ui:icon-list>
        <liferay-ui:icon image="status_online" message="Nuevo Conductor" url="${addConductorURL}"/>
        <liferay-ui:icon image="add" message="Nuevo Coche" url="${addCocheURL}"/>
        <liferay-ui:icon image="view_articles" message="Ver conductores" url="${viewConductoresURL}"/>
</liferay-ui:icon-list>

	

<% 
String orderByCol = ParamUtil.getString(request, "orderByCol", "marca");
String orderByType= ParamUtil.getString(request, "orderByType", "asc");
OrderByComparator comparator= OrderByComparatorFactoryUtil.create("Coche", orderByCol, "asc".equals(orderByType)); 
%>
	
<liferay-portlet:renderURL varImpl="iteratorURL">
	<liferay-portlet:param name="jspPage" value="/view.jsp"  />
</liferay-portlet:renderURL>

<liferay-ui:search-container iteratorURL ="<%=iteratorURL%>" emptyResultsMessage="No hay coches" delta="20" displayTerms="<%=new DisplayTerms(renderRequest) %>" orderByCol="<%=orderByCol %>" orderByType="<%=orderByType%>" orderByComparator="<%=comparator%>" >
	<liferay-ui-search-container-results>
	<%
	CocheLocalService cochesLocalService = (CocheLocalService)renderRequest.getAttribute("cocheLocalService");
	List<Coche> coches = cochesLocalService.getCoches(searchContainer.getStart(), searchContainer.getEnd());
	searchContainer.setResults(coches);
	searchContainer.setTotal(cochesLocalService.getCochesCount());
	%>
	</liferay-ui-search-container-results>

	<liferay-ui:search-container-row className="coche.crud.sb.model.Coche" keyProperty ="CocheId" modelVar="coche" >
		<liferay-ui:search-container-column-text name="Marca" value="<%=coche.getMarca()%>"/>
		<liferay-ui:search-container-column-text name="Modelo" property="modelo"/>
		<liferay-ui:search-container-column-text name="Precio" property="precio"/>		
		<liferay-ui:search-container-column-text name="actions">
			<liferay-ui:icon-menu>
				<liferay-portlet:renderURL var="editCocheURL">
					<liferay-portlet:param name="mvcPath" value="/editCoche.jsp" />
					<liferay-portlet:param name="CocheId" value="<%=String.valueOf(coche.getCocheId()) %>" />
				</liferay-portlet:renderURL>
				<liferay-ui:icon image="edit" message="Editar" label="edit-coche" url="${editCocheURL }" />
				<liferay-portlet:actionURL name="deleteCoche" var="deleteCocheURL">
					<liferay-portlet:param name="CocheId" value="<%=String.valueOf(coche.getCocheId()) %>" />
				</liferay-portlet:actionURL>
				<liferay-ui:icon image="delete" message="Eliminar" label="delete-coche" url="${deleteCocheURL}" />
			</liferay-ui:icon-menu>
			<liferay-portlet:renderURL var="showConductorURL">
					<liferay-portlet:param name="mvcPath" value="/showConductor.jsp" />
					<liferay-portlet:param name="CocheId" value="<%=String.valueOf(coche.getCocheId()) %>" />
			</liferay-portlet:renderURL>
			<liferay-ui:icon image="search" message="Ver conductores" label="show-conductores" url="${showConductorURL}" />
			
		</liferay-ui:search-container-column-text>
	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator/>
</liferay-ui:search-container>



<liferay-portlet:resourceURL id="downloadCoches" var="downloadCochesUrl" >
<liferay-portlet:param name="listacoches" value="coches"/>
</liferay-portlet:resourceURL>
<aui:button name="downloadCochesButton" type="submit" value="Descargar lista de coches .txt" onClick="<%=downloadCochesUrl%>"/>

<liferay-portlet:resourceURL id="downloadCochesCSV" var="downloadCochesCSVUrl">
<liferay-portlet:param name="listacochesCSV" value="cochesCSV"/>
</liferay-portlet:resourceURL>
<aui:button name="downloadCochesCSVButton" type="submit" value="Descargar lista de coches .csv" onClick="<%=downloadCochesCSVUrl%>"/>


		