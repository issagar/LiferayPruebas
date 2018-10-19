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
 * Provides a wrapper for {@link CocheLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CocheLocalService
 * @generated
 */
@ProviderType
public class CocheLocalServiceWrapper implements CocheLocalService,
	ServiceWrapper<CocheLocalService> {
	public CocheLocalServiceWrapper(CocheLocalService cocheLocalService) {
		_cocheLocalService = cocheLocalService;
	}

	/**
	* Adds the coche to the database. Also notifies the appropriate model listeners.
	*
	* @param coche the coche
	* @return the coche that was added
	*/
	@Override
	public coche.crud.sb.model.Coche addCoche(coche.crud.sb.model.Coche coche) {
		return _cocheLocalService.addCoche(coche);
	}

	/**
	* Creates a new coche with the primary key. Does not add the coche to the database.
	*
	* @param CocheId the primary key for the new coche
	* @return the new coche
	*/
	@Override
	public coche.crud.sb.model.Coche createCoche(long CocheId) {
		return _cocheLocalService.createCoche(CocheId);
	}

	/**
	* Deletes the coche from the database. Also notifies the appropriate model listeners.
	*
	* @param coche the coche
	* @return the coche that was removed
	*/
	@Override
	public coche.crud.sb.model.Coche deleteCoche(
		coche.crud.sb.model.Coche coche) {
		return _cocheLocalService.deleteCoche(coche);
	}

	/**
	* Deletes the coche with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param CocheId the primary key of the coche
	* @return the coche that was removed
	* @throws PortalException if a coche with the primary key could not be found
	*/
	@Override
	public coche.crud.sb.model.Coche deleteCoche(long CocheId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cocheLocalService.deleteCoche(CocheId);
	}

	@Override
	public coche.crud.sb.model.Coche fetchCoche(long CocheId) {
		return _cocheLocalService.fetchCoche(CocheId);
	}

	/**
	* Returns the coche with the matching UUID and company.
	*
	* @param uuid the coche's UUID
	* @param companyId the primary key of the company
	* @return the matching coche, or <code>null</code> if a matching coche could not be found
	*/
	@Override
	public coche.crud.sb.model.Coche fetchCocheByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _cocheLocalService.fetchCocheByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the coche with the primary key.
	*
	* @param CocheId the primary key of the coche
	* @return the coche
	* @throws PortalException if a coche with the primary key could not be found
	*/
	@Override
	public coche.crud.sb.model.Coche getCoche(long CocheId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cocheLocalService.getCoche(CocheId);
	}

	/**
	* Returns the coche with the matching UUID and company.
	*
	* @param uuid the coche's UUID
	* @param companyId the primary key of the company
	* @return the matching coche
	* @throws PortalException if a matching coche could not be found
	*/
	@Override
	public coche.crud.sb.model.Coche getCocheByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cocheLocalService.getCocheByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Updates the coche in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param coche the coche
	* @return the coche that was updated
	*/
	@Override
	public coche.crud.sb.model.Coche updateCoche(
		coche.crud.sb.model.Coche coche) {
		return _cocheLocalService.updateCoche(coche);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _cocheLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _cocheLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _cocheLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _cocheLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cocheLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cocheLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of coches.
	*
	* @return the number of coches
	*/
	@Override
	public int getCochesCount() {
		return _cocheLocalService.getCochesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _cocheLocalService.getOSGiServiceIdentifier();
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
		return _cocheLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _cocheLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _cocheLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
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
	@Override
	public java.util.List<coche.crud.sb.model.Coche> getCoches(int start,
		int end) {
		return _cocheLocalService.getCoches(start, end);
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
		return _cocheLocalService.dynamicQueryCount(dynamicQuery);
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
		return _cocheLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public void addCoche(long companyId, long userId,
		java.lang.String userName, java.lang.String marca,
		java.lang.String modelo, java.lang.Double precio) {
		_cocheLocalService.addCoche(companyId, userId, userName, marca, modelo,
			precio);
	}

	@Override
	public void addCoche(long groupId, long companyId, long userId,
		java.lang.String userName, java.lang.String marca,
		java.lang.String modelo) {
		_cocheLocalService.addCoche(groupId, companyId, userId, userName,
			marca, modelo);
	}

	@Override
	public void addCoche(long groupId, long companyId, long userId,
		java.lang.String userName, java.lang.String marca,
		java.lang.String modelo, java.lang.Double precio) {
		_cocheLocalService.addCoche(groupId, companyId, userId, userName,
			marca, modelo, precio);
	}

	@Override
	public void addCoche(long groupId, long companyId, long userId,
		java.lang.String userName, java.lang.String nombre) {
		_cocheLocalService.addCoche(groupId, companyId, userId, userName, nombre);
	}

	@Override
	public void updateCoche(long cocheId, java.lang.String marca,
		java.lang.String modelo, java.lang.Double precio)
		throws com.liferay.portal.kernel.exception.PortalException {
		_cocheLocalService.updateCoche(cocheId, marca, modelo, precio);
	}

	@Override
	public CocheLocalService getWrappedService() {
		return _cocheLocalService;
	}

	@Override
	public void setWrappedService(CocheLocalService cocheLocalService) {
		_cocheLocalService = cocheLocalService;
	}

	private CocheLocalService _cocheLocalService;
}