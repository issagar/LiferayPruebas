<%@ include file="./init.jsp" %>
<%@ page import="com.liferay.portal.kernel.util.WebKeys" %>
<%@ page import="com.liferay.taglib.search.ResultRow" %>
<%@ page import="escritorSb.model.Escritor;" %>
 
<%
    final ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
    final Escritor escritor = (Escritor) row.getObject();
%>
 
<portlet:actionURL name="displayEscritorEdition" var="displayEscritorEditionUrl">
    <portlet:param name="idEscritor" value="<%=String.valueOf(escritor.getEscritorId())%>"/>
</portlet:actionURL>
 
<liferay-ui:icon-menu>
    <liferay-ui:icon image="edit" message="Editar" url="<%=displayEscritorEditionUrl%>"/>
</liferay-ui:icon-menu>