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

import coche.crud.sb.exception.NoSuchConductorException;
import coche.crud.sb.model.Conductor;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the conductor service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see coche.crud.sb.service.persistence.impl.ConductorPersistenceImpl
 * @see ConductorUtil
 * @generated
 */
@ProviderType
public interface ConductorPersistence extends BasePersistence<Conductor> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ConductorUtil} to access the conductor persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the conductors where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching conductors
	*/
	public java.util.List<Conductor> findByUuid(java.lang.String uuid);

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
	public java.util.List<Conductor> findByUuid(java.lang.String uuid,
		int start, int end);

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
	public java.util.List<Conductor> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Conductor> orderByComparator);

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
	public java.util.List<Conductor> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Conductor> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first conductor in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching conductor
	* @throws NoSuchConductorException if a matching conductor could not be found
	*/
	public Conductor findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Conductor> orderByComparator)
		throws NoSuchConductorException;

	/**
	* Returns the first conductor in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching conductor, or <code>null</code> if a matching conductor could not be found
	*/
	public Conductor fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Conductor> orderByComparator);

	/**
	* Returns the last conductor in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching conductor
	* @throws NoSuchConductorException if a matching conductor could not be found
	*/
	public Conductor findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Conductor> orderByComparator)
		throws NoSuchConductorException;

	/**
	* Returns the last conductor in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching conductor, or <code>null</code> if a matching conductor could not be found
	*/
	public Conductor fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Conductor> orderByComparator);

	/**
	* Returns the conductors before and after the current conductor in the ordered set where uuid = &#63;.
	*
	* @param conductorId the primary key of the current conductor
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next conductor
	* @throws NoSuchConductorException if a conductor with the primary key could not be found
	*/
	public Conductor[] findByUuid_PrevAndNext(long conductorId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Conductor> orderByComparator)
		throws NoSuchConductorException;

	/**
	* Removes all the conductors where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of conductors where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching conductors
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns all the conductors where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching conductors
	*/
	public java.util.List<Conductor> findByUuid_C(java.lang.String uuid,
		long companyId);

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
	public java.util.List<Conductor> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

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
	public java.util.List<Conductor> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Conductor> orderByComparator);

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
	public java.util.List<Conductor> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Conductor> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first conductor in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching conductor
	* @throws NoSuchConductorException if a matching conductor could not be found
	*/
	public Conductor findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Conductor> orderByComparator)
		throws NoSuchConductorException;

	/**
	* Returns the first conductor in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching conductor, or <code>null</code> if a matching conductor could not be found
	*/
	public Conductor fetchByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Conductor> orderByComparator);

	/**
	* Returns the last conductor in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching conductor
	* @throws NoSuchConductorException if a matching conductor could not be found
	*/
	public Conductor findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Conductor> orderByComparator)
		throws NoSuchConductorException;

	/**
	* Returns the last conductor in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching conductor, or <code>null</code> if a matching conductor could not be found
	*/
	public Conductor fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Conductor> orderByComparator);

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
	public Conductor[] findByUuid_C_PrevAndNext(long conductorId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Conductor> orderByComparator)
		throws NoSuchConductorException;

	/**
	* Removes all the conductors where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of conductors where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching conductors
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the conductor where dni = &#63; or throws a {@link NoSuchConductorException} if it could not be found.
	*
	* @param dni the dni
	* @return the matching conductor
	* @throws NoSuchConductorException if a matching conductor could not be found
	*/
	public Conductor findByDni(java.lang.String dni)
		throws NoSuchConductorException;

	/**
	* Returns the conductor where dni = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param dni the dni
	* @return the matching conductor, or <code>null</code> if a matching conductor could not be found
	*/
	public Conductor fetchByDni(java.lang.String dni);

	/**
	* Returns the conductor where dni = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param dni the dni
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching conductor, or <code>null</code> if a matching conductor could not be found
	*/
	public Conductor fetchByDni(java.lang.String dni, boolean retrieveFromCache);

	/**
	* Removes the conductor where dni = &#63; from the database.
	*
	* @param dni the dni
	* @return the conductor that was removed
	*/
	public Conductor removeByDni(java.lang.String dni)
		throws NoSuchConductorException;

	/**
	* Returns the number of conductors where dni = &#63;.
	*
	* @param dni the dni
	* @return the number of matching conductors
	*/
	public int countByDni(java.lang.String dni);

	/**
	* Returns all the conductors where cocheId = &#63;.
	*
	* @param cocheId the coche ID
	* @return the matching conductors
	*/
	public java.util.List<Conductor> findByCocheId(long cocheId);

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
	public java.util.List<Conductor> findByCocheId(long cocheId, int start,
		int end);

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
	public java.util.List<Conductor> findByCocheId(long cocheId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Conductor> orderByComparator);

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
	public java.util.List<Conductor> findByCocheId(long cocheId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Conductor> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first conductor in the ordered set where cocheId = &#63;.
	*
	* @param cocheId the coche ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching conductor
	* @throws NoSuchConductorException if a matching conductor could not be found
	*/
	public Conductor findByCocheId_First(long cocheId,
		com.liferay.portal.kernel.util.OrderByComparator<Conductor> orderByComparator)
		throws NoSuchConductorException;

	/**
	* Returns the first conductor in the ordered set where cocheId = &#63;.
	*
	* @param cocheId the coche ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching conductor, or <code>null</code> if a matching conductor could not be found
	*/
	public Conductor fetchByCocheId_First(long cocheId,
		com.liferay.portal.kernel.util.OrderByComparator<Conductor> orderByComparator);

	/**
	* Returns the last conductor in the ordered set where cocheId = &#63;.
	*
	* @param cocheId the coche ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching conductor
	* @throws NoSuchConductorException if a matching conductor could not be found
	*/
	public Conductor findByCocheId_Last(long cocheId,
		com.liferay.portal.kernel.util.OrderByComparator<Conductor> orderByComparator)
		throws NoSuchConductorException;

	/**
	* Returns the last conductor in the ordered set where cocheId = &#63;.
	*
	* @param cocheId the coche ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching conductor, or <code>null</code> if a matching conductor could not be found
	*/
	public Conductor fetchByCocheId_Last(long cocheId,
		com.liferay.portal.kernel.util.OrderByComparator<Conductor> orderByComparator);

	/**
	* Returns the conductors before and after the current conductor in the ordered set where cocheId = &#63;.
	*
	* @param conductorId the primary key of the current conductor
	* @param cocheId the coche ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next conductor
	* @throws NoSuchConductorException if a conductor with the primary key could not be found
	*/
	public Conductor[] findByCocheId_PrevAndNext(long conductorId,
		long cocheId,
		com.liferay.portal.kernel.util.OrderByComparator<Conductor> orderByComparator)
		throws NoSuchConductorException;

	/**
	* Removes all the conductors where cocheId = &#63; from the database.
	*
	* @param cocheId the coche ID
	*/
	public void removeByCocheId(long cocheId);

	/**
	* Returns the number of conductors where cocheId = &#63;.
	*
	* @param cocheId the coche ID
	* @return the number of matching conductors
	*/
	public int countByCocheId(long cocheId);

	/**
	* Caches the conductor in the entity cache if it is enabled.
	*
	* @param conductor the conductor
	*/
	public void cacheResult(Conductor conductor);

	/**
	* Caches the conductors in the entity cache if it is enabled.
	*
	* @param conductors the conductors
	*/
	public void cacheResult(java.util.List<Conductor> conductors);

	/**
	* Creates a new conductor with the primary key. Does not add the conductor to the database.
	*
	* @param conductorId the primary key for the new conductor
	* @return the new conductor
	*/
	public Conductor create(long conductorId);

	/**
	* Removes the conductor with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param conductorId the primary key of the conductor
	* @return the conductor that was removed
	* @throws NoSuchConductorException if a conductor with the primary key could not be found
	*/
	public Conductor remove(long conductorId) throws NoSuchConductorException;

	public Conductor updateImpl(Conductor conductor);

	/**
	* Returns the conductor with the primary key or throws a {@link NoSuchConductorException} if it could not be found.
	*
	* @param conductorId the primary key of the conductor
	* @return the conductor
	* @throws NoSuchConductorException if a conductor with the primary key could not be found
	*/
	public Conductor findByPrimaryKey(long conductorId)
		throws NoSuchConductorException;

	/**
	* Returns the conductor with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param conductorId the primary key of the conductor
	* @return the conductor, or <code>null</code> if a conductor with the primary key could not be found
	*/
	public Conductor fetchByPrimaryKey(long conductorId);

	@Override
	public java.util.Map<java.io.Serializable, Conductor> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the conductors.
	*
	* @return the conductors
	*/
	public java.util.List<Conductor> findAll();

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
	public java.util.List<Conductor> findAll(int start, int end);

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
	public java.util.List<Conductor> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Conductor> orderByComparator);

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
	public java.util.List<Conductor> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Conductor> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the conductors from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of conductors.
	*
	* @return the number of conductors
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}