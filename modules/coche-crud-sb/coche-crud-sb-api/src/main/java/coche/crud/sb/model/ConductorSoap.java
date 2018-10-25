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
 * This class is used by SOAP remote services, specifically {@link coche.crud.sb.service.http.ConductorServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see coche.crud.sb.service.http.ConductorServiceSoap
 * @generated
 */
@ProviderType
public class ConductorSoap implements Serializable {
	public static ConductorSoap toSoapModel(Conductor model) {
		ConductorSoap soapModel = new ConductorSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setConductorId(model.getConductorId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setNombre(model.getNombre());
		soapModel.setApellido(model.getApellido());
		soapModel.setDni(model.getDni());
		soapModel.setCocheId(model.getCocheId());

		return soapModel;
	}

	public static ConductorSoap[] toSoapModels(Conductor[] models) {
		ConductorSoap[] soapModels = new ConductorSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ConductorSoap[][] toSoapModels(Conductor[][] models) {
		ConductorSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ConductorSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ConductorSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ConductorSoap[] toSoapModels(List<Conductor> models) {
		List<ConductorSoap> soapModels = new ArrayList<ConductorSoap>(models.size());

		for (Conductor model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ConductorSoap[soapModels.size()]);
	}

	public ConductorSoap() {
	}

	public long getPrimaryKey() {
		return _conductorId;
	}

	public void setPrimaryKey(long pk) {
		setConductorId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getConductorId() {
		return _conductorId;
	}

	public void setConductorId(long conductorId) {
		_conductorId = conductorId;
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

	public String getNombre() {
		return _nombre;
	}

	public void setNombre(String nombre) {
		_nombre = nombre;
	}

	public String getApellido() {
		return _apellido;
	}

	public void setApellido(String apellido) {
		_apellido = apellido;
	}

	public String getDni() {
		return _dni;
	}

	public void setDni(String dni) {
		_dni = dni;
	}

	public long getCocheId() {
		return _cocheId;
	}

	public void setCocheId(long cocheId) {
		_cocheId = cocheId;
	}

	private String _uuid;
	private long _conductorId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _nombre;
	private String _apellido;
	private String _dni;
	private long _cocheId;
}