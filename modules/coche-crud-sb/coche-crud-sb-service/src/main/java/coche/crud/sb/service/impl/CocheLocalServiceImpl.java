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

import com.liferay.portal.kernel.exception.PortalException;

import coche.crud.sb.model.Coche;
import coche.crud.sb.model.impl.CocheImpl;
import coche.crud.sb.service.base.CocheLocalServiceBaseImpl;

/**
 * The implementation of the coche local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link coche.crud.sb.service.CocheLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CocheLocalServiceBaseImpl
 * @see coche.crud.sb.service.CocheLocalServiceUtil
 */
public class CocheLocalServiceImpl extends CocheLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link coche.crud.sb.service.CocheLocalServiceUtil} to access the coche local service.
	 */
	
	public void addCoche(long companyId, long userId, String userName, String marca, String modelo, Double precio) {
        final Coche coche = new CocheImpl();
        coche.setCocheId(counterLocalService.increment());
        coche.setCompanyId(companyId);
        coche.setUserId(userId);
        coche.setUserName(userName);
        coche.setMarca(marca);
        coche.setModelo(modelo);
        coche.setPrecio(precio);
        
 
        addCoche(coche);
    }
	
	public void updateCoche(long cocheId, String marca, String modelo, Double precio) throws PortalException{
		
		final Coche coche= getCoche(cocheId);
		coche.setMarca(marca);
		coche.setModelo(modelo);
		coche.setPrecio(precio);
		
		updateCoche(coche);
		
		
	}


	@Override
	public void addCoche(long groupId, long companyId, long userId, String userName, String marca, String modelo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addCoche(long groupId, long companyId, long userId, String userName, String nombre) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void addCoche(long groupId, long companyId, long userId, String userName, String marca, String modelo,
			Double precio) {
		// TODO Auto-generated method stub
		
	}
}