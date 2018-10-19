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
 * Provides the local service utility for Coche. This utility wraps
 * {@link coche.crud.sb.service.impl.CocheLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CocheLocalService
 * @see coche.crud.sb.service.base.CocheLocalServiceBaseImpl
 * @see coche.crud.sb.service.impl.CocheLocalServiceImpl
 * @generated
 */
@ProviderType
public class CocheLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link coche.crud.sb.service.impl.CocheLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the coche to the database. Also notifies the appropriate model listeners.
	*
	* @param coche the coche
	* @return the coche that was added
	*/
	public static coche.crud.sb.model.Coche addCoche(
		coche.crud.sb.model.Coche coche) {
		return getService().addCoche(coche);
	}

	/**
	* Creates a new coche with the primary key. Does not add the coche to the database.
	*
	* @param CocheId the primary key for the new coche
	* @return the new coche
	*/
	public static coche.crud.sb.model.Coche createCoche(long CocheId) {
		return getService().createCoche(CocheId);
	}

	/**
	* Deletes the coche from the database. Also notifies the appropriate model listeners.
	*
	* @param coche the coche
	* @return the coche that was removed
	*/
	public static coche.crud.sb.model.Coche deleteCoche(
		coche.crud.sb.model.Coche coche) {
		return getService().deleteCoche(coche);
	}

	/**
	* Deletes the coche with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param CocheId the primary key of the coche
	* @return the coche that was removed
	* @throws PortalException if a coche with the primary key could not be found
	*/
	public static coche.crud.sb.model.Coche deleteCoche(long CocheId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteCoche(CocheId);
	}

	public static coche.crud.sb.model.Coche fetchCoche(long CocheId) {
		return getService().fetchCoche(CocheId);
	}

	/**
	* Returns the coche with the matching UUID and company.
	*
	* @param uuid the coche's UUID
	* @param companyId the primary key of the company
	* @return the matching coche, or <code>null</code> if a matching coche could not be found
	*/
	public static coche.crud.sb.model.Coche fetchCocheByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().fetchCocheByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the coche with the primary key.
	*
	* @param CocheId the primary key of the coche
	* @return the coche
	* @throws PortalException if a coche with the primary key could not be found
	*/
	public static coche.crud.sb.model.Coche getCoche(long CocheId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getCoche(CocheId);
	}

	/**
	* Returns the coche with the matching UUID and company.
	*
	* @param uuid the coche's UUID
	* @param companyId the primary key of the company
	* @return the matching coche
	* @throws PortalException if a matching coche could not be found
	*/
	public static coche.crud.sb.model.Coche getCocheByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getCocheByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Updates the coche in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param coche the coche
	* @return the coche that was updated
	*/
	public static coche.crud.sb.model.Coche updateCoche(
		coche.crud.sb.model.Coche coche) {
		return getService().updateCoche(coche);
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
	* Returns the number of coches.
	*
	* @return the number of coches
	*/
	public static int getCochesCount() {
		return getService().getCochesCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link coche.crud.sb.model.impl.CocheModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link coche.crud.sb.model.impl.CocheModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	/**
	* Returns a range of all the coches.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link coche.crud.sb.model.impl.CocheModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of coches
	* @param end the upper bound of the range of coches (not inclusive)
	* @return the range of coches
	*/
	public static java.util.List<coche.crud.sb.model.Coche> getCoches(
		int start, int end) {
		return getService().getCoches(start, end);
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

	public static void addCoche(long companyId, long userId,
		java.lang.String userName, java.lang.String marca,
		java.lang.String modelo, java.lang.Double precio) {
		getService().addCoche(companyId, userId, userName, marca, modelo, precio);
	}

	public static void addCoche(long groupId, long companyId, long userId,
		java.lang.String userName, java.lang.String marca,
		java.lang.String modelo) {
		getService()
			.addCoche(groupId, companyId, userId, userName, marca, modelo);
	}

	public static void addCoche(long groupId, long companyId, long userId,
		java.lang.String userName, java.lang.String marca,
		java.lang.String modelo, java.lang.Double precio) {
		getService()
			.addCoche(groupId, companyId, userId, userName, marca, modelo,
			precio);
	}

	public static void addCoche(long groupId, long companyId, long userId,
		java.lang.String userName, java.lang.String nombre) {
		getService().addCoche(groupId, companyId, userId, userName, nombre);
	}

	public static void updateCoche(long cocheId, java.lang.String marca,
		java.lang.String modelo, java.lang.Double precio)
		throws com.liferay.portal.kernel.exception.PortalException {
		getService().updateCoche(cocheId, marca, modelo, precio);
	}

	public static CocheLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CocheLocalService, CocheLocalService> _serviceTracker =
		ServiceTrackerFactory.open(CocheLocalService.class);
}