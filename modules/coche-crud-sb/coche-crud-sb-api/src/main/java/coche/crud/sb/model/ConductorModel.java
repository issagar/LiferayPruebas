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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Conductor service. Represents a row in the &quot;Coches_Conductor&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link coche.crud.sb.model.impl.ConductorModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link coche.crud.sb.model.impl.ConductorImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Conductor
 * @see coche.crud.sb.model.impl.ConductorImpl
 * @see coche.crud.sb.model.impl.ConductorModelImpl
 * @generated
 */
@ProviderType
public interface ConductorModel extends BaseModel<Conductor>, ShardedModel,
	StagedAuditedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a conductor model instance should use the {@link Conductor} interface instead.
	 */

	/**
	 * Returns the primary key of this conductor.
	 *
	 * @return the primary key of this conductor
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this conductor.
	 *
	 * @param primaryKey the primary key of this conductor
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this conductor.
	 *
	 * @return the uuid of this conductor
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this conductor.
	 *
	 * @param uuid the uuid of this conductor
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the conductor ID of this conductor.
	 *
	 * @return the conductor ID of this conductor
	 */
	public long getConductorId();

	/**
	 * Sets the conductor ID of this conductor.
	 *
	 * @param conductorId the conductor ID of this conductor
	 */
	public void setConductorId(long conductorId);

	/**
	 * Returns the company ID of this conductor.
	 *
	 * @return the company ID of this conductor
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this conductor.
	 *
	 * @param companyId the company ID of this conductor
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this conductor.
	 *
	 * @return the user ID of this conductor
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this conductor.
	 *
	 * @param userId the user ID of this conductor
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this conductor.
	 *
	 * @return the user uuid of this conductor
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this conductor.
	 *
	 * @param userUuid the user uuid of this conductor
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this conductor.
	 *
	 * @return the user name of this conductor
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this conductor.
	 *
	 * @param userName the user name of this conductor
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this conductor.
	 *
	 * @return the create date of this conductor
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this conductor.
	 *
	 * @param createDate the create date of this conductor
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this conductor.
	 *
	 * @return the modified date of this conductor
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this conductor.
	 *
	 * @param modifiedDate the modified date of this conductor
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the nombre of this conductor.
	 *
	 * @return the nombre of this conductor
	 */
	@AutoEscape
	public String getNombre();

	/**
	 * Sets the nombre of this conductor.
	 *
	 * @param nombre the nombre of this conductor
	 */
	public void setNombre(String nombre);

	/**
	 * Returns the apellido of this conductor.
	 *
	 * @return the apellido of this conductor
	 */
	@AutoEscape
	public String getApellido();

	/**
	 * Sets the apellido of this conductor.
	 *
	 * @param apellido the apellido of this conductor
	 */
	public void setApellido(String apellido);

	/**
	 * Returns the dni of this conductor.
	 *
	 * @return the dni of this conductor
	 */
	@AutoEscape
	public String getDni();

	/**
	 * Sets the dni of this conductor.
	 *
	 * @param dni the dni of this conductor
	 */
	public void setDni(String dni);

	/**
	 * Returns the coche ID of this conductor.
	 *
	 * @return the coche ID of this conductor
	 */
	public Long getCocheId();

	/**
	 * Sets the coche ID of this conductor.
	 *
	 * @param cocheId the coche ID of this conductor
	 */
	public void setCocheId(Long cocheId);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(coche.crud.sb.model.Conductor conductor);

	@Override
	public int hashCode();

	@Override
	public CacheModel<coche.crud.sb.model.Conductor> toCacheModel();

	@Override
	public coche.crud.sb.model.Conductor toEscapedModel();

	@Override
	public coche.crud.sb.model.Conductor toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}