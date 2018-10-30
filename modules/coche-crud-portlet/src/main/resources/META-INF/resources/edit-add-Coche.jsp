
<%@page import="coche.crud.sb.model.Coche" %>
<%@page import="coche.crud.sb.service.CocheLocalService" %>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="coche.crud.sb.model.Coche"%>
<%@page import="coche.crud.sb.service.CocheLocalService" %>

<%@ include file="./init.jsp" %>

	
<liferay-portlet:renderURL varImpl="iteratorURL">
	<liferay-portlet:param name="jspPage" value="/edit-add-Coche.jsp"  />
</liferay-portlet:renderURL>

		
		
<%
	CocheLocalService cochesLocalService = (CocheLocalService)renderRequest.getAttribute("cocheLocalService");
	long cocheId = ParamUtil.getLong(request,"CocheId", 0);
	Coche coche = null;
	String marca="";
	String modelo="";
	double precio = 0;

	if(cocheId>0){
		coche = cochesLocalService.fetchCoche(cocheId);
	}
	if(coche!=null){
		marca = coche.getMarca();
		modelo = coche.getModelo();
		precio= coche.getPrecio();
	}
	if(coche==null){
		marca ="";
		modelo="";
		precio = 0;
	}
	
%>
	<liferay-portlet:actionURL name="addEditCoche" var="addEditCocheURL">
		<liferay-portlet:param name="CocheId" value="<%=String.valueOf(cocheId) %>"/>
	</liferay-portlet:actionURL>
	<aui:form action="${addEditCocheURL}" method="post" name="fm">

		<aui:input type="text" name="marca" label="marca" value="<%=marca%>" localized="false">
			<aui:validator name="maxLength">50</aui:validator>
		</aui:input>
		<aui:input type="text" name="modelo"  label="modelo" value="<%=modelo%>" localized="true">
			<aui:validator name="maxLength">50</aui:validator>
		</aui:input>
		<aui:input type="text" name="precio" label="precio" value="<%=precio %>">
			<aui:validator name="number"></aui:validator>
		</aui:input>
		<liferay-ui-asset-categories-error />
		<liferay-ui-asset-tags-error />
		<aui:button-row>
			<aui:button name="submit" type="submit" value="save" />
		</aui:button-row>

	</aui:form>
		