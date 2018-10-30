<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="coche.crud.sb.model.Coche" %>
<%@page import="coche.crud.sb.model.Conductor" %>
<%@page import="coche.crud.sb.service.CocheLocalService" %>
<%@page import="coche.crud.sb.service.ConductorLocalService" %>
<%@ include file="./init.jsp" %>

<liferay-portlet:renderURL varImpl="iteratorURL">
	<liferay-portlet:param name="jspPage" value="/viewConductores.jsp"  />
</liferay-portlet:renderURL>

<%

ConductorLocalService conductorLocalService = (ConductorLocalService)renderRequest.getAttribute("conductorLocalService");
CocheLocalService cochesLocalService = (CocheLocalService)renderRequest.getAttribute("cocheLocalService");
List<Coche> listadoCoches = listadoCoches = cochesLocalService.getCoches(-1, -1);
String nombre = "";
String apellido = "";
String dni = "";

long conductorId = ParamUtil.getLong(request,"conductorId", 0);
Conductor conductor = null;

if(conductorId>0){
	conductor = conductorLocalService.fetchConductor(conductorId);
}
if(conductor!=null){
	
	Coche cocheEditar = cochesLocalService.fetchCoche(conductor.getCocheId());
	nombre = conductor.getNombre();
	apellido = conductor.getApellido();
	dni = conductor.getDni();
	System.out.println("conductor recibe el id para poder ser editado");
}

if(conductor==null){
	nombre = "";
	apellido = "";
	dni = "";
	System.out.println("conductor no tiene nada. Es para crear uno nuevo");
}

%>

		<liferay-portlet:actionURL name="addEditConductor" var="addEditConductorURL" >
		<liferay-portlet:param name="conductorId" value="<%=String.valueOf(conductorId) %>"/>
	    </liferay-portlet:actionURL>
		<aui:form action="${addEditConductorURL}" method="post" name="fm" enctype="multipart/form-data">
		<aui:input type="text" name="nombre" label="Nombre" value="<%=nombre %>" localized="false">
			<aui:validator name="maxLength">50</aui:validator>
			<aui:validator name="required"></aui:validator>
		</aui:input>
		<aui:input type="text" name="apellido"  label="Apellido" value="<%=apellido %>" localized="true">
			<aui:validator name="maxLength">50</aui:validator>
			<aui:validator name="required"></aui:validator>
		</aui:input>
		<aui:input type="file" name="imagenDni" label = "Foto dni" size="75"/>
		<aui:input type="text" name="dni" label="dni" value="<%=dni %>">
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