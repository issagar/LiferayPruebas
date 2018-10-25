<%@page import="coche.crud.sb.model.Coche"%>
<%@page import="coche.crud.sb.service.CocheLocalService"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.dao.search.DisplayTerms"%>
<%@page import="com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.util.OrderByComparator"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="coche.crud.sb.model.Conductor"%>
<%@page import="coche.crud.sb.service.ConductorLocalService" %>

<%@ include file="./init.jsp" %>

<h2><liferay-ui:message key="cochecrud.caption"/></h2>

<%
CocheLocalService cochesLocalService = (CocheLocalService)renderRequest.getAttribute("cocheLocalService");
long cocheId = ParamUtil.getLong(request,"CocheId", 0);
Coche coche = null;
if(cocheId>0){
	coche = cochesLocalService.fetchCoche(cocheId);
}
%>

<% 
String orderByCol = ParamUtil.getString(request, "orderByCol", "apellido");
String orderByType= ParamUtil.getString(request, "orderByType", "asc");
OrderByComparator comparator= OrderByComparatorFactoryUtil.create("Conductor", orderByCol, "asc".equals(orderByType)); 
%>
	
<liferay-portlet:renderURL varImpl="iteratorURL">
	<liferay-portlet:param name="jspPage" value="/view.jsp"  />
</liferay-portlet:renderURL>

<liferay-ui:search-container iteratorURL ="<%=iteratorURL%>" emptyResultsMessage="No hay conductores" delta="5" displayTerms="<%=new DisplayTerms(renderRequest) %>" orderByCol="<%=orderByCol %>" orderByType="<%=orderByType%>" orderByComparator="<%=comparator%>" >
	<liferay-ui-search-container-results>
	<%
	ConductorLocalService conductorLocalService = (ConductorLocalService)renderRequest.getAttribute("conductorLocalService");
	List <Conductor> listaConductores= conductorLocalService.findByCocheId(cocheId);
	searchContainer.setResults(listaConductores);
	searchContainer.setTotal(listaConductores.size());
	%>
	</liferay-ui-search-container-results>

	<liferay-ui:search-container-row className="coche.crud.sb.model.Conductor" keyProperty ="conductorId" modelVar="conductor" >
	
		<liferay-ui:search-container-column-text name="Nombre" value="<%=conductor.getNombre()%>"/>
		<liferay-ui:search-container-column-text name="Apellido" property="apellido"/>
		<liferay-ui:search-container-column-text name="Dni" property="dni"/>		
		<liferay-ui:search-container-column-text name="actions">
			<liferay-ui:icon-menu>
				<liferay-portlet:renderURL var="editConductorURL">
					<liferay-portlet:param name="mvcPath" value="/editConductor.jsp" />
					<liferay-portlet:param name="conductorId" value="<%=String.valueOf(conductor.getConductorId()) %>" />
				</liferay-portlet:renderURL>
				<liferay-ui:icon image="edit" message="Editar" label="edit-conductor" url="${editConductorURL }" />
				<liferay-portlet:actionURL name="deleteConductor" var="deleteConductorURL">
					<liferay-portlet:param name="conductorId" value="<%=String.valueOf(conductor.getConductorId()) %>" />
				</liferay-portlet:actionURL>
				<liferay-ui:icon image="delete" message="Eliminar" label="delete-conductor" url="${deleteConductorURL}" />
			</liferay-ui:icon-menu>
			
		</liferay-ui:search-container-column-text>
	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator/>
</liferay-ui:search-container>
