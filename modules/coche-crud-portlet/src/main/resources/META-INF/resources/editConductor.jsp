<%@page import="java.util.List"%>
<%@ include file="./init.jsp" %>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="coche.crud.sb.model.Conductor" %>
<%@page import="coche.crud.sb.model.Coche" %>
<%@page import="coche.crud.sb.service.ConductorLocalService" %>
<%@page import="coche.crud.sb.service.CocheLocalService" %>
<%
	ConductorLocalService conductorLocalService = (ConductorLocalService)renderRequest.getAttribute("conductorLocalService");
	long conductorId = ParamUtil.getLong(request,"conductorId", 0);
	Conductor conductor = null;
	if(conductorId>0){
		conductor = conductorLocalService.fetchConductor(conductorId);
	}
	if(conductor!=null){
		CocheLocalService cochesLocalService = (CocheLocalService)renderRequest.getAttribute("cocheLocalService");
		List<Coche> listadoCoches = cochesLocalService.getCoches(-1, -1);
	
%>
	<liferay-portlet:actionURL name="editConductor" var="editConductorURL">
		<liferay-portlet:param name="conductorId" value="<%=String.valueOf(conductorId) %>"/>
	</liferay-portlet:actionURL>
	<aui:form action="${editCocheURL}" method="post" name="fm">

		<aui:input type="text" name="nombre" label="nombre" value="<%=conductor.getNombre() %>" localized="false">
			<aui:validator name="maxLength">50</aui:validator>
		</aui:input>
		<aui:input type="text" name="apellido"  label="apellido" value="<%=conductor.getApellido() %>" localized="true">
			<aui:validator name="maxLength">50</aui:validator>
		</aui:input>
		
		<aui:select name="cocheSelect" id="cocheSelect" label="CocheId">
		<aui:validator name="required"></aui:validator>
		
			<% for (Coche coche : listadoCoches) { %>
				<aui:option value="<%=coche.getCocheId() %>" label="<%= String.valueOf(coche.getMarca()) %>"></aui:option>
			<% } %>			
		</aui:select>
		<liferay-ui-asset-categories-error />
		<liferay-ui-asset-tags-error />
		<aui:button-row>
			<aui:button name="submit" type="submit" value="save" />
		</aui:button-row>

	</aui:form>
<%}else{

		%>
		<div>NO SE HA ENCONTRADO CONDUCTOR</div>
		
	<%}%>