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

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Conductor}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Conductor
 * @generated
 */
@ProviderType
public class ConductorWrapper implements Conductor, ModelWrapper<Conductor> {
	public ConductorWrapper(Conductor conductor) {
		_conductor = conductor;
	}

	@Override
	public Class<?> getModelClass() {
		return Conductor.class;
	}

	@Override
	public String getModelClassName() {
		return Conductor.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("conductorId", getConductorId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("nombre", getNombre());
		attributes.put("apellido", getApellido());
		attributes.put("dni", getDni());
		attributes.put("cocheId", getCocheId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long conductorId = (Long)attributes.get("conductorId");

		if (conductorId != null) {
			setConductorId(conductorId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String nombre = (String)attributes.get("nombre");

		if (nombre != null) {
			setNombre(nombre);
		}

		String apellido = (String)attributes.get("apellido");

		if (apellido != null) {
			setApellido(apellido);
		}

		String dni = (String)attributes.get("dni");

		if (dni != null) {
			setDni(dni);
		}

		Long cocheId = (Long)attributes.get("cocheId");

		if (cocheId != null) {
			setCocheId(cocheId);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _conductor.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _conductor.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _conductor.isNew();
	}

	@Override
	public coche.crud.sb.model.Conductor toEscapedModel() {
		return new ConductorWrapper(_conductor.toEscapedModel());
	}

	@Override
	public coche.crud.sb.model.Conductor toUnescapedModel() {
		return new ConductorWrapper(_conductor.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _conductor.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<coche.crud.sb.model.Conductor> toCacheModel() {
		return _conductor.toCacheModel();
	}

	@Override
	public int compareTo(coche.crud.sb.model.Conductor conductor) {
		return _conductor.compareTo(conductor);
	}

	@Override
	public int hashCode() {
		return _conductor.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _conductor.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new ConductorWrapper((Conductor)_conductor.clone());
	}

	/**
	* Returns the apellido of this conductor.
	*
	* @return the apellido of this conductor
	*/
	@Override
	public java.lang.String getApellido() {
		return _conductor.getApellido();
	}

	/**
	* Returns the dni of this conductor.
	*
	* @return the dni of this conductor
	*/
	@Override
	public java.lang.String getDni() {
		return _conductor.getDni();
	}

	/**
	* Returns the nombre of this conductor.
	*
	* @return the nombre of this conductor
	*/
	@Override
	public java.lang.String getNombre() {
		return _conductor.getNombre();
	}

	/**
	* Returns the user name of this conductor.
	*
	* @return the user name of this conductor
	*/
	@Override
	public java.lang.String getUserName() {
		return _conductor.getUserName();
	}

	/**
	* Returns the user uuid of this conductor.
	*
	* @return the user uuid of this conductor
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _conductor.getUserUuid();
	}

	/**
	* Returns the uuid of this conductor.
	*
	* @return the uuid of this conductor
	*/
	@Override
	public java.lang.String getUuid() {
		return _conductor.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _conductor.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _conductor.toXmlString();
	}

	/**
	* Returns the create date of this conductor.
	*
	* @return the create date of this conductor
	*/
	@Override
	public Date getCreateDate() {
		return _conductor.getCreateDate();
	}

	/**
	* Returns the modified date of this conductor.
	*
	* @return the modified date of this conductor
	*/
	@Override
	public Date getModifiedDate() {
		return _conductor.getModifiedDate();
	}

	/**
	* Returns the coche ID of this conductor.
	*
	* @return the coche ID of this conductor
	*/
	@Override
	public long getCocheId() {
		return _conductor.getCocheId();
	}

	/**
	* Returns the company ID of this conductor.
	*
	* @return the company ID of this conductor
	*/
	@Override
	public long getCompanyId() {
		return _conductor.getCompanyId();
	}

	/**
	* Returns the conductor ID of this conductor.
	*
	* @return the conductor ID of this conductor
	*/
	@Override
	public long getConductorId() {
		return _conductor.getConductorId();
	}

	/**
	* Returns the primary key of this conductor.
	*
	* @return the primary key of this conductor
	*/
	@Override
	public long getPrimaryKey() {
		return _conductor.getPrimaryKey();
	}

	/**
	* Returns the user ID of this conductor.
	*
	* @return the user ID of this conductor
	*/
	@Override
	public long getUserId() {
		return _conductor.getUserId();
	}

	@Override
	public void persist() {
		_conductor.persist();
	}

	/**
	* Sets the apellido of this conductor.
	*
	* @param apellido the apellido of this conductor
	*/
	@Override
	public void setApellido(java.lang.String apellido) {
		_conductor.setApellido(apellido);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_conductor.setCachedModel(cachedModel);
	}

	/**
	* Sets the coche ID of this conductor.
	*
	* @param cocheId the coche ID of this conductor
	*/
	@Override
	public void setCocheId(long cocheId) {
		_conductor.setCocheId(cocheId);
	}

	/**
	* Sets the company ID of this conductor.
	*
	* @param companyId the company ID of this conductor
	*/
	@Override
	public void setCompanyId(long companyId) {
		_conductor.setCompanyId(companyId);
	}

	/**
	* Sets the conductor ID of this conductor.
	*
	* @param conductorId the conductor ID of this conductor
	*/
	@Override
	public void setConductorId(long conductorId) {
		_conductor.setConductorId(conductorId);
	}

	/**
	* Sets the create date of this conductor.
	*
	* @param createDate the create date of this conductor
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_conductor.setCreateDate(createDate);
	}

	/**
	* Sets the dni of this conductor.
	*
	* @param dni the dni of this conductor
	*/
	@Override
	public void setDni(java.lang.String dni) {
		_conductor.setDni(dni);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_conductor.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_conductor.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_conductor.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the modified date of this conductor.
	*
	* @param modifiedDate the modified date of this conductor
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_conductor.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_conductor.setNew(n);
	}

	/**
	* Sets the nombre of this conductor.
	*
	* @param nombre the nombre of this conductor
	*/
	@Override
	public void setNombre(java.lang.String nombre) {
		_conductor.setNombre(nombre);
	}

	/**
	* Sets the primary key of this conductor.
	*
	* @param primaryKey the primary key of this conductor
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_conductor.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_conductor.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this conductor.
	*
	* @param userId the user ID of this conductor
	*/
	@Override
	public void setUserId(long userId) {
		_conductor.setUserId(userId);
	}

	/**
	* Sets the user name of this conductor.
	*
	* @param userName the user name of this conductor
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_conductor.setUserName(userName);
	}

	/**
	* Sets the user uuid of this conductor.
	*
	* @param userUuid the user uuid of this conductor
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_conductor.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this conductor.
	*
	* @param uuid the uuid of this conductor
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_conductor.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ConductorWrapper)) {
			return false;
		}

		ConductorWrapper conductorWrapper = (ConductorWrapper)obj;

		if (Objects.equals(_conductor, conductorWrapper._conductor)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _conductor.getStagedModelType();
	}

	@Override
	public Conductor getWrappedModel() {
		return _conductor;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _conductor.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _conductor.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_conductor.resetOriginalValues();
	}

	private final Conductor _conductor;
}