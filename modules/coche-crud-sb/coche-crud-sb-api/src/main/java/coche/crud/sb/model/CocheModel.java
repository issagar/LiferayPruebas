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
 * The base model interface for the Coche service. Represents a row in the &quot;Coches_Coche&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link coche.crud.sb.model.impl.CocheModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link coche.crud.sb.model.impl.CocheImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Coche
 * @see coche.crud.sb.model.impl.CocheImpl
 * @see coche.crud.sb.model.impl.CocheModelImpl
 * @generated
 */
@ProviderType
public interface CocheModel extends BaseModel<Coche>, ShardedModel,
	StagedAuditedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a coche model instance should use the {@link Coche} interface instead.
	 */

	/**
	 * Returns the primary key of this coche.
	 *
	 * @return the primary key of this coche
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this coche.
	 *
	 * @param primaryKey the primary key of this coche
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this coche.
	 *
	 * @return the uuid of this coche
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this coche.
	 *
	 * @param uuid the uuid of this coche
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the coche ID of this coche.
	 *
	 * @return the coche ID of this coche
	 */
	public long getCocheId();

	/**
	 * Sets the coche ID of this coche.
	 *
	 * @param CocheId the coche ID of this coche
	 */
	public void setCocheId(long CocheId);

	/**
	 * Returns the company ID of this coche.
	 *
	 * @return the company ID of this coche
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this coche.
	 *
	 * @param companyId the company ID of this coche
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this coche.
	 *
	 * @return the user ID of this coche
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this coche.
	 *
	 * @param userId the user ID of this coche
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this coche.
	 *
	 * @return the user uuid of this coche
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this coche.
	 *
	 * @param userUuid the user uuid of this coche
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this coche.
	 *
	 * @return the user name of this coche
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this coche.
	 *
	 * @param userName the user name of this coche
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this coche.
	 *
	 * @return the create date of this coche
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this coche.
	 *
	 * @param createDate the create date of this coche
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this coche.
	 *
	 * @return the modified date of this coche
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this coche.
	 *
	 * @param modifiedDate the modified date of this coche
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the marca of this coche.
	 *
	 * @return the marca of this coche
	 */
	@AutoEscape
	public String getMarca();

	/**
	 * Sets the marca of this coche.
	 *
	 * @param marca the marca of this coche
	 */
	public void setMarca(String marca);

	/**
	 * Returns the modelo of this coche.
	 *
	 * @return the modelo of this coche
	 */
	@AutoEscape
	public String getModelo();

	/**
	 * Sets the modelo of this coche.
	 *
	 * @param modelo the modelo of this coche
	 */
	public void setModelo(String modelo);

	/**
	 * Returns the precio of this coche.
	 *
	 * @return the precio of this coche
	 */
	public double getPrecio();

	/**
	 * Sets the precio of this coche.
	 *
	 * @param precio the precio of this coche
	 */
	public void setPrecio(double precio);

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
	public int compareTo(coche.crud.sb.model.Coche coche);

	@Override
	public int hashCode();

	@Override
	public CacheModel<coche.crud.sb.model.Coche> toCacheModel();

	@Override
	public coche.crud.sb.model.Coche toEscapedModel();

	@Override
	public coche.crud.sb.model.Coche toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}