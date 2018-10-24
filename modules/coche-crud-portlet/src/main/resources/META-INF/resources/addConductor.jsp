<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="coche.crud.sb.model.Coche" %>
<%@page import="coche.crud.sb.service.CocheLocalService" %>
<%@ include file="./init.jsp" %>

<%
CocheLocalService cochesLocalService = (CocheLocalService)renderRequest.getAttribute("cocheLocalService");
List<Coche> listadoCoches = cochesLocalService.getCoches(-1, -1);
%>
<liferay-portlet:renderURL varImpl="iteratorURL">
	<liferay-portlet:param name="jspPage" value="/viewConductores.jsp"  />
</liferay-portlet:renderURL>

		<liferay-portlet:actionURL name="addConductor" var="addConductorURL" />
		<aui:form action="${addConductorURL}" method="post" name="fm">
		<aui:input type="text" name="nombre" label="Nombre" value="" localized="false">
			<aui:validator name="maxLength">50</aui:validator>
		</aui:input>
		<aui:input type="text" name="apellido"  label="apellido" localized="true">
			<aui:validator name="maxLength">50</aui:validator>
		</aui:input>
		<aui:input type="text" name="dni" label="dni">
			<aui:validator name="maxLength">9</aui:validator>
			<aui:validator name="custom" errorMessage="Introduce un formato correcto">
			function (val, fieldNode, ruleValue) {
				var numero, let, letra;
    			var expresion_regular_dni = /^[XYZ]?\d{5,8}[A-Z]$/;
    			val= val.toUpperCase();

			   	 if(expresion_regular_dni.test(val) === true){
			        numero = val.substr(0,val.length-1);
			        numero = numero.replace('X', 0);
			        numero = numero.replace('Y', 1);
			        numero = numero.replace('Z', 2);
			        let = dni.substr(val.length-1, 1);
			        numero = numero % 23;
			        letra = 'TRWAGMYFPDXBNJZSQVHLCKET';
			        letra = letra.substring(numero, numero+1);
			        if (letra != let) {
			            return false;
			        }else{
			            return true;
			        }
			    }else{
			        return false;
			    }
			  }
				
</aui:validator>
		</aui:input>
		
		<aui:select name="cocheSelect" id="cocheSelect" label="CocheId">
		<aui:validator name="required"></aui:validator>
		
			<% for (Coche coche : listadoCoches) { %>
				<aui:option value="<%=coche.getCocheId() %>" label="<%= String.valueOf(coche.getMarca()) %>"></aui:option>
			<% } %>			
		</aui:select>
		<aui:button-row>
			<aui:button name="submit" type="submit" value="save" />
		</aui:button-row>
		</aui:form>
