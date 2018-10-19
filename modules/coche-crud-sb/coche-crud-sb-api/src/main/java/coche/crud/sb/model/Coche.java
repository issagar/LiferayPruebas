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
 * The extended model interface for the Coche service. Represents a row in the &quot;Coches_Coche&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see CocheModel
 * @see coche.crud.sb.model.impl.CocheImpl
 * @see coche.crud.sb.model.impl.CocheModelImpl
 * @generated
 */
@ImplementationClassName("coche.crud.sb.model.impl.CocheImpl")
@ProviderType
public interface Coche extends CocheModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link coche.crud.sb.model.impl.CocheImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Coche, Long> COCHE_ID_ACCESSOR = new Accessor<Coche, Long>() {
			@Override
			public Long get(Coche coche) {
				return coche.getCocheId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Coche> getTypeClass() {
				return Coche.class;
			}
		};
}