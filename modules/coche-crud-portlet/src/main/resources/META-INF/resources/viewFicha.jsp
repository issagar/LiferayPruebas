<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileEntry"%>
<%@page import="coche.crud.sb.model.Coche"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.dao.search.DisplayTerms"%>
<%@page import="com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.util.OrderByComparator"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="coche.crud.sb.model.Conductor"%>
<%@page import="coche.crud.sb.model.Coche"%>
<%@page import="coche.crud.sb.service.ConductorLocalService" %>
<%@page import="coche.crud.sb.service.CocheLocalService" %>

<%@ include file="./init.jsp" %>
<%
ConductorLocalService conductorLocalService = (ConductorLocalService)renderRequest.getAttribute("conductorLocalService");
CocheLocalService cochesLocalService = (CocheLocalService)renderRequest.getAttribute("cocheLocalService");
long conductorId = ParamUtil.getLong(request,"conductorId", 0);
 
Conductor conductor = conductorLocalService.fetchConductor(conductorId);
	
	long idImg = conductor.getFotoDniId();
	String ruta="";
if(idImg == 0){
	ruta="#";
}else{
	FileEntry imagen = DLAppLocalServiceUtil.getFileEntry(idImg);
	ruta = "/documents/"+ imagen.getRepositoryId()+"/"+imagen.getFolderId()+"/"+imagen.getTitle();
}

%>
<h2><liferay-ui:message key="cochecrud.caption"/></h2>

<liferay-portlet:renderURL var="addEditConductorURL">
	<liferay-portlet:param name="jspPage" value="/add-edit-conductor.jsp" />
</liferay-portlet:renderURL>

<liferay-portlet:renderURL var="editAddCocheURL">
	<liferay-portlet:param name="jspPage" value="/edit-add-Coche.jsp" />
</liferay-portlet:renderURL>
	
<liferay-portlet:renderURL var="viewConductoresURL">
	<liferay-portlet:param name="jspPage" value="/viewConductores.jsp" />
</liferay-portlet:renderURL>


<liferay-ui:icon-list>
        <liferay-ui:icon image="status_online" message="Nuevo Conductor" url="${addEditConductorURL}"/>
        <liferay-ui:icon image="add" message="Nuevo Coche" url="${editAddCocheURL}"/>
        <liferay-ui:icon image="view_articles" message="Ver conductores" url="${viewConductoresURL}"/>
</liferay-ui:icon-list>


	<liferay-portlet:actionURL name="editConductor" var="editConductorURL">
		<liferay-portlet:param name="conductorId" value="<%=String.valueOf(conductorId) %>"/>
	</liferay-portlet:actionURL>
	


<div class="container">
        <div class="row">
            <div class="col-12">
                <div class="card">

                    <div class="card-body">
                        <div class="card-title mb-4">
                            <div class="d-flex justify-content-start">
                                <div class="image-container">
                                
                                    <img src="<%= ruta %>" id="imgProfile" style="width: 150px; height: 150px" class="img-thumbnail" />
                                    <div class="middle">
                                        <input type="button" class="btn btn-secondary" id="btnChangePicture" value="Change" />
                                        <input type="file" style="display: none;" id="profilePicture" name="file" />
                                    </div>
                                </div>
                                <div class="userData ml-3">
                                    <h2 class="d-block" style="font-size: 1.5rem; font-weight: bold"><%=conductor.getNombre() %></h2>
                                </div>
                       
                            </div>
                        </div>


                                        <div class="row">
                                            <div class="col-sm-3 col-md-2 col-5">
                                                <label style="font-weight:bold;">Nombre</label>
                                            </div>
                                            <div class="col-md-8 col-6">
                                                <%=conductor.getNombre() %>
                                            </div>
                                        </div>
                                        <hr />

                                        <div class="row">
                                            <div class="col-sm-3 col-md-2 col-5">
                                                <label style="font-weight:bold;">Apellido</label>
                                            </div>
                                            <div class="col-md-8 col-6">
                                                <%=conductor.getApellido() %>
                                            </div>
                                        </div>
                                        <hr />
                                        
                                        
                                        <div class="row">
                                            <div class="col-sm-3 col-md-2 col-5">
                                                <label style="font-weight:bold;">Dni</label>
                                            </div>
                                            <div class="col-md-8 col-6">
                                                <%=conductor.getDni() %>
                                            </div>
                                        </div>
                                        <hr />
                                        	<%
													Coche coche = cochesLocalService.fetchCoche(conductor.getCocheId());
													String cocheMarca="";
													if (coche != null) {
														cocheMarca = coche.getMarca();
													}
		
		
												%>
                                        <div class="row">
                                            <div class="col-sm-3 col-md-2 col-5">
                                                <label style="font-weight:bold;">Coche</label>
                                            </div>
                                            <div class="col-md-8 col-6">
                                               <%=cocheMarca %>
                                            </div>
                                        </div>
                                        <hr />    
                              
                            
                     


                    </div>

                </div>
            </div>
        </div>
    </div>


