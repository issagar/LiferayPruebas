/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package coche.crud.sb.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;

import coche.crud.sb.exception.NoSuchConductorException;
import coche.crud.sb.model.Coche;
import coche.crud.sb.model.Conductor;
import coche.crud.sb.model.impl.CocheImpl;
import coche.crud.sb.model.impl.ConductorImpl;
import coche.crud.sb.service.base.ConductorLocalServiceBaseImpl;

/**
 * The implementation of the conductor local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link coche.crud.sb.service.ConductorLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ConductorLocalServiceBaseImpl
 * @see coche.crud.sb.service.ConductorLocalServiceUtil
 */
public class ConductorLocalServiceImpl extends ConductorLocalServiceBaseImpl {

	public void addConductor(long companyId, long userId, String userName, String nombre, String apellido, String dni,long fotoDniId, long cocheId) {
        final Conductor conductor = new ConductorImpl();
        conductor.setConductorId(counterLocalService.increment());
        conductor.setCompanyId(companyId);
        conductor.setUserId(userId);
        conductor.setUserName(userName);
        conductor.setNombre(nombre);
        conductor.setApellido(apellido);
        conductor.setDni(dni);
        conductor.setFotoDniId(fotoDniId);
        conductor.setCocheId(cocheId);
      
        addConductor(conductor);
    }
	
	public void updateConductor(long conductorId, String nombre, String apellido, Long cocheId) throws PortalException{
		
		final Conductor conductor= getConductor(conductorId);
		conductor.setNombre(nombre);
		conductor.setApellido(apellido);
		conductor.setCocheId(cocheId);

		updateConductor(conductor);
		
		
	}
	
	public Conductor findByDni(String dni) throws NoSuchConductorException {
		return conductorPersistence.findByDni(dni);
	}
	
	public Conductor fetchByDni(String dni) {
		return conductorPersistence.fetchByDni(dni);
	}
	
	public List<Conductor> findByCocheId(long CocheId){
		return conductorPersistence.findByCocheId(CocheId);
	}

	@Override
	public void addConductor(long companyId, long userId, String userName, String nombre, String apellido, String dni,
			Long cocheId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addConductor(long companyId, long userId, String userName, String nombre, String apellido, String dni,
			Long fotoDniId, Long cocheId) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}