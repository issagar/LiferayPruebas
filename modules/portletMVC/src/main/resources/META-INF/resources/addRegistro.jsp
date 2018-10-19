<%@ include file="init.jsp" %>

<h1>Nuevo registro</h1>

<liferay-portlet:actionURL var="addRegistroFormURL" name="addRegistro">
</liferay-portlet:actionURL>

<form action="${addRegistroFormURL}" method="post">
    <div>
        <label for="<portlet:namespace/>nombre">Nombre</label>
        <input type="text" name="<portlet:namespace/>nombre" id="<portlet:namespace/>nombre" />
    </div>
    <div>
        <label for="<portlet:namespace/>email">Email</label>
        <input type="text" name="<portlet:namespace/>email" id="<portlet:namespace/>email" />
    </div>
    <div>
        <input type="submit" value="Enviar" />
    </div>
</form>



<!--  
<aui:form action="${addRegistroFormUrl}">
	<aui:input type="text" name="nombre" label="Nombre" />
	<aui:input type="text" name="email" label="Email" />
	<aui:input type="password" name="password" label="Password" />
	<aui:button type="submit" value="Enviar" />

</aui:form>
-->