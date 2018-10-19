<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.dao.search.DisplayTerms"%>
<%@page import="com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.util.OrderByComparator"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="coche.crud.sb.model.Coche"%>
<%@page import="coche.crud.sb.service.CocheLocalService" %>

<%@ include file="./init.jsp" %>

<h2><liferay-ui:message key="cochecrud.caption"/></h2>

<% 
String orderByCol = ParamUtil.getString(request, "orderByCol", "marca");
String orderByType= ParamUtil.getString(request, "orderByType", "asc");
OrderByComparator comparator= OrderByComparatorFactoryUtil.create("Coche", orderByCol, "asc".equals(orderByType)); 
%>
	
<liferay-portlet:renderURL varImpl="iteratorURL">
	<liferay-portlet:param name="jspPage" value="/view.jsp"  />
</liferay-portlet:renderURL>

<liferay-ui:search-container iteratorURL ="<%=iteratorURL%>" emptyResultsMessage="No hay coches" delta="5" displayTerms="<%=new DisplayTerms(renderRequest) %>" orderByCol="<%=orderByCol %>" orderByType="<%=orderByType%>" orderByComparator="<%=comparator%>" >
	<liferay-ui-search-container-results>
	<%
	CocheLocalService cochesLocalService = (CocheLocalService)renderRequest.getAttribute("cocheLocalService");
	List<Coche> coches = cochesLocalService.getCoches(searchContainer.getStart(), searchContainer.getEnd());
	searchContainer.setResults(coches);
	searchContainer.setTotal(coches.size());
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
			
		</liferay-ui:search-container-column-text>
	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator/>
</liferay-ui:search-container>

	
<liferay-portlet:renderURL var="addCocheURL">
	<liferay-portlet:param name="jspPage" value="/addCoche.jsp" />
</liferay-portlet:renderURL>
	
<a href="${addCocheURL}" class="btn-btn-primary">
	<liferay-ui:message key="Nuevo Coche" />
</a>
		