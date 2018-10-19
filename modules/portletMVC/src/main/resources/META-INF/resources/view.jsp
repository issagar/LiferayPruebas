<%@ include file="init.jsp" %>
<%@ page import="com.liferay.portal.kernel.log.LogFactoryUtil" %>
<%@ page import="com.liferay.portal.kernel.log.Log" %>
<%
	_log.debug("Se ejecuta el jsp");
%>

<liferay-portlet:renderURL var="addRegistroURL" >
	<liferay-portlet:param name="jspPage" value="/addRegistro.jsp" />
</liferay-portlet:renderURL>
<liferay-portlet:resourceURL var="downloadURL" id="download" />

<a href="${addRegistroURL}" title="Nuevo registro" class="btn btn-primary">
	Nuevo registro
</a>

<a href="${downloadURL}" title="Descarga fichero">Download</a>









<%!
	private static Log _log = LogFactoryUtil.getLog("portletmvc.portlet.view_jsp");
%>