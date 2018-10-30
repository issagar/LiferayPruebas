<%@page import="coche.crud.sb.model.Coche"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.dao.search.DisplayTerms"%>
<%@page import="com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.util.OrderByComparator"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="coche.crud.sb.model.Conductor"%>
<%@page import="coche.crud.sb.model.Coche"%>
<%@page import="coche.crud.sb.service.ConductorLocalService" %>
<%@page import="coche.crud.sb.service.CocheLocalService" %>

<%@ include file="./init.jsp" %>

<h2><liferay-ui:message key="cochecrud.caption"/></h2>

<liferay-portlet:renderURL var="addEditConductorURL">
	<liferay-portlet:param name="jspPage" value="/add-edit-conductor.jsp" />
</liferay-portlet:renderURL>

<liferay-portlet:renderURL var="editAddCocheURL">
	<liferay-portlet:param name="jspPage" value="/edit-add-Coche.jsp" />
</liferay-portlet:renderURL>
	
<liferay-portlet:renderURL var="viewConductoresURL">
	<liferay-portlet:param name="jspPage" value="/viewConductores.jsp" />
</liferay-portlet:renderURL>


<liferay-ui:icon-list>
        <liferay-ui:icon image="status_online" message="Nuevo Conductor" url="${addEditConductorURL}"/>
        <liferay-ui:icon image="add" message="Nuevo Coche" url="${editAddCocheURL}"/>
        <liferay-ui:icon image="view_articles" message="Ver conductores" url="${viewConductoresURL}"/>
</liferay-ui:icon-list>


<% 
String orderByCol = ParamUtil.getString(request, "orderByCol", "apellido");
String orderByType= ParamUtil.getString(request, "orderByType", "asc");
OrderByComparator comparator= OrderByComparatorFactoryUtil.create("Conductor", orderByCol, "asc".equals(orderByType)); 
%>
	
<liferay-portlet:renderURL varImpl="iteratorURL">
	<liferay-portlet:param name="jspPage" value="/viewConductores.jsp"  />
</liferay-portlet:renderURL>

<liferay-ui:search-container iteratorURL ="<%=iteratorURL%>" emptyResultsMessage="No hay conductores" delta="20" displayTerms="<%=new DisplayTerms(renderRequest) %>" orderByCol="<%=orderByCol %>" orderByType="<%=orderByType%>" orderByComparator="<%=comparator%>" >
	<liferay-ui-search-container-results>
	<%
	ConductorLocalService conductorLocalService = (ConductorLocalService)renderRequest.getAttribute("conductorLocalService");
	List<Conductor> coches = conductorLocalService.getConductors(searchContainer.getStart(), searchContainer.getEnd());
	searchContainer.setResults(coches);
	searchContainer.setTotal(conductorLocalService.getConductorsCount());
	CocheLocalService cochesLocalService = (CocheLocalService)renderRequest.getAttribute("cocheLocalService");
	
	%>
	</liferay-ui-search-container-results>

	<liferay-ui:search-container-row className="coche.crud.sb.model.Conductor" keyProperty ="conductorId" modelVar="conductor" >
		<liferay-ui:search-container-column-text name="Nombre" value="<%=conductor.getNombre()%>"/>
		<liferay-ui:search-container-column-text name="Apellido" property="apellido"/>
		<liferay-ui:search-container-column-text name="Dni" property="dni"/>
		<%
		Coche coche = cochesLocalService.fetchCoche(conductor.getCocheId());
		String cocheMarca="";
		if (coche != null) {
			cocheMarca = coche.getMarca();
		}
		
		
		%>
		<liferay-ui:search-container-column-text name="Vehiculo" value="<%=cocheMarca %>"/>		
		<liferay-ui:search-container-column-text name="actions">
			<liferay-ui:icon-menu>
				<liferay-portlet:renderURL var="addEditConductorURL">
					<liferay-portlet:param name="mvcPath" value="/add-edit-conductor.jsp" />
					<liferay-portlet:param name="conductorId" value="<%=String.valueOf(conductor.getConductorId()) %>" />
				</liferay-portlet:renderURL>
				<liferay-ui:icon image="edit" message="Editar" label="edit-conductor" url="${addEditConductorURL }" />
				<liferay-portlet:actionURL name="deleteConductor" var="deleteConductorURL">
					<liferay-portlet:param name="conductorId" value="<%=String.valueOf(conductor.getConductorId()) %>" />
				</liferay-portlet:actionURL>
				<liferay-ui:icon image="delete" message="Eliminar" label="delete-conductor" url="${deleteConductorURL}" />
			
			</liferay-ui:icon-menu>
				<liferay-portlet:renderURL var="viewFichaURL">
					<liferay-portlet:param name="mvcPath" value="/viewFicha.jsp" />
					<liferay-portlet:param name="conductorId" value="<%=String.valueOf(conductor.getConductorId()) %>" />
			</liferay-portlet:renderURL>
			<liferay-ui:icon image="search" message="Ver ficha" label="ficha" url="${viewFichaURL}" />
		</liferay-ui:search-container-column-text>
	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator/>
</liferay-ui:search-container>

<liferay-portlet:resourceURL id="downloadConductores" var="downloadConductoresUrl" >
<liferay-portlet:param name="conductores" value="conductores"/>
</liferay-portlet:resourceURL>
<aui:button name="downloadConductoresButton" type="submit" value="Descargar lista de Conductores .txt" onClick="<%=downloadConductoresUrl%>"/>

<liferay-portlet:resourceURL id="downloadConductoresCSV" var="downloadConductoresCSVUrl" >
<liferay-portlet:param name="listaconductoresCSV" value="conductoresCSV"/>
</liferay-portlet:resourceURL>
<aui:button name="downloadConductoresCSVButton" type="submit" value="Descargar lista de Conductores .csv" onClick="<%=downloadConductoresCSVUrl%>"/>

