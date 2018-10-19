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

package escritorSb.service.impl;

import escritorSb.service.base.EscritorLocalServiceBaseImpl;
import escritorSb.model.Escritor;
import escritorSb.model.impl.EscritorImpl;
/**
 * The implementation of the escritor local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link escritorSb.service.EscritorLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EscritorLocalServiceBaseImpl
 * @see escritorSb.service.EscritorLocalServiceUtil
 */
public class EscritorLocalServiceImpl extends EscritorLocalServiceBaseImpl {
	
	public void addEscritor(long groupId, long companyId, long userId, String userName, String nombre){
		
		final Escritor escritor = new EscritorImpl();
        escritor.setEscritorId(counterLocalService.increment());
        escritor.setGroupId(groupId);
        escritor.setCompanyId(companyId);
        escritor.setUserId(userId);
        escritor.setUserName(userName);
        escritor.setNombre(nombre);
        
        addEscritor(escritor);
	}
}