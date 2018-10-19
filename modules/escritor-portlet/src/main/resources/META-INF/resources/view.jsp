
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
 
<%@ include file="./init.jsp" %>
 
<portlet:actionURL name="addEscritor" var="addEscritorUrl"/>
 
<aui:form action="${addEscritorUrl}">
    <aui:input name="nombreEscritor" type="textarea" label="Escribe aquí el nombre del escritor:"/>
    <aui:button name="addEscritorButton" type="submit" value="Crear escritor"/>
</aui:form>

<jsp:useBean id="escritores" type="java.util.List<escritorSb.model.Escritor>" scope="request"/>
 
<liferay-ui:search-container emptyResultsMessage="No has creado todavía ningún escritor.">
    <liferay-ui:search-container-results results="${escritores}"/>
 
    <liferay-ui:search-container-row className="escritorSb.model.Escritor" modelVar="escritor">
        <liferay-ui:search-container-column-text name="Nombre" property="nombre"/>
    </liferay-ui:search-container-row>
    <liferay-ui:search-container-row className="escritorSb.model.Escritor" modelVar="escritor">
	    <liferay-ui:search-container-column-text name="Nombre" property="nombre"/>
	    <liferay-ui:search-container-column-jsp name="Editar" path="/escritorActionButtons.jsp"/>
	</liferay-ui:search-container-row>
 
    <liferay-ui:search-iterator/>
</liferay-ui:search-container>