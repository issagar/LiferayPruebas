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
 * This class is a wrapper for {@link Coche}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Coche
 * @generated
 */
@ProviderType
public class CocheWrapper implements Coche, ModelWrapper<Coche> {
	public CocheWrapper(Coche coche) {
		_coche = coche;
	}

	@Override
	public Class<?> getModelClass() {
		return Coche.class;
	}

	@Override
	public String getModelClassName() {
		return Coche.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("CocheId", getCocheId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("marca", getMarca());
		attributes.put("modelo", getModelo());
		attributes.put("precio", getPrecio());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long CocheId = (Long)attributes.get("CocheId");

		if (CocheId != null) {
			setCocheId(CocheId);
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

		String marca = (String)attributes.get("marca");

		if (marca != null) {
			setMarca(marca);
		}

		String modelo = (String)attributes.get("modelo");

		if (modelo != null) {
			setModelo(modelo);
		}

		Double precio = (Double)attributes.get("precio");

		if (precio != null) {
			setPrecio(precio);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _coche.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _coche.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _coche.isNew();
	}

	@Override
	public coche.crud.sb.model.Coche toEscapedModel() {
		return new CocheWrapper(_coche.toEscapedModel());
	}

	@Override
	public coche.crud.sb.model.Coche toUnescapedModel() {
		return new CocheWrapper(_coche.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _coche.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<coche.crud.sb.model.Coche> toCacheModel() {
		return _coche.toCacheModel();
	}

	@Override
	public int compareTo(coche.crud.sb.model.Coche coche) {
		return _coche.compareTo(coche);
	}

	@Override
	public int hashCode() {
		return _coche.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _coche.getPrimaryKeyObj();
	}

	/**
	* Returns the precio of this coche.
	*
	* @return the precio of this coche
	*/
	@Override
	public java.lang.Double getPrecio() {
		return _coche.getPrecio();
	}

	@Override
	public java.lang.Object clone() {
		return new CocheWrapper((Coche)_coche.clone());
	}

	/**
	* Returns the marca of this coche.
	*
	* @return the marca of this coche
	*/
	@Override
	public java.lang.String getMarca() {
		return _coche.getMarca();
	}

	/**
	* Returns the modelo of this coche.
	*
	* @return the modelo of this coche
	*/
	@Override
	public java.lang.String getModelo() {
		return _coche.getModelo();
	}

	/**
	* Returns the user name of this coche.
	*
	* @return the user name of this coche
	*/
	@Override
	public java.lang.String getUserName() {
		return _coche.getUserName();
	}

	/**
	* Returns the user uuid of this coche.
	*
	* @return the user uuid of this coche
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _coche.getUserUuid();
	}

	/**
	* Returns the uuid of this coche.
	*
	* @return the uuid of this coche
	*/
	@Override
	public java.lang.String getUuid() {
		return _coche.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _coche.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _coche.toXmlString();
	}

	/**
	* Returns the create date of this coche.
	*
	* @return the create date of this coche
	*/
	@Override
	public Date getCreateDate() {
		return _coche.getCreateDate();
	}

	/**
	* Returns the modified date of this coche.
	*
	* @return the modified date of this coche
	*/
	@Override
	public Date getModifiedDate() {
		return _coche.getModifiedDate();
	}

	/**
	* Returns the coche ID of this coche.
	*
	* @return the coche ID of this coche
	*/
	@Override
	public long getCocheId() {
		return _coche.getCocheId();
	}

	/**
	* Returns the company ID of this coche.
	*
	* @return the company ID of this coche
	*/
	@Override
	public long getCompanyId() {
		return _coche.getCompanyId();
	}

	/**
	* Returns the primary key of this coche.
	*
	* @return the primary key of this coche
	*/
	@Override
	public long getPrimaryKey() {
		return _coche.getPrimaryKey();
	}

	/**
	* Returns the user ID of this coche.
	*
	* @return the user ID of this coche
	*/
	@Override
	public long getUserId() {
		return _coche.getUserId();
	}

	@Override
	public void persist() {
		_coche.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_coche.setCachedModel(cachedModel);
	}

	/**
	* Sets the coche ID of this coche.
	*
	* @param CocheId the coche ID of this coche
	*/
	@Override
	public void setCocheId(long CocheId) {
		_coche.setCocheId(CocheId);
	}

	/**
	* Sets the company ID of this coche.
	*
	* @param companyId the company ID of this coche
	*/
	@Override
	public void setCompanyId(long companyId) {
		_coche.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this coche.
	*
	* @param createDate the create date of this coche
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_coche.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_coche.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_coche.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_coche.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the marca of this coche.
	*
	* @param marca the marca of this coche
	*/
	@Override
	public void setMarca(java.lang.String marca) {
		_coche.setMarca(marca);
	}

	/**
	* Sets the modelo of this coche.
	*
	* @param modelo the modelo of this coche
	*/
	@Override
	public void setModelo(java.lang.String modelo) {
		_coche.setModelo(modelo);
	}

	/**
	* Sets the modified date of this coche.
	*
	* @param modifiedDate the modified date of this coche
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_coche.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_coche.setNew(n);
	}

	/**
	* Sets the precio of this coche.
	*
	* @param precio the precio of this coche
	*/
	@Override
	public void setPrecio(java.lang.Double precio) {
		_coche.setPrecio(precio);
	}

	/**
	* Sets the primary key of this coche.
	*
	* @param primaryKey the primary key of this coche
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_coche.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_coche.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this coche.
	*
	* @param userId the user ID of this coche
	*/
	@Override
	public void setUserId(long userId) {
		_coche.setUserId(userId);
	}

	/**
	* Sets the user name of this coche.
	*
	* @param userName the user name of this coche
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_coche.setUserName(userName);
	}

	/**
	* Sets the user uuid of this coche.
	*
	* @param userUuid the user uuid of this coche
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_coche.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this coche.
	*
	* @param uuid the uuid of this coche
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_coche.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CocheWrapper)) {
			return false;
		}

		CocheWrapper cocheWrapper = (CocheWrapper)obj;

		if (Objects.equals(_coche, cocheWrapper._coche)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _coche.getStagedModelType();
	}

	@Override
	public Coche getWrappedModel() {
		return _coche;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _coche.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _coche.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_coche.resetOriginalValues();
	}

	private final Coche _coche;
}