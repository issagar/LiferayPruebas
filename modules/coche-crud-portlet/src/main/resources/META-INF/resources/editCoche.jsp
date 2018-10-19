<%@ include file="./init.jsp" %>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="coche.crud.sb.model.Coche" %>
<%@page import="coche.crud.sb.service.CocheLocalService" %>
<%
	CocheLocalService cochesLocalService = (CocheLocalService)renderRequest.getAttribute("cocheLocalService");
	long cocheId = ParamUtil.getLong(request,"CocheId", 0);
	Coche coche = null;
	if(cocheId>0){
		coche = cochesLocalService.fetchCoche(cocheId);
	}
	if(coche!=null){
	
%>
	<liferay-portlet:actionURL name="editCoche" var="editCocheURL">
		<liferay-portlet:param name="CocheId" value="<%=String.valueOf(cocheId) %>"/>
	</liferay-portlet:actionURL>
	<aui:form action="${editCocheURL}" method="post" name="fm">

		<aui:input type="text" name="marca" label="marca" value="<%=coche.getMarca() %>" localized="false">
			<aui:validator name="maxLength">50</aui:validator>
		</aui:input>
		<aui:input type="text" name="modelo"  label="modelo" value="<%=coche.getModelo() %>" localized="true">
			<aui:validator name="maxLength">50</aui:validator>
		</aui:input>
		<aui:input type="text" name="precio" label="precio" value="<%=coche.getPrecio() %>">
			<aui:validator name="number"></aui:validator>
		</aui:input>
		<liferay-ui-asset-categories-error />
		<liferay-ui-asset-tags-error />
		<aui:button-row>
			<aui:button name="submit" type="submit" value="save" />
		</aui:button-row>

	</aui:form>
<%}else{

		%>
		<div>NO SE HA ENCONTRADO COCHE</div>
		
	<%}%>