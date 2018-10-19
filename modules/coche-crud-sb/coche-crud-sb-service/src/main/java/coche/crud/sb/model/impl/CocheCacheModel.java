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

import coche.crud.sb.model.Coche;

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
 * The cache model class for representing Coche in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Coche
 * @generated
 */
@ProviderType
public class CocheCacheModel implements CacheModel<Coche>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CocheCacheModel)) {
			return false;
		}

		CocheCacheModel cocheCacheModel = (CocheCacheModel)obj;

		if (CocheId == cocheCacheModel.CocheId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, CocheId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", CocheId=");
		sb.append(CocheId);
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
		sb.append(", marca=");
		sb.append(marca);
		sb.append(", modelo=");
		sb.append(modelo);
		sb.append(", precio=");
		sb.append(precio);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Coche toEntityModel() {
		CocheImpl cocheImpl = new CocheImpl();

		if (uuid == null) {
			cocheImpl.setUuid(StringPool.BLANK);
		}
		else {
			cocheImpl.setUuid(uuid);
		}

		cocheImpl.setCocheId(CocheId);
		cocheImpl.setCompanyId(companyId);
		cocheImpl.setUserId(userId);

		if (userName == null) {
			cocheImpl.setUserName(StringPool.BLANK);
		}
		else {
			cocheImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			cocheImpl.setCreateDate(null);
		}
		else {
			cocheImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			cocheImpl.setModifiedDate(null);
		}
		else {
			cocheImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (marca == null) {
			cocheImpl.setMarca(StringPool.BLANK);
		}
		else {
			cocheImpl.setMarca(marca);
		}

		if (modelo == null) {
			cocheImpl.setModelo(StringPool.BLANK);
		}
		else {
			cocheImpl.setModelo(modelo);
		}

		cocheImpl.setPrecio(precio);

		cocheImpl.resetOriginalValues();

		return cocheImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		CocheId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		marca = objectInput.readUTF();
		modelo = objectInput.readUTF();

		precio = objectInput.readDouble();
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

		objectOutput.writeLong(CocheId);

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

		if (marca == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(marca);
		}

		if (modelo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(modelo);
		}

		objectOutput.writeDouble(precio);
	}

	public String uuid;
	public long CocheId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String marca;
	public String modelo;
	public double precio;
}