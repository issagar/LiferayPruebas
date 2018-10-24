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

package coche.crud.sb.model.impl;

import aQute.bnd.annotation.ProviderType;

import coche.crud.sb.model.Conductor;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Conductor in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Conductor
 * @generated
 */
@ProviderType
public class ConductorCacheModel implements CacheModel<Conductor>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ConductorCacheModel)) {
			return false;
		}

		ConductorCacheModel conductorCacheModel = (ConductorCacheModel)obj;

		if (conductorId == conductorCacheModel.conductorId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, conductorId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", conductorId=");
		sb.append(conductorId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", nombre=");
		sb.append(nombre);
		sb.append(", apellido=");
		sb.append(apellido);
		sb.append(", dni=");
		sb.append(dni);
		sb.append(", cocheId=");
		sb.append(cocheId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Conductor toEntityModel() {
		ConductorImpl conductorImpl = new ConductorImpl();

		if (uuid == null) {
			conductorImpl.setUuid(StringPool.BLANK);
		}
		else {
			conductorImpl.setUuid(uuid);
		}

		conductorImpl.setConductorId(conductorId);
		conductorImpl.setCompanyId(companyId);
		conductorImpl.setUserId(userId);

		if (userName == null) {
			conductorImpl.setUserName(StringPool.BLANK);
		}
		else {
			conductorImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			conductorImpl.setCreateDate(null);
		}
		else {
			conductorImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			conductorImpl.setModifiedDate(null);
		}
		else {
			conductorImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (nombre == null) {
			conductorImpl.setNombre(StringPool.BLANK);
		}
		else {
			conductorImpl.setNombre(nombre);
		}

		if (apellido == null) {
			conductorImpl.setApellido(StringPool.BLANK);
		}
		else {
			conductorImpl.setApellido(apellido);
		}

		if (dni == null) {
			conductorImpl.setDni(StringPool.BLANK);
		}
		else {
			conductorImpl.setDni(dni);
		}

		conductorImpl.setCocheId(cocheId);

		conductorImpl.resetOriginalValues();

		return conductorImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		conductorId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		nombre = objectInput.readUTF();
		apellido = objectInput.readUTF();
		dni = objectInput.readUTF();

		cocheId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(conductorId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (nombre == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nombre);
		}

		if (apellido == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(apellido);
		}

		if (dni == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dni);
		}

		objectOutput.writeLong(cocheId);
	}

	public String uuid;
	public long conductorId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String nombre;
	public String apellido;
	public String dni;
	public long cocheId;
}