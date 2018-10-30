package coche.crud.portlet.portlet;

import coche.crud.portlet.constants.CocheCrudPortletKeys;
import coche.crud.sb.service.CocheLocalServiceUtil;
import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.service.DLAppServiceUtil;
import com.liferay.document.library.kernel.service.DLFileEntryLocalService;
import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil;
import com.liferay.dynamic.data.mapping.kernel.DDMFormValues;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactory;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.PortletResponseUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.CharPool;
import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.kernel.util.MimeTypesUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.WebKeys;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.sql.Date;
import java.time.Instant;
import java.util.List;
import java.util.Map;

import javax.activation.MimetypesFileTypeMap;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import coche.crud.sb.model.Coche;
import coche.crud.sb.model.Conductor;
import coche.crud.sb.service.CocheLocalService;
import coche.crud.sb.service.ConductorLocalService;
import coche.crud.sb.service.ConductorLocalServiceUtil;


/**
 * @author migarcia
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + CocheCrudPortletKeys.CocheCrud,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class CocheCrudPortlet extends MVCPortlet {
	
		@Reference
		private CocheLocalService _cocheLocalService;
		
		@Reference
		private ConductorLocalService _conductorLocalService;
		
		@Reference
		private DLFileEntryLocalService _fileEntryLocalService;
		
		@Override
		public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException{
			renderRequest.setAttribute("cocheLocalService", _cocheLocalService);
			renderRequest.setAttribute("conductorLocalService", _conductorLocalService);
			super.render(renderRequest, renderResponse);
			
		}
		
		@ProcessAction(name="addCoche")
		public void addCoche(ActionRequest actionRequest, ActionResponse actionResponse){
			
			final ThemeDisplay theme= (ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
			String marca= ParamUtil.getString(actionRequest, "marca");
			String modelo = ParamUtil.getString(actionRequest, "modelo");
			Double precio = ParamUtil.getDouble(actionRequest, "precio");
			
			_cocheLocalService.addCoche(theme.getCompanyId(), theme.getUserId(), theme.getDoAsUserId(), marca, modelo,precio);
		}
    

		@ProcessAction(name="deleteCoche")
		public void deleteCoche(ActionRequest actionRequest, ActionResponse actionResponse){
			
			long cocheId = ParamUtil.getLong(actionRequest, "CocheId");
			
			Coche coche= _cocheLocalService.createCoche(cocheId);
			
			_cocheLocalService.deleteCoche(coche);
		}
		
		
		@ProcessAction(name="addEditCoche")
		public void addEditCoche(ActionRequest actionRequest, ActionResponse actionResponse){
			final ThemeDisplay theme= (ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
			long cocheId = ParamUtil.getLong(actionRequest, "CocheId", 0);
			Coche coche = null;
			coche = _cocheLocalService.fetchCoche(cocheId);
			String marca= ParamUtil.getString(actionRequest, "marca");
			String modelo = ParamUtil.getString(actionRequest, "modelo");
			Double precio = ParamUtil.getDouble(actionRequest, "precio");
			
			if(coche==null){
				_cocheLocalService.addCoche(theme.getCompanyId(), theme.getUserId(), theme.getDoAsUserId(), marca, modelo,precio);
			}
			if(coche!=null){
				try {
					_cocheLocalService.updateCoche(cocheId, marca, modelo, precio);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}			
			
		}
		
		@ProcessAction(name="addEditConductor")
		public void addEditConductor(ActionRequest actionRequest, ActionResponse actionResponse){
			final ThemeDisplay themeDisplay= (ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
			long conductorId = ParamUtil.getLong(actionRequest, "conductorId", 0);
			
			UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(actionRequest);
			
			Conductor conductor = _conductorLocalService.fetchConductor(conductorId);
			
			String nombre= ParamUtil.getString(actionRequest, "nombre");
			String apellido = ParamUtil.getString(actionRequest, "apellido");
			String dni = ParamUtil.getString(actionRequest, "dni");
			long idCoche= ParamUtil.getLong(actionRequest, "cocheSelect");
			//Date fechaNacimiento = ParamUtil.getDate(actionRequest, "fechaNacimiento");
			File ficheroImagen = uploadRequest.getFile("imagenDni");
			
			String fileName= uploadRequest.getFileName("imagenDni");
			String mimeType = uploadRequest.getContentType("imagenDni");
			String title = fileName;
			String description="subida fichero";
			long repositoryId = themeDisplay.getScopeGroupId();
			FileEntry file=null;
		
			try {
				ServiceContext serviceContext = ServiceContextFactory.getInstance(DLFileEntry.class.getName(), actionRequest);
				InputStream is= new FileInputStream(ficheroImagen);
				DLAppServiceUtil.addFileEntry(repositoryId, DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, fileName, mimeType, 
		    			title, description, "", is, ficheroImagen.length(), serviceContext);
				file = DLAppServiceUtil.getFileEntry(repositoryId, 0, title);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
					
					long idFileEntry = file.getFileEntryId();
					
					
	
			if(conductor==null){
				Conductor conductors = _conductorLocalService.fetchByDni(dni);
				
				
				if(conductors==null && validar(dni)==false){
					System.out.println("el id es "+ idFileEntry);
					_conductorLocalService.addConductor(themeDisplay.getCompanyId(), themeDisplay.getUserId(), themeDisplay.getDoAsUserId(), nombre, apellido, dni,idFileEntry, idCoche);
					
					actionResponse.setRenderParameter("mvcPath", "/viewConductores.jsp");
				}else{
					SessionErrors.add(actionRequest, "dni-exist");
					SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
					actionResponse.setRenderParameter("mvcPath", "/add-edit-conductor.jsp");
					
				}
			}
			if(conductor!=null){
				try {
					_conductorLocalService.updateConductor(conductorId, nombre, apellido, idCoche);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				actionResponse.setRenderParameter("mvcPath", "/viewConductores.jsp");
				
			}			
			
		}
		
		@ProcessAction(name="editCoche")
		public void editCoche(ActionRequest actionRequest, ActionResponse actionResponse){
			long cocheId = ParamUtil.getLong(actionRequest, "CocheId", 0);
			String marca= ParamUtil.getString(actionRequest, "marca");
			String modelo = ParamUtil.getString(actionRequest, "modelo");
			Double precio = ParamUtil.getDouble(actionRequest, "precio");

			try {
				_cocheLocalService.updateCoche(cocheId, marca, modelo, precio);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			actionResponse.setRenderParameter("mvcPath", "/view.jsp");
		}
		
		@ProcessAction(name="addConductor")
		public void addConductor(ActionRequest actionRequest, ActionResponse actionResponse){
			
			final ThemeDisplay theme= (ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
			String nombre= ParamUtil.getString(actionRequest, "nombre");
			String apellido = ParamUtil.getString(actionRequest, "apellido");
			String dni = ParamUtil.getString(actionRequest, "dni");
			Long idCoche= ParamUtil.getLong(actionRequest, "cocheSelect");
			
			Conductor conductor = _conductorLocalService.fetchByDni(dni);
				
			
			if(conductor==null && validar(dni)==false){
				_conductorLocalService.addConductor(theme.getCompanyId(), theme.getUserId(), theme.getDoAsUserId(), nombre, apellido, dni, idCoche);
				actionResponse.setRenderParameter("mvcPath", "/viewConductores.jsp");
			}else{
				SessionErrors.add(actionRequest, "dni-exist");
				SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
				actionResponse.setRenderParameter("mvcPath", "/addConductor.jsp");
				
			}

		}

		
		@ProcessAction(name="deleteConductor")
		public void deleteConductor(ActionRequest actionRequest, ActionResponse actionResponse){
			
			long conductorId = ParamUtil.getLong(actionRequest, "conductorId");
			
			Conductor conductor= _conductorLocalService.createConductor(conductorId);
			
			_conductorLocalService.deleteConductor(conductor);
			actionResponse.setRenderParameter("mvcPath", "/viewConductores.jsp");
		}
		
		@ProcessAction(name="editConductor")
		public void editConductor(ActionRequest actionRequest, ActionResponse actionResponse){
			long conductorId = ParamUtil.getLong(actionRequest, "conductorId", 0);
			String nombre= ParamUtil.getString(actionRequest, "nombre");
			String apellido = ParamUtil.getString(actionRequest, "apellido");
			long cocheId = ParamUtil.getLong(actionRequest, "cocheSelect");

			try {
				_conductorLocalService.updateConductor(conductorId, nombre, apellido, cocheId);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			actionResponse.setRenderParameter("mvcPath", "/viewConductores.jsp");
		}
		
		@Override
		public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
			
			String conductores= ParamUtil.getString(resourceRequest, "conductores");
			String listacoches = ParamUtil.getString(resourceRequest, "listacoches");
			String listacochesCSV = ParamUtil.getString(resourceRequest, "listacochesCSV");
			String listaconductoresCSV = ParamUtil.getString(resourceRequest, "listaconductoresCSV");
			
			
			if(conductores.equals("conductores")){
			final String conductor = ConductorLocalServiceUtil.getConductors(0, Integer.MAX_VALUE).toString();
			
	        final InputStream stream = new ByteArrayInputStream(conductor.getBytes(StandardCharsets.UTF_8));

	        PortletResponseUtil.sendFile(resourceRequest, resourceResponse, "conductor.txt", stream, ContentTypes.APPLICATION_TEXT);
			}
			
		
			if(listacoches.equals("coches")){
				final String coche= CocheLocalServiceUtil.getCoches(0, Integer.MAX_VALUE).toString();
				
		        final InputStream stream = new ByteArrayInputStream(coche.getBytes(StandardCharsets.UTF_8));

		        PortletResponseUtil.sendFile(resourceRequest, resourceResponse, "coche.txt", stream, ContentTypes.APPLICATION_TEXT);
			}
			
			if(listacochesCSV.equals("cochesCSV")){
			   String[] columnNames = { "CocheId", "CompanyId", "Marca","Modelo", "Precio" };
			   String CSV_SEPARATOR = ",";
				StringBundler sb = new StringBundler();
				for (String columnName : columnNames) {
					sb.append(getCSVFormattedValue(columnName));
					sb.append(CSV_SEPARATOR);
					}
					
					sb.setIndex(sb.index() - 1);
					sb.append(CharPool.NEW_LINE);
				
				List <Coche> cocheList = CocheLocalServiceUtil.getCoches(0, CocheLocalServiceUtil.getCochesCount());
					

				for (Coche coche : cocheList) {
					sb.append( getCSVFormattedValue(String.valueOf(coche.getCocheId())));
					sb.append(CSV_SEPARATOR);
					sb.append(getCSVFormattedValue(String.valueOf(coche.getCompanyId())));
					sb.append(CSV_SEPARATOR);
					sb.append(getCSVFormattedValue(String.valueOf(coche.getMarca())));
					sb.append(CSV_SEPARATOR);
					sb.append(getCSVFormattedValue(String.valueOf(coche.getModelo())));
					sb.append(CSV_SEPARATOR);
					sb.append(getCSVFormattedValue(String.valueOf(coche.getPrecio())));
					sb.append(CSV_SEPARATOR);
					sb.setIndex(sb.index() - 1);
					sb.append(CharPool.NEW_LINE);
					}

					String fileName = "cochesLista.csv";
					byte[] bytes = sb.toString().getBytes();
					String contentType = ContentTypes.APPLICATION_TEXT;
					PortletResponseUtil.sendFile(resourceRequest, resourceResponse, fileName, bytes, contentType);
					}
			
			if(listaconductoresCSV.equals("conductoresCSV")){
				
				   String[] columnNames = { "conductorId", "userId", "nombre","apellido", "dni", "CocheId" };
				   String CSV_SEPARATOR = ",";
					StringBundler sb = new StringBundler();
					for (String columnName : columnNames) {
						sb.append(getCSVFormattedValue(columnName));
						sb.append(CSV_SEPARATOR);
						}
						
						sb.setIndex(sb.index() - 1);
						sb.append(CharPool.NEW_LINE);
					
					List <Conductor> conductorList = ConductorLocalServiceUtil.getConductors(0, CocheLocalServiceUtil.getCochesCount());
						

					for (Conductor conductor : conductorList) {
						sb.append( getCSVFormattedValue(String.valueOf(conductor.getConductorId())));
						sb.append(CSV_SEPARATOR);
						sb.append(getCSVFormattedValue(String.valueOf(conductor.getUserId())));
						sb.append(CSV_SEPARATOR);
						sb.append(getCSVFormattedValue(String.valueOf(conductor.getNombre())));
						sb.append(CSV_SEPARATOR);
						sb.append(getCSVFormattedValue(String.valueOf(conductor.getApellido())));
						sb.append(CSV_SEPARATOR);
						sb.append(getCSVFormattedValue(String.valueOf(conductor.getDni())));
						sb.append(CSV_SEPARATOR);
						sb.append(getCSVFormattedValue(String.valueOf(conductor.getCocheId())));
						sb.append(CSV_SEPARATOR);
						sb.setIndex(sb.index() - 1);
						sb.append(CharPool.NEW_LINE);
						}

						String fileName = "conductorLista.csv";
						byte[] bytes = sb.toString().getBytes();
						String contentType = ContentTypes.APPLICATION_TEXT;
						PortletResponseUtil.sendFile(resourceRequest, resourceResponse, fileName, bytes, contentType);
						}
	
			
			super.serveResource(resourceRequest, resourceResponse);

		
		}
		
		
		protected String getCSVFormattedValue(String value) {
			
			StringBundler sb = new StringBundler(3);
			sb.append(CharPool.QUOTE);
			sb.append(StringUtil.replace(value, CharPool.QUOTE, StringPool.DOUBLE_QUOTE));
			sb.append(CharPool.QUOTE);
			return sb.toString();
		}
		
		public static boolean validar(String dni) {
			 
	        boolean esValido = false;
	        int i = 0;
	        int caracterASCII = 0;
	        char letra = ' ';
	        int miDNI = 0;
	        int resto = 0;
	        char[] asignacionLetra = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X','B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
	 
	 
	        if(dni.length() == 9 && Character.isLetter(dni.charAt(8))) {
	 
	            do {
	                caracterASCII = dni.codePointAt(i);
	                esValido = (caracterASCII > 47 && caracterASCII < 58);
	                i++;
	            } 
	            while(i < dni.length() - 1 && esValido);     
	        }
	 
	        if(esValido) {
	            letra = Character.toUpperCase(dni.charAt(8));
	            miDNI = Integer.parseInt(dni.substring(0,8));
	            resto = miDNI % 23;
	            esValido = (letra == asignacionLetra[resto]);
	        }
	 
	        return esValido;
	    }
		
}
			
		
