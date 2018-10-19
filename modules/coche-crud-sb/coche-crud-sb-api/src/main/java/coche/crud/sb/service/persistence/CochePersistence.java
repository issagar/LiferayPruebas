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

import coche.crud.sb.exception.NoSuchCocheException;
import coche.crud.sb.model.Coche;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the coche service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see coche.crud.sb.service.persistence.impl.CochePersistenceImpl
 * @see CocheUtil
 * @generated
 */
@ProviderType
public interface CochePersistence extends BasePersistence<Coche> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CocheUtil} to access the coche persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the coches where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching coches
	*/
	public java.util.List<Coche> findByUuid(java.lang.String uuid);

	/**
	* Returns a range of all the coches where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CocheModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of coches
	* @param end the upper bound of the range of coches (not inclusive)
	* @return the range of matching coches
	*/
	public java.util.List<Coche> findByUuid(java.lang.String uuid, int start,
		int end);

	/**
	* Returns an ordered range of all the coches where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CocheModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of coches
	* @param end the upper bound of the range of coches (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching coches
	*/
	public java.util.List<Coche> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Coche> orderByComparator);

	/**
	* Returns an ordered range of all the coches where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CocheModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of coches
	* @param end the upper bound of the range of coches (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching coches
	*/
	public java.util.List<Coche> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Coche> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first coche in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching coche
	* @throws NoSuchCocheException if a matching coche could not be found
	*/
	public Coche findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Coche> orderByComparator)
		throws NoSuchCocheException;

	/**
	* Returns the first coche in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching coche, or <code>null</code> if a matching coche could not be found
	*/
	public Coche fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Coche> orderByComparator);

	/**
	* Returns the last coche in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching coche
	* @throws NoSuchCocheException if a matching coche could not be found
	*/
	public Coche findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Coche> orderByComparator)
		throws NoSuchCocheException;

	/**
	* Returns the last coche in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching coche, or <code>null</code> if a matching coche could not be found
	*/
	public Coche fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Coche> orderByComparator);

	/**
	* Returns the coches before and after the current coche in the ordered set where uuid = &#63;.
	*
	* @param CocheId the primary key of the current coche
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next coche
	* @throws NoSuchCocheException if a coche with the primary key could not be found
	*/
	public Coche[] findByUuid_PrevAndNext(long CocheId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Coche> orderByComparator)
		throws NoSuchCocheException;

	/**
	* Removes all the coches where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of coches where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching coches
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns all the coches where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching coches
	*/
	public java.util.List<Coche> findByUuid_C(java.lang.String uuid,
		long companyId);

	/**
	* Returns a range of all the coches where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CocheModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of coches
	* @param end the upper bound of the range of coches (not inclusive)
	* @return the range of matching coches
	*/
	public java.util.List<Coche> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

	/**
	* Returns an ordered range of all the coches where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CocheModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of coches
	* @param end the upper bound of the range of coches (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching coches
	*/
	public java.util.List<Coche> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Coche> orderByComparator);

	/**
	* Returns an ordered range of all the coches where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CocheModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of coches
	* @param end the upper bound of the range of coches (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching coches
	*/
	public java.util.List<Coche> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Coche> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first coche in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching coche
	* @throws NoSuchCocheException if a matching coche could not be found
	*/
	public Coche findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Coche> orderByComparator)
		throws NoSuchCocheException;

	/**
	* Returns the first coche in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching coche, or <code>null</code> if a matching coche could not be found
	*/
	public Coche fetchByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Coche> orderByComparator);

	/**
	* Returns the last coche in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching coche
	* @throws NoSuchCocheException if a matching coche could not be found
	*/
	public Coche findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Coche> orderByComparator)
		throws NoSuchCocheException;

	/**
	* Returns the last coche in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching coche, or <code>null</code> if a matching coche could not be found
	*/
	public Coche fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Coche> orderByComparator);

	/**
	* Returns the coches before and after the current coche in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param CocheId the primary key of the current coche
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next coche
	* @throws NoSuchCocheException if a coche with the primary key could not be found
	*/
	public Coche[] findByUuid_C_PrevAndNext(long CocheId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Coche> orderByComparator)
		throws NoSuchCocheException;

	/**
	* Removes all the coches where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of coches where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching coches
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Caches the coche in the entity cache if it is enabled.
	*
	* @param coche the coche
	*/
	public void cacheResult(Coche coche);

	/**
	* Caches the coches in the entity cache if it is enabled.
	*
	* @param coches the coches
	*/
	public void cacheResult(java.util.List<Coche> coches);

	/**
	* Creates a new coche with the primary key. Does not add the coche to the database.
	*
	* @param CocheId the primary key for the new coche
	* @return the new coche
	*/
	public Coche create(long CocheId);

	/**
	* Removes the coche with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param CocheId the primary key of the coche
	* @return the coche that was removed
	* @throws NoSuchCocheException if a coche with the primary key could not be found
	*/
	public Coche remove(long CocheId) throws NoSuchCocheException;

	public Coche updateImpl(Coche coche);

	/**
	* Returns the coche with the primary key or throws a {@link NoSuchCocheException} if it could not be found.
	*
	* @param CocheId the primary key of the coche
	* @return the coche
	* @throws NoSuchCocheException if a coche with the primary key could not be found
	*/
	public Coche findByPrimaryKey(long CocheId) throws NoSuchCocheException;

	/**
	* Returns the coche with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param CocheId the primary key of the coche
	* @return the coche, or <code>null</code> if a coche with the primary key could not be found
	*/
	public Coche fetchByPrimaryKey(long CocheId);

	@Override
	public java.util.Map<java.io.Serializable, Coche> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the coches.
	*
	* @return the coches
	*/
	public java.util.List<Coche> findAll();

	/**
	* Returns a range of all the coches.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CocheModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of coches
	* @param end the upper bound of the range of coches (not inclusive)
	* @return the range of coches
	*/
	public java.util.List<Coche> findAll(int start, int end);

	/**
	* Returns an ordered range of all the coches.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CocheModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of coches
	* @param end the upper bound of the range of coches (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of coches
	*/
	public java.util.List<Coche> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Coche> orderByComparator);

	/**
	* Returns an ordered range of all the coches.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CocheModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of coches
	* @param end the upper bound of the range of coches (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of coches
	*/
	public java.util.List<Coche> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Coche> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the coches from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of coches.
	*
	* @return the number of coches
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}