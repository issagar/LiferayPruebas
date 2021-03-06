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
import coche.crud.sb.model.ConductorModel;
import coche.crud.sb.model.ConductorSoap;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Conductor service. Represents a row in the &quot;Coches_Conductor&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link ConductorModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ConductorImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ConductorImpl
 * @see Conductor
 * @see ConductorModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class ConductorModelImpl extends BaseModelImpl<Conductor>
	implements ConductorModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a conductor model instance should use the {@link Conductor} interface instead.
	 */
	public static final String TABLE_NAME = "Coches_Conductor";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "conductorId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "nombre", Types.VARCHAR },
			{ "apellido", Types.VARCHAR },
			{ "dni", Types.VARCHAR },
			{ "fechaNacimiento", Types.TIMESTAMP },
			{ "fotoDniId", Types.BIGINT },
			{ "cocheId", Types.BIGINT }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("conductorId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("nombre", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("apellido", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("dni", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("fechaNacimiento", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("fotoDniId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("cocheId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE = "create table Coches_Conductor (uuid_ VARCHAR(75) null,conductorId LONG not null primary key,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,nombre VARCHAR(75) null,apellido VARCHAR(75) null,dni VARCHAR(75) null,fechaNacimiento DATE null,fotoDniId LONG,cocheId LONG)";
	public static final String TABLE_SQL_DROP = "drop table Coches_Conductor";
	public static final String ORDER_BY_JPQL = " ORDER BY conductor.apellido ASC";
	public static final String ORDER_BY_SQL = " ORDER BY Coches_Conductor.apellido ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(coche.crud.sb.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.coche.crud.sb.model.Conductor"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(coche.crud.sb.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.coche.crud.sb.model.Conductor"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(coche.crud.sb.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.coche.crud.sb.model.Conductor"),
			true);
	public static final long COCHEID_COLUMN_BITMASK = 1L;
	public static final long COMPANYID_COLUMN_BITMASK = 2L;
	public static final long DNI_COLUMN_BITMASK = 4L;
	public static final long UUID_COLUMN_BITMASK = 8L;
	public static final long APELLIDO_COLUMN_BITMASK = 16L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Conductor toModel(ConductorSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Conductor model = new ConductorImpl();

		model.setUuid(soapModel.getUuid());
		model.setConductorId(soapModel.getConductorId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setNombre(soapModel.getNombre());
		model.setApellido(soapModel.getApellido());
		model.setDni(soapModel.getDni());
		model.setFechaNacimiento(soapModel.getFechaNacimiento());
		model.setFotoDniId(soapModel.getFotoDniId());
		model.setCocheId(soapModel.getCocheId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Conductor> toModels(ConductorSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Conductor> models = new ArrayList<Conductor>(soapModels.length);

		for (ConductorSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(coche.crud.sb.service.util.ServiceProps.get(
				"lock.expiration.time.coche.crud.sb.model.Conductor"));

	public ConductorModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _conductorId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setConductorId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _conductorId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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
		attributes.put("fechaNacimiento", getFechaNacimiento());
		attributes.put("fotoDniId", getFotoDniId());
		attributes.put("cocheId", getCocheId());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

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

		Date fechaNacimiento = (Date)attributes.get("fechaNacimiento");

		if (fechaNacimiento != null) {
			setFechaNacimiento(fechaNacimiento);
		}

		Long fotoDniId = (Long)attributes.get("fotoDniId");

		if (fotoDniId != null) {
			setFotoDniId(fotoDniId);
		}

		Long cocheId = (Long)attributes.get("cocheId");

		if (cocheId != null) {
			setCocheId(cocheId);
		}
	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return StringPool.BLANK;
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@JSON
	@Override
	public long getConductorId() {
		return _conductorId;
	}

	@Override
	public void setConductorId(long conductorId) {
		_conductorId = conductorId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return StringPool.BLANK;
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public String getNombre() {
		if (_nombre == null) {
			return StringPool.BLANK;
		}
		else {
			return _nombre;
		}
	}

	@Override
	public void setNombre(String nombre) {
		_nombre = nombre;
	}

	@JSON
	@Override
	public String getApellido() {
		if (_apellido == null) {
			return StringPool.BLANK;
		}
		else {
			return _apellido;
		}
	}

	@Override
	public void setApellido(String apellido) {
		_columnBitmask = -1L;

		_apellido = apellido;
	}

	@JSON
	@Override
	public String getDni() {
		if (_dni == null) {
			return StringPool.BLANK;
		}
		else {
			return _dni;
		}
	}

	@Override
	public void setDni(String dni) {
		_columnBitmask |= DNI_COLUMN_BITMASK;

		if (_originalDni == null) {
			_originalDni = _dni;
		}

		_dni = dni;
	}

	public String getOriginalDni() {
		return GetterUtil.getString(_originalDni);
	}

	@JSON
	@Override
	public Date getFechaNacimiento() {
		return _fechaNacimiento;
	}

	@Override
	public void setFechaNacimiento(Date fechaNacimiento) {
		_fechaNacimiento = fechaNacimiento;
	}

	@JSON
	@Override
	public long getFotoDniId() {
		return _fotoDniId;
	}

	@Override
	public void setFotoDniId(long fotoDniId) {
		_fotoDniId = fotoDniId;
	}

	@JSON
	@Override
	public long getCocheId() {
		return _cocheId;
	}

	@Override
	public void setCocheId(long cocheId) {
		_columnBitmask |= COCHEID_COLUMN_BITMASK;

		if (!_setOriginalCocheId) {
			_setOriginalCocheId = true;

			_originalCocheId = _cocheId;
		}

		_cocheId = cocheId;
	}

	public long getOriginalCocheId() {
		return _originalCocheId;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				Conductor.class.getName()));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			Conductor.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Conductor toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Conductor)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ConductorImpl conductorImpl = new ConductorImpl();

		conductorImpl.setUuid(getUuid());
		conductorImpl.setConductorId(getConductorId());
		conductorImpl.setCompanyId(getCompanyId());
		conductorImpl.setUserId(getUserId());
		conductorImpl.setUserName(getUserName());
		conductorImpl.setCreateDate(getCreateDate());
		conductorImpl.setModifiedDate(getModifiedDate());
		conductorImpl.setNombre(getNombre());
		conductorImpl.setApellido(getApellido());
		conductorImpl.setDni(getDni());
		conductorImpl.setFechaNacimiento(getFechaNacimiento());
		conductorImpl.setFotoDniId(getFotoDniId());
		conductorImpl.setCocheId(getCocheId());

		conductorImpl.resetOriginalValues();

		return conductorImpl;
	}

	@Override
	public int compareTo(Conductor conductor) {
		int value = 0;

		value = getApellido().compareTo(conductor.getApellido());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Conductor)) {
			return false;
		}

		Conductor conductor = (Conductor)obj;

		long primaryKey = conductor.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		ConductorModelImpl conductorModelImpl = this;

		conductorModelImpl._originalUuid = conductorModelImpl._uuid;

		conductorModelImpl._originalCompanyId = conductorModelImpl._companyId;

		conductorModelImpl._setOriginalCompanyId = false;

		conductorModelImpl._setModifiedDate = false;

		conductorModelImpl._originalDni = conductorModelImpl._dni;

		conductorModelImpl._originalCocheId = conductorModelImpl._cocheId;

		conductorModelImpl._setOriginalCocheId = false;

		conductorModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Conductor> toCacheModel() {
		ConductorCacheModel conductorCacheModel = new ConductorCacheModel();

		conductorCacheModel.uuid = getUuid();

		String uuid = conductorCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			conductorCacheModel.uuid = null;
		}

		conductorCacheModel.conductorId = getConductorId();

		conductorCacheModel.companyId = getCompanyId();

		conductorCacheModel.userId = getUserId();

		conductorCacheModel.userName = getUserName();

		String userName = conductorCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			conductorCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			conductorCacheModel.createDate = createDate.getTime();
		}
		else {
			conductorCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			conductorCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			conductorCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		conductorCacheModel.nombre = getNombre();

		String nombre = conductorCacheModel.nombre;

		if ((nombre != null) && (nombre.length() == 0)) {
			conductorCacheModel.nombre = null;
		}

		conductorCacheModel.apellido = getApellido();

		String apellido = conductorCacheModel.apellido;

		if ((apellido != null) && (apellido.length() == 0)) {
			conductorCacheModel.apellido = null;
		}

		conductorCacheModel.dni = getDni();

		String dni = conductorCacheModel.dni;

		if ((dni != null) && (dni.length() == 0)) {
			conductorCacheModel.dni = null;
		}

		Date fechaNacimiento = getFechaNacimiento();

		if (fechaNacimiento != null) {
			conductorCacheModel.fechaNacimiento = fechaNacimiento.getTime();
		}
		else {
			conductorCacheModel.fechaNacimiento = Long.MIN_VALUE;
		}

		conductorCacheModel.fotoDniId = getFotoDniId();

		conductorCacheModel.cocheId = getCocheId();

		return conductorCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", conductorId=");
		sb.append(getConductorId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", nombre=");
		sb.append(getNombre());
		sb.append(", apellido=");
		sb.append(getApellido());
		sb.append(", dni=");
		sb.append(getDni());
		sb.append(", fechaNacimiento=");
		sb.append(getFechaNacimiento());
		sb.append(", fotoDniId=");
		sb.append(getFotoDniId());
		sb.append(", cocheId=");
		sb.append(getCocheId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("coche.crud.sb.model.Conductor");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>conductorId</column-name><column-value><![CDATA[");
		sb.append(getConductorId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nombre</column-name><column-value><![CDATA[");
		sb.append(getNombre());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>apellido</column-name><column-value><![CDATA[");
		sb.append(getApellido());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dni</column-name><column-value><![CDATA[");
		sb.append(getDni());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fechaNacimiento</column-name><column-value><![CDATA[");
		sb.append(getFechaNacimiento());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fotoDniId</column-name><column-value><![CDATA[");
		sb.append(getFotoDniId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cocheId</column-name><column-value><![CDATA[");
		sb.append(getCocheId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = Conductor.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			Conductor.class
		};
	private String _uuid;
	private String _originalUuid;
	private long _conductorId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _nombre;
	private String _apellido;
	private String _dni;
	private String _originalDni;
	private Date _fechaNacimiento;
	private long _fotoDniId;
	private long _cocheId;
	private long _originalCocheId;
	private boolean _setOriginalCocheId;
	private long _columnBitmask;
	private Conductor _escapedModel;
}