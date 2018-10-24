
<%@page import="coche.crud.sb.model.Coche" %>
<%@page import="coche.crud.sb.service.CocheLocalService" %>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="coche.crud.sb.model.Coche"%>
<%@page import="coche.crud.sb.service.CocheLocalService" %>

<%@ include file="./init.jsp" %>

	
<liferay-portlet:renderURL varImpl="iteratorURL">
	<liferay-portlet:param name="jspPage" value="/view.jsp"  />
</liferay-portlet:renderURL>

		<liferay-portlet:actionURL name="addCoche" var="addCocheURL" />
		<aui:form action="${addCocheURL}" method="post" name="fm">
		<aui:input type="text" name="marca" label="marca" value="" localized="false">
			<aui:validator name="maxLength">50</aui:validator>
		</aui:input>
		<aui:input type="text" name="modelo"  label="modelo" localized="true">
			<aui:validator name="maxLength">50</aui:validator>
		</aui:input>
		<aui:input type="number" name="precio" label="precio">
			<aui:validator name="digits"></aui:validator>
		</aui:input>
		<aui:button-row>
			<aui:button name="submit" type="submit" value="save" />
		</aui:button-row>
		</aui:form>
