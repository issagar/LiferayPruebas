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

package escritorSb.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link LibroService}.
 *
 * @author Brian Wing Shun Chan
 * @see LibroService
 * @generated
 */
@ProviderType
public class LibroServiceWrapper implements LibroService,
	ServiceWrapper<LibroService> {
	public LibroServiceWrapper(LibroService libroService) {
		_libroService = libroService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _libroService.getOSGiServiceIdentifier();
	}

	@Override
	public LibroService getWrappedService() {
		return _libroService;
	}

	@Override
	public void setWrappedService(LibroService libroService) {
		_libroService = libroService;
	}

	private LibroService _libroService;
}