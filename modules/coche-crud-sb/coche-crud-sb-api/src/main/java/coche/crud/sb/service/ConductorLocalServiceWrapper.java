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

package coche.crud.sb.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ConductorLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ConductorLocalService
 * @generated
 */
@ProviderType
public class ConductorLocalServiceWrapper implements ConductorLocalService,
	ServiceWrapper<ConductorLocalService> {
	public ConductorLocalServiceWrapper(
		ConductorLocalService conductorLocalService) {
		_conductorLocalService = conductorLocalService;
	}

	/**
	* Adds the conductor to the database. Also notifies the appropriate model listeners.
	*
	* @param conductor the conductor
	* @return the conductor that was added
	*/
	@Override
	public coche.crud.sb.model.Conductor addConductor(
		coche.crud.sb.model.Conductor conductor) {
		return _conductorLocalService.addConductor(conductor);
	}

	/**
	* Creates a new conductor with the primary key. Does not add the conductor to the database.
	*
	* @param conductorId the primary key for the new conductor
	* @return the new conductor
	*/
	@Override
	public coche.crud.sb.model.Conductor createConductor(long conductorId) {
		return _conductorLocalService.createConductor(conductorId);
	}

	/**
	* Deletes the conductor from the database. Also notifies the appropriate model listeners.
	*
	* @param conductor the conductor
	* @return the conductor that was removed
	*/
	@Override
	public coche.crud.sb.model.Conductor deleteConductor(
		coche.crud.sb.model.Conductor conductor) {
		return _conductorLocalService.deleteConductor(conductor);
	}

	/**
	* Deletes the conductor with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param conductorId the primary key of the conductor
	* @return the conductor that was removed
	* @throws PortalException if a conductor with the primary key could not be found
	*/
	@Override
	public coche.crud.sb.model.Conductor deleteConductor(long conductorId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _conductorLocalService.deleteConductor(conductorId);
	}

	@Override
	public coche.crud.sb.model.Conductor fetchConductor(long conductorId) {
		return _conductorLocalService.fetchConductor(conductorId);
	}

	/**
	* Returns the conductor with the matching UUID and company.
	*
	* @param uuid the conductor's UUID
	* @param companyId the primary key of the company
	* @return the matching conductor, or <code>null</code> if a matching conductor could not be found
	*/
	@Override
	public coche.crud.sb.model.Conductor fetchConductorByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _conductorLocalService.fetchConductorByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns the conductor with the primary key.
	*
	* @param conductorId the primary key of the conductor
	* @return the conductor
	* @throws PortalException if a conductor with the primary key could not be found
	*/
	@Override
	public coche.crud.sb.model.Conductor getConductor(long conductorId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _conductorLocalService.getConductor(conductorId);
	}

	/**
	* Returns the conductor with the matching UUID and company.
	*
	* @param uuid the conductor's UUID
	* @param companyId the primary key of the company
	* @return the matching conductor
	* @throws PortalException if a matching conductor could not be found
	*/
	@Override
	public coche.crud.sb.model.Conductor getConductorByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _conductorLocalService.getConductorByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Updates the conductor in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param conductor the conductor
	* @return the conductor that was updated
	*/
	@Override
	public coche.crud.sb.model.Conductor updateConductor(
		coche.crud.sb.model.Conductor conductor) {
		return _conductorLocalService.updateConductor(conductor);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _conductorLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _conductorLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _conductorLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _conductorLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _conductorLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _conductorLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of conductors.
	*
	* @return the number of conductors
	*/
	@Override
	public int getConductorsCount() {
		return _conductorLocalService.getConductorsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _conductorLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _conductorLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link coche.crud.sb.model.impl.ConductorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _conductorLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link coche.crud.sb.model.impl.ConductorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _conductorLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the conductors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link coche.crud.sb.model.impl.ConductorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of conductors
	* @param end the upper bound of the range of conductors (not inclusive)
	* @return the range of conductors
	*/
	@Override
	public java.util.List<coche.crud.sb.model.Conductor> getConductors(
		int start, int end) {
		return _conductorLocalService.getConductors(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _conductorLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _conductorLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public void addConductor(long companyId, long userId,
		java.lang.String userName, java.lang.String nombre,
		java.lang.String apellido, java.lang.String dni, java.lang.Long cocheId) {
		_conductorLocalService.addConductor(companyId, userId, userName,
			nombre, apellido, dni, cocheId);
	}

	@Override
	public void updateConductor(long conductorId, java.lang.String nombre,
		java.lang.String apellido, java.lang.Long cocheId)
		throws com.liferay.portal.kernel.exception.PortalException {
		_conductorLocalService.updateConductor(conductorId, nombre, apellido,
			cocheId);
	}

	@Override
	public ConductorLocalService getWrappedService() {
		return _conductorLocalService;
	}

	@Override
	public void setWrappedService(ConductorLocalService conductorLocalService) {
		_conductorLocalService = conductorLocalService;
	}

	private ConductorLocalService _conductorLocalService;
}