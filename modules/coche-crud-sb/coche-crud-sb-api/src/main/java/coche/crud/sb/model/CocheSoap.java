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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link coche.crud.sb.service.http.CocheServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see coche.crud.sb.service.http.CocheServiceSoap
 * @generated
 */
@ProviderType
public class CocheSoap implements Serializable {
	public static CocheSoap toSoapModel(Coche model) {
		CocheSoap soapModel = new CocheSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setCocheId(model.getCocheId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setMarca(model.getMarca());
		soapModel.setModelo(model.getModelo());
		soapModel.setPrecio(model.getPrecio());

		return soapModel;
	}

	public static CocheSoap[] toSoapModels(Coche[] models) {
		CocheSoap[] soapModels = new CocheSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CocheSoap[][] toSoapModels(Coche[][] models) {
		CocheSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CocheSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CocheSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CocheSoap[] toSoapModels(List<Coche> models) {
		List<CocheSoap> soapModels = new ArrayList<CocheSoap>(models.size());

		for (Coche model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CocheSoap[soapModels.size()]);
	}

	public CocheSoap() {
	}

	public long getPrimaryKey() {
		return _CocheId;
	}

	public void setPrimaryKey(long pk) {
		setCocheId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getCocheId() {
		return _CocheId;
	}

	public void setCocheId(long CocheId) {
		_CocheId = CocheId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getMarca() {
		return _marca;
	}

	public void setMarca(String marca) {
		_marca = marca;
	}

	public String getModelo() {
		return _modelo;
	}

	public void setModelo(String modelo) {
		_modelo = modelo;
	}

	public double getPrecio() {
		return _precio;
	}

	public void setPrecio(double precio) {
		_precio = precio;
	}

	private String _uuid;
	private long _CocheId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _marca;
	private String _modelo;
	private double _precio;
}