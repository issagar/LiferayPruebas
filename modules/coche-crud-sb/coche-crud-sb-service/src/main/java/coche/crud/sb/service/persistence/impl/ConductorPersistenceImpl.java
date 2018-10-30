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

package coche.crud.sb.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import coche.crud.sb.exception.NoSuchConductorException;
import coche.crud.sb.model.Conductor;
import coche.crud.sb.model.impl.ConductorImpl;
import coche.crud.sb.model.impl.ConductorModelImpl;
import coche.crud.sb.service.persistence.ConductorPersistence;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.CompanyProvider;
import com.liferay.portal.kernel.service.persistence.CompanyProviderWrapper;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReflectionUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.io.Serializable;

import java.lang.reflect.Field;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the conductor service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ConductorPersistence
 * @see coche.crud.sb.service.persistence.ConductorUtil
 * @generated
 */
@ProviderType
public class ConductorPersistenceImpl extends BasePersistenceImpl<Conductor>
	implements ConductorPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ConductorUtil} to access the conductor persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ConductorImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ConductorModelImpl.ENTITY_CACHE_ENABLED,
			ConductorModelImpl.FINDER_CACHE_ENABLED, ConductorImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ConductorModelImpl.ENTITY_CACHE_ENABLED,
			ConductorModelImpl.FINDER_CACHE_ENABLED, ConductorImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ConductorModelImpl.ENTITY_CACHE_ENABLED,
			ConductorModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(ConductorModelImpl.ENTITY_CACHE_ENABLED,
			ConductorModelImpl.FINDER_CACHE_ENABLED, ConductorImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(ConductorModelImpl.ENTITY_CACHE_ENABLED,
			ConductorModelImpl.FINDER_CACHE_ENABLED, ConductorImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			ConductorModelImpl.UUID_COLUMN_BITMASK |
			ConductorModelImpl.APELLIDO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(ConductorModelImpl.ENTITY_CACHE_ENABLED,
			ConductorModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the conductors where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching conductors
	 */
	@Override
	public List<Conductor> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Conductor> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<Conductor> findByUuid(String uuid, int start, int end,
		OrderByComparator<Conductor> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<Conductor> findByUuid(String uuid, int start, int end,
		OrderByComparator<Conductor> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid, start, end, orderByComparator };
		}

		List<Conductor> list = null;

		if (retrieveFromCache) {
			list = (List<Conductor>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Conductor conductor : list) {
					if (!Objects.equals(uuid, conductor.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_CONDUCTOR_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ConductorModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				if (!pagination) {
					list = (List<Conductor>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Conductor>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first conductor in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching conductor
	 * @throws NoSuchConductorException if a matching conductor could not be found
	 */
	@Override
	public Conductor findByUuid_First(String uuid,
		OrderByComparator<Conductor> orderByComparator)
		throws NoSuchConductorException {
		Conductor conductor = fetchByUuid_First(uuid, orderByComparator);

		if (conductor != null) {
			return conductor;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchConductorException(msg.toString());
	}

	/**
	 * Returns the first conductor in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching conductor, or <code>null</code> if a matching conductor could not be found
	 */
	@Override
	public Conductor fetchByUuid_First(String uuid,
		OrderByComparator<Conductor> orderByComparator) {
		List<Conductor> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last conductor in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching conductor
	 * @throws NoSuchConductorException if a matching conductor could not be found
	 */
	@Override
	public Conductor findByUuid_Last(String uuid,
		OrderByComparator<Conductor> orderByComparator)
		throws NoSuchConductorException {
		Conductor conductor = fetchByUuid_Last(uuid, orderByComparator);

		if (conductor != null) {
			return conductor;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchConductorException(msg.toString());
	}

	/**
	 * Returns the last conductor in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching conductor, or <code>null</code> if a matching conductor could not be found
	 */
	@Override
	public Conductor fetchByUuid_Last(String uuid,
		OrderByComparator<Conductor> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Conductor> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Conductor[] findByUuid_PrevAndNext(long conductorId, String uuid,
		OrderByComparator<Conductor> orderByComparator)
		throws NoSuchConductorException {
		Conductor conductor = findByPrimaryKey(conductorId);

		Session session = null;

		try {
			session = openSession();

			Conductor[] array = new ConductorImpl[3];

			array[0] = getByUuid_PrevAndNext(session, conductor, uuid,
					orderByComparator, true);

			array[1] = conductor;

			array[2] = getByUuid_PrevAndNext(session, conductor, uuid,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Conductor getByUuid_PrevAndNext(Session session,
		Conductor conductor, String uuid,
		OrderByComparator<Conductor> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CONDUCTOR_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(ConductorModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(conductor);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Conductor> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the conductors where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Conductor conductor : findByUuid(uuid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(conductor);
		}
	}

	/**
	 * Returns the number of conductors where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching conductors
	 */
	@Override
	public int countByUuid(String uuid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CONDUCTOR_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "conductor.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "conductor.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(conductor.uuid IS NULL OR conductor.uuid = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(ConductorModelImpl.ENTITY_CACHE_ENABLED,
			ConductorModelImpl.FINDER_CACHE_ENABLED, ConductorImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(ConductorModelImpl.ENTITY_CACHE_ENABLED,
			ConductorModelImpl.FINDER_CACHE_ENABLED, ConductorImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			ConductorModelImpl.UUID_COLUMN_BITMASK |
			ConductorModelImpl.COMPANYID_COLUMN_BITMASK |
			ConductorModelImpl.APELLIDO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(ConductorModelImpl.ENTITY_CACHE_ENABLED,
			ConductorModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the conductors where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching conductors
	 */
	@Override
	public List<Conductor> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<Conductor> findByUuid_C(String uuid, long companyId, int start,
		int end) {
		return findByUuid_C(uuid, companyId, start, end, null);
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
	@Override
	public List<Conductor> findByUuid_C(String uuid, long companyId, int start,
		int end, OrderByComparator<Conductor> orderByComparator) {
		return findByUuid_C(uuid, companyId, start, end, orderByComparator, true);
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
	@Override
	public List<Conductor> findByUuid_C(String uuid, long companyId, int start,
		int end, OrderByComparator<Conductor> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] { uuid, companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] {
					uuid, companyId,
					
					start, end, orderByComparator
				};
		}

		List<Conductor> list = null;

		if (retrieveFromCache) {
			list = (List<Conductor>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Conductor conductor : list) {
					if (!Objects.equals(uuid, conductor.getUuid()) ||
							(companyId != conductor.getCompanyId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_CONDUCTOR_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ConductorModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				if (!pagination) {
					list = (List<Conductor>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Conductor>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public Conductor findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<Conductor> orderByComparator)
		throws NoSuchConductorException {
		Conductor conductor = fetchByUuid_C_First(uuid, companyId,
				orderByComparator);

		if (conductor != null) {
			return conductor;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchConductorException(msg.toString());
	}

	/**
	 * Returns the first conductor in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching conductor, or <code>null</code> if a matching conductor could not be found
	 */
	@Override
	public Conductor fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator<Conductor> orderByComparator) {
		List<Conductor> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Conductor findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<Conductor> orderByComparator)
		throws NoSuchConductorException {
		Conductor conductor = fetchByUuid_C_Last(uuid, companyId,
				orderByComparator);

		if (conductor != null) {
			return conductor;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchConductorException(msg.toString());
	}

	/**
	 * Returns the last conductor in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching conductor, or <code>null</code> if a matching conductor could not be found
	 */
	@Override
	public Conductor fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<Conductor> orderByComparator) {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<Conductor> list = findByUuid_C(uuid, companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Conductor[] findByUuid_C_PrevAndNext(long conductorId, String uuid,
		long companyId, OrderByComparator<Conductor> orderByComparator)
		throws NoSuchConductorException {
		Conductor conductor = findByPrimaryKey(conductorId);

		Session session = null;

		try {
			session = openSession();

			Conductor[] array = new ConductorImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, conductor, uuid,
					companyId, orderByComparator, true);

			array[1] = conductor;

			array[2] = getByUuid_C_PrevAndNext(session, conductor, uuid,
					companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Conductor getByUuid_C_PrevAndNext(Session session,
		Conductor conductor, String uuid, long companyId,
		OrderByComparator<Conductor> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_CONDUCTOR_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(ConductorModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(conductor);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Conductor> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the conductors where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (Conductor conductor : findByUuid_C(uuid, companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(conductor);
		}
	}

	/**
	 * Returns the number of conductors where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching conductors
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CONDUCTOR_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "conductor.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "conductor.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(conductor.uuid IS NULL OR conductor.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "conductor.companyId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_DNI = new FinderPath(ConductorModelImpl.ENTITY_CACHE_ENABLED,
			ConductorModelImpl.FINDER_CACHE_ENABLED, ConductorImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByDni",
			new String[] { String.class.getName() },
			ConductorModelImpl.DNI_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DNI = new FinderPath(ConductorModelImpl.ENTITY_CACHE_ENABLED,
			ConductorModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDni",
			new String[] { String.class.getName() });

	/**
	 * Returns the conductor where dni = &#63; or throws a {@link NoSuchConductorException} if it could not be found.
	 *
	 * @param dni the dni
	 * @return the matching conductor
	 * @throws NoSuchConductorException if a matching conductor could not be found
	 */
	@Override
	public Conductor findByDni(String dni) throws NoSuchConductorException {
		Conductor conductor = fetchByDni(dni);

		if (conductor == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("dni=");
			msg.append(dni);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchConductorException(msg.toString());
		}

		return conductor;
	}

	/**
	 * Returns the conductor where dni = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param dni the dni
	 * @return the matching conductor, or <code>null</code> if a matching conductor could not be found
	 */
	@Override
	public Conductor fetchByDni(String dni) {
		return fetchByDni(dni, true);
	}

	/**
	 * Returns the conductor where dni = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param dni the dni
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching conductor, or <code>null</code> if a matching conductor could not be found
	 */
	@Override
	public Conductor fetchByDni(String dni, boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { dni };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_DNI,
					finderArgs, this);
		}

		if (result instanceof Conductor) {
			Conductor conductor = (Conductor)result;

			if (!Objects.equals(dni, conductor.getDni())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_CONDUCTOR_WHERE);

			boolean bindDni = false;

			if (dni == null) {
				query.append(_FINDER_COLUMN_DNI_DNI_1);
			}
			else if (dni.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DNI_DNI_3);
			}
			else {
				bindDni = true;

				query.append(_FINDER_COLUMN_DNI_DNI_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDni) {
					qPos.add(dni);
				}

				List<Conductor> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_DNI, finderArgs,
						list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"ConductorPersistenceImpl.fetchByDni(String, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					Conductor conductor = list.get(0);

					result = conductor;

					cacheResult(conductor);

					if ((conductor.getDni() == null) ||
							!conductor.getDni().equals(dni)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_DNI,
							finderArgs, conductor);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_DNI, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (Conductor)result;
		}
	}

	/**
	 * Removes the conductor where dni = &#63; from the database.
	 *
	 * @param dni the dni
	 * @return the conductor that was removed
	 */
	@Override
	public Conductor removeByDni(String dni) throws NoSuchConductorException {
		Conductor conductor = findByDni(dni);

		return remove(conductor);
	}

	/**
	 * Returns the number of conductors where dni = &#63;.
	 *
	 * @param dni the dni
	 * @return the number of matching conductors
	 */
	@Override
	public int countByDni(String dni) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DNI;

		Object[] finderArgs = new Object[] { dni };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CONDUCTOR_WHERE);

			boolean bindDni = false;

			if (dni == null) {
				query.append(_FINDER_COLUMN_DNI_DNI_1);
			}
			else if (dni.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DNI_DNI_3);
			}
			else {
				bindDni = true;

				query.append(_FINDER_COLUMN_DNI_DNI_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDni) {
					qPos.add(dni);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_DNI_DNI_1 = "conductor.dni IS NULL";
	private static final String _FINDER_COLUMN_DNI_DNI_2 = "conductor.dni = ?";
	private static final String _FINDER_COLUMN_DNI_DNI_3 = "(conductor.dni IS NULL OR conductor.dni = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COCHEID = new FinderPath(ConductorModelImpl.ENTITY_CACHE_ENABLED,
			ConductorModelImpl.FINDER_CACHE_ENABLED, ConductorImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCocheId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COCHEID =
		new FinderPath(ConductorModelImpl.ENTITY_CACHE_ENABLED,
			ConductorModelImpl.FINDER_CACHE_ENABLED, ConductorImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCocheId",
			new String[] { Long.class.getName() },
			ConductorModelImpl.COCHEID_COLUMN_BITMASK |
			ConductorModelImpl.APELLIDO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COCHEID = new FinderPath(ConductorModelImpl.ENTITY_CACHE_ENABLED,
			ConductorModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCocheId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the conductors where cocheId = &#63;.
	 *
	 * @param cocheId the coche ID
	 * @return the matching conductors
	 */
	@Override
	public List<Conductor> findByCocheId(long cocheId) {
		return findByCocheId(cocheId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Conductor> findByCocheId(long cocheId, int start, int end) {
		return findByCocheId(cocheId, start, end, null);
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
	@Override
	public List<Conductor> findByCocheId(long cocheId, int start, int end,
		OrderByComparator<Conductor> orderByComparator) {
		return findByCocheId(cocheId, start, end, orderByComparator, true);
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
	@Override
	public List<Conductor> findByCocheId(long cocheId, int start, int end,
		OrderByComparator<Conductor> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COCHEID;
			finderArgs = new Object[] { cocheId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COCHEID;
			finderArgs = new Object[] { cocheId, start, end, orderByComparator };
		}

		List<Conductor> list = null;

		if (retrieveFromCache) {
			list = (List<Conductor>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Conductor conductor : list) {
					if ((cocheId != conductor.getCocheId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_CONDUCTOR_WHERE);

			query.append(_FINDER_COLUMN_COCHEID_COCHEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ConductorModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(cocheId);

				if (!pagination) {
					list = (List<Conductor>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Conductor>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first conductor in the ordered set where cocheId = &#63;.
	 *
	 * @param cocheId the coche ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching conductor
	 * @throws NoSuchConductorException if a matching conductor could not be found
	 */
	@Override
	public Conductor findByCocheId_First(long cocheId,
		OrderByComparator<Conductor> orderByComparator)
		throws NoSuchConductorException {
		Conductor conductor = fetchByCocheId_First(cocheId, orderByComparator);

		if (conductor != null) {
			return conductor;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("cocheId=");
		msg.append(cocheId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchConductorException(msg.toString());
	}

	/**
	 * Returns the first conductor in the ordered set where cocheId = &#63;.
	 *
	 * @param cocheId the coche ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching conductor, or <code>null</code> if a matching conductor could not be found
	 */
	@Override
	public Conductor fetchByCocheId_First(long cocheId,
		OrderByComparator<Conductor> orderByComparator) {
		List<Conductor> list = findByCocheId(cocheId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last conductor in the ordered set where cocheId = &#63;.
	 *
	 * @param cocheId the coche ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching conductor
	 * @throws NoSuchConductorException if a matching conductor could not be found
	 */
	@Override
	public Conductor findByCocheId_Last(long cocheId,
		OrderByComparator<Conductor> orderByComparator)
		throws NoSuchConductorException {
		Conductor conductor = fetchByCocheId_Last(cocheId, orderByComparator);

		if (conductor != null) {
			return conductor;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("cocheId=");
		msg.append(cocheId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchConductorException(msg.toString());
	}

	/**
	 * Returns the last conductor in the ordered set where cocheId = &#63;.
	 *
	 * @param cocheId the coche ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching conductor, or <code>null</code> if a matching conductor could not be found
	 */
	@Override
	public Conductor fetchByCocheId_Last(long cocheId,
		OrderByComparator<Conductor> orderByComparator) {
		int count = countByCocheId(cocheId);

		if (count == 0) {
			return null;
		}

		List<Conductor> list = findByCocheId(cocheId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Conductor[] findByCocheId_PrevAndNext(long conductorId,
		long cocheId, OrderByComparator<Conductor> orderByComparator)
		throws NoSuchConductorException {
		Conductor conductor = findByPrimaryKey(conductorId);

		Session session = null;

		try {
			session = openSession();

			Conductor[] array = new ConductorImpl[3];

			array[0] = getByCocheId_PrevAndNext(session, conductor, cocheId,
					orderByComparator, true);

			array[1] = conductor;

			array[2] = getByCocheId_PrevAndNext(session, conductor, cocheId,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Conductor getByCocheId_PrevAndNext(Session session,
		Conductor conductor, long cocheId,
		OrderByComparator<Conductor> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CONDUCTOR_WHERE);

		query.append(_FINDER_COLUMN_COCHEID_COCHEID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(ConductorModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(cocheId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(conductor);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Conductor> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the conductors where cocheId = &#63; from the database.
	 *
	 * @param cocheId the coche ID
	 */
	@Override
	public void removeByCocheId(long cocheId) {
		for (Conductor conductor : findByCocheId(cocheId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(conductor);
		}
	}

	/**
	 * Returns the number of conductors where cocheId = &#63;.
	 *
	 * @param cocheId the coche ID
	 * @return the number of matching conductors
	 */
	@Override
	public int countByCocheId(long cocheId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COCHEID;

		Object[] finderArgs = new Object[] { cocheId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CONDUCTOR_WHERE);

			query.append(_FINDER_COLUMN_COCHEID_COCHEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(cocheId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_COCHEID_COCHEID_2 = "conductor.cocheId = ?";

	public ConductorPersistenceImpl() {
		setModelClass(Conductor.class);

		try {
			Field field = ReflectionUtil.getDeclaredField(BasePersistenceImpl.class,
					"_dbColumnNames");

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("uuid", "uuid_");

			field.set(this, dbColumnNames);
		}
		catch (Exception e) {
			if (_log.isDebugEnabled()) {
				_log.debug(e, e);
			}
		}
	}

	/**
	 * Caches the conductor in the entity cache if it is enabled.
	 *
	 * @param conductor the conductor
	 */
	@Override
	public void cacheResult(Conductor conductor) {
		entityCache.putResult(ConductorModelImpl.ENTITY_CACHE_ENABLED,
			ConductorImpl.class, conductor.getPrimaryKey(), conductor);

		finderCache.putResult(FINDER_PATH_FETCH_BY_DNI,
			new Object[] { conductor.getDni() }, conductor);

		conductor.resetOriginalValues();
	}

	/**
	 * Caches the conductors in the entity cache if it is enabled.
	 *
	 * @param conductors the conductors
	 */
	@Override
	public void cacheResult(List<Conductor> conductors) {
		for (Conductor conductor : conductors) {
			if (entityCache.getResult(ConductorModelImpl.ENTITY_CACHE_ENABLED,
						ConductorImpl.class, conductor.getPrimaryKey()) == null) {
				cacheResult(conductor);
			}
			else {
				conductor.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all conductors.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ConductorImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the conductor.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Conductor conductor) {
		entityCache.removeResult(ConductorModelImpl.ENTITY_CACHE_ENABLED,
			ConductorImpl.class, conductor.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((ConductorModelImpl)conductor, true);
	}

	@Override
	public void clearCache(List<Conductor> conductors) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Conductor conductor : conductors) {
			entityCache.removeResult(ConductorModelImpl.ENTITY_CACHE_ENABLED,
				ConductorImpl.class, conductor.getPrimaryKey());

			clearUniqueFindersCache((ConductorModelImpl)conductor, true);
		}
	}

	protected void cacheUniqueFindersCache(
		ConductorModelImpl conductorModelImpl) {
		Object[] args = new Object[] { conductorModelImpl.getDni() };

		finderCache.putResult(FINDER_PATH_COUNT_BY_DNI, args, Long.valueOf(1),
			false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_DNI, args,
			conductorModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		ConductorModelImpl conductorModelImpl, boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] { conductorModelImpl.getDni() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_DNI, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_DNI, args);
		}

		if ((conductorModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_DNI.getColumnBitmask()) != 0) {
			Object[] args = new Object[] { conductorModelImpl.getOriginalDni() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_DNI, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_DNI, args);
		}
	}

	/**
	 * Creates a new conductor with the primary key. Does not add the conductor to the database.
	 *
	 * @param conductorId the primary key for the new conductor
	 * @return the new conductor
	 */
	@Override
	public Conductor create(long conductorId) {
		Conductor conductor = new ConductorImpl();

		conductor.setNew(true);
		conductor.setPrimaryKey(conductorId);

		String uuid = PortalUUIDUtil.generate();

		conductor.setUuid(uuid);

		conductor.setCompanyId(companyProvider.getCompanyId());

		return conductor;
	}

	/**
	 * Removes the conductor with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param conductorId the primary key of the conductor
	 * @return the conductor that was removed
	 * @throws NoSuchConductorException if a conductor with the primary key could not be found
	 */
	@Override
	public Conductor remove(long conductorId) throws NoSuchConductorException {
		return remove((Serializable)conductorId);
	}

	/**
	 * Removes the conductor with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the conductor
	 * @return the conductor that was removed
	 * @throws NoSuchConductorException if a conductor with the primary key could not be found
	 */
	@Override
	public Conductor remove(Serializable primaryKey)
		throws NoSuchConductorException {
		Session session = null;

		try {
			session = openSession();

			Conductor conductor = (Conductor)session.get(ConductorImpl.class,
					primaryKey);

			if (conductor == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchConductorException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(conductor);
		}
		catch (NoSuchConductorException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Conductor removeImpl(Conductor conductor) {
		conductor = toUnwrappedModel(conductor);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(conductor)) {
				conductor = (Conductor)session.get(ConductorImpl.class,
						conductor.getPrimaryKeyObj());
			}

			if (conductor != null) {
				session.delete(conductor);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (conductor != null) {
			clearCache(conductor);
		}

		return conductor;
	}

	@Override
	public Conductor updateImpl(Conductor conductor) {
		conductor = toUnwrappedModel(conductor);

		boolean isNew = conductor.isNew();

		ConductorModelImpl conductorModelImpl = (ConductorModelImpl)conductor;

		if (Validator.isNull(conductor.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			conductor.setUuid(uuid);
		}

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (conductor.getCreateDate() == null)) {
			if (serviceContext == null) {
				conductor.setCreateDate(now);
			}
			else {
				conductor.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!conductorModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				conductor.setModifiedDate(now);
			}
			else {
				conductor.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (conductor.isNew()) {
				session.save(conductor);

				conductor.setNew(false);
			}
			else {
				conductor = (Conductor)session.merge(conductor);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!ConductorModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { conductorModelImpl.getUuid() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
				args);

			args = new Object[] {
					conductorModelImpl.getUuid(),
					conductorModelImpl.getCompanyId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
				args);

			args = new Object[] { conductorModelImpl.getCocheId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_COCHEID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COCHEID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((conductorModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						conductorModelImpl.getOriginalUuid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { conductorModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((conductorModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						conductorModelImpl.getOriginalUuid(),
						conductorModelImpl.getOriginalCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						conductorModelImpl.getUuid(),
						conductorModelImpl.getCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}

			if ((conductorModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COCHEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						conductorModelImpl.getOriginalCocheId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COCHEID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COCHEID,
					args);

				args = new Object[] { conductorModelImpl.getCocheId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COCHEID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COCHEID,
					args);
			}
		}

		entityCache.putResult(ConductorModelImpl.ENTITY_CACHE_ENABLED,
			ConductorImpl.class, conductor.getPrimaryKey(), conductor, false);

		clearUniqueFindersCache(conductorModelImpl, false);
		cacheUniqueFindersCache(conductorModelImpl);

		conductor.resetOriginalValues();

		return conductor;
	}

	protected Conductor toUnwrappedModel(Conductor conductor) {
		if (conductor instanceof ConductorImpl) {
			return conductor;
		}

		ConductorImpl conductorImpl = new ConductorImpl();

		conductorImpl.setNew(conductor.isNew());
		conductorImpl.setPrimaryKey(conductor.getPrimaryKey());

		conductorImpl.setUuid(conductor.getUuid());
		conductorImpl.setConductorId(conductor.getConductorId());
		conductorImpl.setCompanyId(conductor.getCompanyId());
		conductorImpl.setUserId(conductor.getUserId());
		conductorImpl.setUserName(conductor.getUserName());
		conductorImpl.setCreateDate(conductor.getCreateDate());
		conductorImpl.setModifiedDate(conductor.getModifiedDate());
		conductorImpl.setNombre(conductor.getNombre());
		conductorImpl.setApellido(conductor.getApellido());
		conductorImpl.setDni(conductor.getDni());
		conductorImpl.setFechaNacimiento(conductor.getFechaNacimiento());
		conductorImpl.setFotoDniId(conductor.getFotoDniId());
		conductorImpl.setCocheId(conductor.getCocheId());

		return conductorImpl;
	}

	/**
	 * Returns the conductor with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the conductor
	 * @return the conductor
	 * @throws NoSuchConductorException if a conductor with the primary key could not be found
	 */
	@Override
	public Conductor findByPrimaryKey(Serializable primaryKey)
		throws NoSuchConductorException {
		Conductor conductor = fetchByPrimaryKey(primaryKey);

		if (conductor == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchConductorException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return conductor;
	}

	/**
	 * Returns the conductor with the primary key or throws a {@link NoSuchConductorException} if it could not be found.
	 *
	 * @param conductorId the primary key of the conductor
	 * @return the conductor
	 * @throws NoSuchConductorException if a conductor with the primary key could not be found
	 */
	@Override
	public Conductor findByPrimaryKey(long conductorId)
		throws NoSuchConductorException {
		return findByPrimaryKey((Serializable)conductorId);
	}

	/**
	 * Returns the conductor with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the conductor
	 * @return the conductor, or <code>null</code> if a conductor with the primary key could not be found
	 */
	@Override
	public Conductor fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(ConductorModelImpl.ENTITY_CACHE_ENABLED,
				ConductorImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		Conductor conductor = (Conductor)serializable;

		if (conductor == null) {
			Session session = null;

			try {
				session = openSession();

				conductor = (Conductor)session.get(ConductorImpl.class,
						primaryKey);

				if (conductor != null) {
					cacheResult(conductor);
				}
				else {
					entityCache.putResult(ConductorModelImpl.ENTITY_CACHE_ENABLED,
						ConductorImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(ConductorModelImpl.ENTITY_CACHE_ENABLED,
					ConductorImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return conductor;
	}

	/**
	 * Returns the conductor with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param conductorId the primary key of the conductor
	 * @return the conductor, or <code>null</code> if a conductor with the primary key could not be found
	 */
	@Override
	public Conductor fetchByPrimaryKey(long conductorId) {
		return fetchByPrimaryKey((Serializable)conductorId);
	}

	@Override
	public Map<Serializable, Conductor> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Conductor> map = new HashMap<Serializable, Conductor>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Conductor conductor = fetchByPrimaryKey(primaryKey);

			if (conductor != null) {
				map.put(primaryKey, conductor);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(ConductorModelImpl.ENTITY_CACHE_ENABLED,
					ConductorImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (Conductor)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_CONDUCTOR_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append((long)primaryKey);

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (Conductor conductor : (List<Conductor>)q.list()) {
				map.put(conductor.getPrimaryKeyObj(), conductor);

				cacheResult(conductor);

				uncachedPrimaryKeys.remove(conductor.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(ConductorModelImpl.ENTITY_CACHE_ENABLED,
					ConductorImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the conductors.
	 *
	 * @return the conductors
	 */
	@Override
	public List<Conductor> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Conductor> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<Conductor> findAll(int start, int end,
		OrderByComparator<Conductor> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<Conductor> findAll(int start, int end,
		OrderByComparator<Conductor> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Conductor> list = null;

		if (retrieveFromCache) {
			list = (List<Conductor>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CONDUCTOR);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CONDUCTOR;

				if (pagination) {
					sql = sql.concat(ConductorModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Conductor>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Conductor>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the conductors from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Conductor conductor : findAll()) {
			remove(conductor);
		}
	}

	/**
	 * Returns the number of conductors.
	 *
	 * @return the number of conductors
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CONDUCTOR);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ConductorModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the conductor persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(ConductorImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = CompanyProviderWrapper.class)
	protected CompanyProvider companyProvider;
	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_CONDUCTOR = "SELECT conductor FROM Conductor conductor";
	private static final String _SQL_SELECT_CONDUCTOR_WHERE_PKS_IN = "SELECT conductor FROM Conductor conductor WHERE conductorId IN (";
	private static final String _SQL_SELECT_CONDUCTOR_WHERE = "SELECT conductor FROM Conductor conductor WHERE ";
	private static final String _SQL_COUNT_CONDUCTOR = "SELECT COUNT(conductor) FROM Conductor conductor";
	private static final String _SQL_COUNT_CONDUCTOR_WHERE = "SELECT COUNT(conductor) FROM Conductor conductor WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "conductor.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Conductor exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Conductor exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(ConductorPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
}