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

package coche.crud.sb.service.persistence;

import aQute.bnd.annotation.ProviderType;

import coche.crud.sb.model.Conductor;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the conductor service. This utility wraps {@link coche.crud.sb.service.persistence.impl.ConductorPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ConductorPersistence
 * @see coche.crud.sb.service.persistence.impl.ConductorPersistenceImpl
 * @generated
 */
@ProviderType
public class ConductorUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Conductor conductor) {
		getPersistence().clearCache(conductor);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Conductor> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Conductor> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Conductor> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Conductor> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Conductor update(Conductor conductor) {
		return getPersistence().update(conductor);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Conductor update(Conductor conductor,
		ServiceContext serviceContext) {
		return getPersistence().update(conductor, serviceContext);
	}

	/**
	* Returns all the conductors where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching conductors
	*/
	public static List<Conductor> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the conductors where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ConductorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of conductors
	* @param end the upper bound of the range of conductors (not inclusive)
	* @return the range of matching conductors
	*/
	public static List<Conductor> findByUuid(java.lang.String uuid, int start,
		int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the conductors where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ConductorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of conductors
	* @param end the upper bound of the range of conductors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching conductors
	*/
	public static List<Conductor> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Conductor> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the conductors where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ConductorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of conductors
	* @param end the upper bound of the range of conductors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching conductors
	*/
	public static List<Conductor> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Conductor> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first conductor in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching conductor
	* @throws NoSuchConductorException if a matching conductor could not be found
	*/
	public static Conductor findByUuid_First(java.lang.String uuid,
		OrderByComparator<Conductor> orderByComparator)
		throws coche.crud.sb.exception.NoSuchConductorException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first conductor in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching conductor, or <code>null</code> if a matching conductor could not be found
	*/
	public static Conductor fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<Conductor> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last conductor in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching conductor
	* @throws NoSuchConductorException if a matching conductor could not be found
	*/
	public static Conductor findByUuid_Last(java.lang.String uuid,
		OrderByComparator<Conductor> orderByComparator)
		throws coche.crud.sb.exception.NoSuchConductorException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last conductor in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching conductor, or <code>null</code> if a matching conductor could not be found
	*/
	public static Conductor fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<Conductor> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the conductors before and after the current conductor in the ordered set where uuid = &#63;.
	*
	* @param conductorId the primary key of the current conductor
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next conductor
	* @throws NoSuchConductorException if a conductor with the primary key could not be found
	*/
	public static Conductor[] findByUuid_PrevAndNext(long conductorId,
		java.lang.String uuid, OrderByComparator<Conductor> orderByComparator)
		throws coche.crud.sb.exception.NoSuchConductorException {
		return getPersistence()
				   .findByUuid_PrevAndNext(conductorId, uuid, orderByComparator);
	}

	/**
	* Removes all the conductors where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of conductors where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching conductors
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns all the conductors where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching conductors
	*/
	public static List<Conductor> findByUuid_C(java.lang.String uuid,
		long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the conductors where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ConductorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of conductors
	* @param end the upper bound of the range of conductors (not inclusive)
	* @return the range of matching conductors
	*/
	public static List<Conductor> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the conductors where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ConductorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of conductors
	* @param end the upper bound of the range of conductors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching conductors
	*/
	public static List<Conductor> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Conductor> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the conductors where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ConductorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of conductors
	* @param end the upper bound of the range of conductors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching conductors
	*/
	public static List<Conductor> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Conductor> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first conductor in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching conductor
	* @throws NoSuchConductorException if a matching conductor could not be found
	*/
	public static Conductor findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<Conductor> orderByComparator)
		throws coche.crud.sb.exception.NoSuchConductorException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first conductor in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching conductor, or <code>null</code> if a matching conductor could not be found
	*/
	public static Conductor fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<Conductor> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last conductor in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching conductor
	* @throws NoSuchConductorException if a matching conductor could not be found
	*/
	public static Conductor findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<Conductor> orderByComparator)
		throws coche.crud.sb.exception.NoSuchConductorException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last conductor in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching conductor, or <code>null</code> if a matching conductor could not be found
	*/
	public static Conductor fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<Conductor> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the conductors before and after the current conductor in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param conductorId the primary key of the current conductor
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next conductor
	* @throws NoSuchConductorException if a conductor with the primary key could not be found
	*/
	public static Conductor[] findByUuid_C_PrevAndNext(long conductorId,
		java.lang.String uuid, long companyId,
		OrderByComparator<Conductor> orderByComparator)
		throws coche.crud.sb.exception.NoSuchConductorException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(conductorId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the conductors where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of conductors where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching conductors
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns the conductor where dni = &#63; or throws a {@link NoSuchConductorException} if it could not be found.
	*
	* @param dni the dni
	* @return the matching conductor
	* @throws NoSuchConductorException if a matching conductor could not be found
	*/
	public static Conductor findByDni(java.lang.String dni)
		throws coche.crud.sb.exception.NoSuchConductorException {
		return getPersistence().findByDni(dni);
	}

	/**
	* Returns the conductor where dni = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param dni the dni
	* @return the matching conductor, or <code>null</code> if a matching conductor could not be found
	*/
	public static Conductor fetchByDni(java.lang.String dni) {
		return getPersistence().fetchByDni(dni);
	}

	/**
	* Returns the conductor where dni = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param dni the dni
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching conductor, or <code>null</code> if a matching conductor could not be found
	*/
	public static Conductor fetchByDni(java.lang.String dni,
		boolean retrieveFromCache) {
		return getPersistence().fetchByDni(dni, retrieveFromCache);
	}

	/**
	* Removes the conductor where dni = &#63; from the database.
	*
	* @param dni the dni
	* @return the conductor that was removed
	*/
	public static Conductor removeByDni(java.lang.String dni)
		throws coche.crud.sb.exception.NoSuchConductorException {
		return getPersistence().removeByDni(dni);
	}

	/**
	* Returns the number of conductors where dni = &#63;.
	*
	* @param dni the dni
	* @return the number of matching conductors
	*/
	public static int countByDni(java.lang.String dni) {
		return getPersistence().countByDni(dni);
	}

	/**
	* Returns all the conductors where cocheId = &#63;.
	*
	* @param cocheId the coche ID
	* @return the matching conductors
	*/
	public static List<Conductor> findByCocheId(long cocheId) {
		return getPersistence().findByCocheId(cocheId);
	}

	/**
	* Returns a range of all the conductors where cocheId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ConductorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param cocheId the coche ID
	* @param start the lower bound of the range of conductors
	* @param end the upper bound of the range of conductors (not inclusive)
	* @return the range of matching conductors
	*/
	public static List<Conductor> findByCocheId(long cocheId, int start, int end) {
		return getPersistence().findByCocheId(cocheId, start, end);
	}

	/**
	* Returns an ordered range of all the conductors where cocheId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ConductorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param cocheId the coche ID
	* @param start the lower bound of the range of conductors
	* @param end the upper bound of the range of conductors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching conductors
	*/
	public static List<Conductor> findByCocheId(long cocheId, int start,
		int end, OrderByComparator<Conductor> orderByComparator) {
		return getPersistence()
				   .findByCocheId(cocheId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the conductors where cocheId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ConductorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param cocheId the coche ID
	* @param start the lower bound of the range of conductors
	* @param end the upper bound of the range of conductors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching conductors
	*/
	public static List<Conductor> findByCocheId(long cocheId, int start,
		int end, OrderByComparator<Conductor> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByCocheId(cocheId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first conductor in the ordered set where cocheId = &#63;.
	*
	* @param cocheId the coche ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching conductor
	* @throws NoSuchConductorException if a matching conductor could not be found
	*/
	public static Conductor findByCocheId_First(long cocheId,
		OrderByComparator<Conductor> orderByComparator)
		throws coche.crud.sb.exception.NoSuchConductorException {
		return getPersistence().findByCocheId_First(cocheId, orderByComparator);
	}

	/**
	* Returns the first conductor in the ordered set where cocheId = &#63;.
	*
	* @param cocheId the coche ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching conductor, or <code>null</code> if a matching conductor could not be found
	*/
	public static Conductor fetchByCocheId_First(long cocheId,
		OrderByComparator<Conductor> orderByComparator) {
		return getPersistence().fetchByCocheId_First(cocheId, orderByComparator);
	}

	/**
	* Returns the last conductor in the ordered set where cocheId = &#63;.
	*
	* @param cocheId the coche ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching conductor
	* @throws NoSuchConductorException if a matching conductor could not be found
	*/
	public static Conductor findByCocheId_Last(long cocheId,
		OrderByComparator<Conductor> orderByComparator)
		throws coche.crud.sb.exception.NoSuchConductorException {
		return getPersistence().findByCocheId_Last(cocheId, orderByComparator);
	}

	/**
	* Returns the last conductor in the ordered set where cocheId = &#63;.
	*
	* @param cocheId the coche ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching conductor, or <code>null</code> if a matching conductor could not be found
	*/
	public static Conductor fetchByCocheId_Last(long cocheId,
		OrderByComparator<Conductor> orderByComparator) {
		return getPersistence().fetchByCocheId_Last(cocheId, orderByComparator);
	}

	/**
	* Returns the conductors before and after the current conductor in the ordered set where cocheId = &#63;.
	*
	* @param conductorId the primary key of the current conductor
	* @param cocheId the coche ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next conductor
	* @throws NoSuchConductorException if a conductor with the primary key could not be found
	*/
	public static Conductor[] findByCocheId_PrevAndNext(long conductorId,
		long cocheId, OrderByComparator<Conductor> orderByComparator)
		throws coche.crud.sb.exception.NoSuchConductorException {
		return getPersistence()
				   .findByCocheId_PrevAndNext(conductorId, cocheId,
			orderByComparator);
	}

	/**
	* Removes all the conductors where cocheId = &#63; from the database.
	*
	* @param cocheId the coche ID
	*/
	public static void removeByCocheId(long cocheId) {
		getPersistence().removeByCocheId(cocheId);
	}

	/**
	* Returns the number of conductors where cocheId = &#63;.
	*
	* @param cocheId the coche ID
	* @return the number of matching conductors
	*/
	public static int countByCocheId(long cocheId) {
		return getPersistence().countByCocheId(cocheId);
	}

	/**
	* Caches the conductor in the entity cache if it is enabled.
	*
	* @param conductor the conductor
	*/
	public static void cacheResult(Conductor conductor) {
		getPersistence().cacheResult(conductor);
	}

	/**
	* Caches the conductors in the entity cache if it is enabled.
	*
	* @param conductors the conductors
	*/
	public static void cacheResult(List<Conductor> conductors) {
		getPersistence().cacheResult(conductors);
	}

	/**
	* Creates a new conductor with the primary key. Does not add the conductor to the database.
	*
	* @param conductorId the primary key for the new conductor
	* @return the new conductor
	*/
	public static Conductor create(long conductorId) {
		return getPersistence().create(conductorId);
	}

	/**
	* Removes the conductor with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param conductorId the primary key of the conductor
	* @return the conductor that was removed
	* @throws NoSuchConductorException if a conductor with the primary key could not be found
	*/
	public static Conductor remove(long conductorId)
		throws coche.crud.sb.exception.NoSuchConductorException {
		return getPersistence().remove(conductorId);
	}

	public static Conductor updateImpl(Conductor conductor) {
		return getPersistence().updateImpl(conductor);
	}

	/**
	* Returns the conductor with the primary key or throws a {@link NoSuchConductorException} if it could not be found.
	*
	* @param conductorId the primary key of the conductor
	* @return the conductor
	* @throws NoSuchConductorException if a conductor with the primary key could not be found
	*/
	public static Conductor findByPrimaryKey(long conductorId)
		throws coche.crud.sb.exception.NoSuchConductorException {
		return getPersistence().findByPrimaryKey(conductorId);
	}

	/**
	* Returns the conductor with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param conductorId the primary key of the conductor
	* @return the conductor, or <code>null</code> if a conductor with the primary key could not be found
	*/
	public static Conductor fetchByPrimaryKey(long conductorId) {
		return getPersistence().fetchByPrimaryKey(conductorId);
	}

	public static java.util.Map<java.io.Serializable, Conductor> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the conductors.
	*
	* @return the conductors
	*/
	public static List<Conductor> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the conductors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ConductorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of conductors
	* @param end the upper bound of the range of conductors (not inclusive)
	* @return the range of conductors
	*/
	public static List<Conductor> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the conductors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ConductorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of conductors
	* @param end the upper bound of the range of conductors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of conductors
	*/
	public static List<Conductor> findAll(int start, int end,
		OrderByComparator<Conductor> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the conductors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ConductorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of conductors
	* @param end the upper bound of the range of conductors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of conductors
	*/
	public static List<Conductor> findAll(int start, int end,
		OrderByComparator<Conductor> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the conductors from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of conductors.
	*
	* @return the number of conductors
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static ConductorPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ConductorPersistence, ConductorPersistence> _serviceTracker =
		ServiceTrackerFactory.open(ConductorPersistence.class);
}