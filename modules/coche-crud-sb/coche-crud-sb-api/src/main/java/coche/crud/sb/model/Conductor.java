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

package coche.crud.sb.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the Conductor service. Represents a row in the &quot;Coches_Conductor&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see ConductorModel
 * @see coche.crud.sb.model.impl.ConductorImpl
 * @see coche.crud.sb.model.impl.ConductorModelImpl
 * @generated
 */
@ImplementationClassName("coche.crud.sb.model.impl.ConductorImpl")
@ProviderType
public interface Conductor extends ConductorModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link coche.crud.sb.model.impl.ConductorImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Conductor, Long> CONDUCTOR_ID_ACCESSOR = new Accessor<Conductor, Long>() {
			@Override
			public Long get(Conductor conductor) {
				return conductor.getConductorId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Conductor> getTypeClass() {
				return Conductor.class;
			}
		};
}