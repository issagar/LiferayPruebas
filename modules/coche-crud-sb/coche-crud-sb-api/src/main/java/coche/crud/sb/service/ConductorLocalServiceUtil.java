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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Conductor. This utility wraps
 * {@link coche.crud.sb.service.impl.ConductorLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ConductorLocalService
 * @see coche.crud.sb.service.base.ConductorLocalServiceBaseImpl
 * @see coche.crud.sb.service.impl.ConductorLocalServiceImpl
 * @generated
 */
@ProviderType
public class ConductorLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link coche.crud.sb.service.impl.ConductorLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the conductor to the database. Also notifies the appropriate model listeners.
	*
	* @param conductor the conductor
	* @return the conductor that was added
	*/
	public static coche.crud.sb.model.Conductor addConductor(
		coche.crud.sb.model.Conductor conductor) {
		return getService().addConductor(conductor);
	}

	/**
	* Creates a new conductor with the primary key. Does not add the conductor to the database.
	*
	* @param conductorId the primary key for the new conductor
	* @return the new conductor
	*/
	public static coche.crud.sb.model.Conductor createConductor(
		long conductorId) {
		return getService().createConductor(conductorId);
	}

	/**
	* Deletes the conductor from the database. Also notifies the appropriate model listeners.
	*
	* @param conductor the conductor
	* @return the conductor that was removed
	*/
	public static coche.crud.sb.model.Conductor deleteConductor(
		coche.crud.sb.model.Conductor conductor) {
		return getService().deleteConductor(conductor);
	}

	/**
	* Deletes the conductor with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param conductorId the primary key of the conductor
	* @return the conductor that was removed
	* @throws PortalException if a conductor with the primary key could not be found
	*/
	public static coche.crud.sb.model.Conductor deleteConductor(
		long conductorId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteConductor(conductorId);
	}

	public static coche.crud.sb.model.Conductor fetchByDni(java.lang.String dni) {
		return getService().fetchByDni(dni);
	}

	public static coche.crud.sb.model.Conductor fetchConductor(long conductorId) {
		return getService().fetchConductor(conductorId);
	}

	/**
	* Returns the conductor with the matching UUID and company.
	*
	* @param uuid the conductor's UUID
	* @param companyId the primary key of the company
	* @return the matching conductor, or <code>null</code> if a matching conductor could not be found
	*/
	public static coche.crud.sb.model.Conductor fetchConductorByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().fetchConductorByUuidAndCompanyId(uuid, companyId);
	}

	public static coche.crud.sb.model.Conductor findByDni(java.lang.String dni)
		throws coche.crud.sb.exception.NoSuchConductorException {
		return getService().findByDni(dni);
	}

	/**
	* Returns the conductor with the primary key.
	*
	* @param conductorId the primary key of the conductor
	* @return the conductor
	* @throws PortalException if a conductor with the primary key could not be found
	*/
	public static coche.crud.sb.model.Conductor getConductor(long conductorId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getConductor(conductorId);
	}

	/**
	* Returns the conductor with the matching UUID and company.
	*
	* @param uuid the conductor's UUID
	* @param companyId the primary key of the company
	* @return the matching conductor
	* @throws PortalException if a matching conductor could not be found
	*/
	public static coche.crud.sb.model.Conductor getConductorByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getConductorByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Updates the conductor in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param conductor the conductor
	* @return the conductor that was updated
	*/
	public static coche.crud.sb.model.Conductor updateConductor(
		coche.crud.sb.model.Conductor conductor) {
		return getService().updateConductor(conductor);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of conductors.
	*
	* @return the number of conductors
	*/
	public static int getConductorsCount() {
		return getService().getConductorsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	public static java.util.List<coche.crud.sb.model.Conductor> findByCocheId(
		long CocheId) {
		return getService().findByCocheId(CocheId);
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
	public static java.util.List<coche.crud.sb.model.Conductor> getConductors(
		int start, int end) {
		return getService().getConductors(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static void addConductor(long companyId, long userId,
		java.lang.String userName, java.lang.String nombre,
		java.lang.String apellido, java.lang.String dni, java.lang.Long cocheId) {
		getService()
			.addConductor(companyId, userId, userName, nombre, apellido, dni,
			cocheId);
	}

	public static void updateConductor(long conductorId,
		java.lang.String nombre, java.lang.String apellido,
		java.lang.Long cocheId)
		throws com.liferay.portal.kernel.exception.PortalException {
		getService().updateConductor(conductorId, nombre, apellido, cocheId);
	}

	public static ConductorLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ConductorLocalService, ConductorLocalService> _serviceTracker =
		ServiceTrackerFactory.open(ConductorLocalService.class);
}