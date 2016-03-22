/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sf.kyc.vas.dao;

import com.sf.kyc.vas.util.Utilities;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import lombok.extern.log4j.Log4j;
import nw.orm.core.IEntity;
import org.hibernate.Criteria;
import org.hibernate.FlushMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


/**
 *
 * @author UCHECHUKWU
 * @param <T>
 */
@SuppressWarnings("unchecked")
@Log4j
@Repository
public abstract class AbstractSpringHibernateBaseDao<T extends IEntity> {

    private Class< T> clazz;

    @Autowired
    SessionFactory sessionFactory;

    public final void setClazz(Class< T> clazzToSet) {
        this.clazz = clazzToSet;
    }

    /**
     *
     * @return
     */
    protected final Session getSession() {
        Session session = null;
        session = sessionFactory.getCurrentSession();
        session.setFlushMode(FlushMode.ALWAYS);
        return session;
    }

    @Transactional
    public void delete(T object) {
        try {
            getSession().delete(object);
        } catch (Exception ex) {
            log.error(ex.getMessage());
            log.error(ex.getStackTrace().toString());
        }
    }

    @Transactional
    public T load(Serializable id) {
        return (T) getSession().get(clazz, id);
    }

    @Transactional
    public long create(T object) {
        long id = 0;
        try {
            id = (Long) getSession().save(object);
        } catch (Exception ex) {
            log.error(ex.getMessage());
            log.error(ex.getStackTrace().toString());
        }
        return id;
    }

    @Transactional
    public void save(T object) {
        try {
            getSession().saveOrUpdate(object);
        } catch (Exception ex) {
            log.error(ex.getMessage());
            log.error(ex.getStackTrace().toString());
        }
    }

    @Transactional
    public synchronized void syncSave(T object) {
        try {
            getSession().saveOrUpdate(object);
        } catch (Exception ex) {
            log.error(ex.getMessage());
            log.error(ex.getStackTrace().toString());
        }
    }

    @Transactional
    public List<T> findAll() {
        Criteria criteria = getSession().createCriteria(clazz);
        criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);
        return criteria.list();
    }

    @Transactional
    public List<T> findAll(int start, int size) {
        Criteria criteria = getSession().createCriteria(clazz);
        criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);
        criteria.setFetchSize(start);
        criteria.setFetchSize(size);
        return criteria.list();
    }

    @Transactional
    public int countAll() {
        Criteria criteria = getSession().createCriteria(clazz);
        criteria.setProjection(Projections.rowCount());
        return ((Long) criteria.uniqueResult()).intValue();
    }

    /* finders utils */
    public <T> T executeQueryUniqueResult(String query) {
        return (T) executeQueryUniqueResult(query, new ArrayList());
    }

    public <T> T executeQueryUniqueResult(String query, Object param) {
        List paramList = new ArrayList();
        paramList.add(param);
        return (T) executeQueryUniqueResult(query, paramList);
    }

    public <T> T executeQueryUniqueResult(String query, List paramsList) {
        T result = null;
        Session session = null;
        try {
            session = getSession();
            Query q = session.createQuery(query);
            if (paramsList != null) {
                for (int i = 0; i < paramsList.size(); i++) {
                    q.setParameter(i, paramsList.get(i));
                }
            }
            result = (T) q.uniqueResult();
        } catch (Exception ex) {
            log.error(ex.getMessage());
            log.error(ex.getStackTrace().toString());
        }
        return result;
    }

    @Transactional
    public <T> T executeQueryUniqueResult(String query,
            Map<String, Object> paramsMap) {
        T result = null;
        Session session = null;
        try {
            session = getSession();
            Query q = session.createQuery(query);
            if (paramsMap != null) {
                for (String key : paramsMap.keySet()) {
                    q.setParameter(key, paramsMap.get(key));
                }
            }
            result = (T) q.uniqueResult();
        } catch (Exception ex) {
            String message = Utilities.getStackTrace(ex);
            log.error(message);
            log.error(ex.getMessage());
            log.error(ex.getStackTrace().toString());
        }
        return result;
    }

    public <T> List<T> executeQuery(String query, Object param) {
        List paramList = new ArrayList();
        paramList.add(param);
        return executeQuery(query, paramList);
    }

    public <T> List<T> executeQuery(String query, Object param, int start,
            int size) {
        List paramList = new ArrayList();
        paramList.add(param);
        return executeQuery(query, paramList, start, size);
    }

    public <T> List<T> executeQuery(String query, List paramsList) {
        List<T> entityList = new ArrayList<>();
        Session session = null;
        try {
            session = getSession();
            Query q = session.createQuery(query);
            if (paramsList != null) {
                for (int i = 0; i < paramsList.size(); i++) {
                    q.setParameter(i, paramsList.get(i));
                }
            }
            entityList = q.list();
        } catch (Exception ex) {
            log.error(ex.getMessage());
            log.error(ex.getStackTrace().toString());
        }
        return entityList;
    }

    /*
     * Note Hibernate doesnt allow Date and TimeStamp parameters to be set
     * dynamically without specifying the types
     */
    public <T> List<T> executeQuery(String query, int start, int size) {
        return executeQuery(query, new ArrayList(), start, size);
    }

    public <T> List<T> executeQuery(String query, List paramsList, int start,
            int size) {
        List<T> entityList = new ArrayList<>();
        Session session = null;
        try {
            session = getSession();
            Query q = session.createQuery(query);
            if (paramsList != null) {
                for (int i = 0; i < paramsList.size(); i++) {
                    q.setParameter(i, paramsList.get(i));
                }
            }
            q.setFirstResult(start);
            q.setMaxResults(size);
            entityList = q.list();
        } catch (Exception ex) {
            log.error(ex.getMessage());
            log.error(ex.getStackTrace().toString());
        }
        return entityList;
    }

    public <T> List<T> executeQuery(String query, Map<String, Object> paramsMap) {
        List<T> entityList = new ArrayList<>();
        Session session = null;
        try {
            session = getSession();
            Query q = session.createQuery(query);
            if (paramsMap != null) {
                for (String key : paramsMap.keySet()) {
                    q.setParameter(key, paramsMap.get(key));
                }
            }
            entityList = q.list();
        } catch (Exception ex) {
            log.error(ex.getMessage());
            log.error(ex.getStackTrace().toString());
        }
        return entityList;
    }

    public <T> List<T> executeNativeQuery(String query, Map<String, Object> paramsMap) {
        List<T> entityList = new ArrayList<>();
        Session session = null;
        try {
            session = getSession();
            Query q = session.createSQLQuery(query).addEntity(clazz);
            if (paramsMap != null) {
                for (String key : paramsMap.keySet()) {
                    q.setParameter(key, paramsMap.get(key));
                }
            }
            entityList = q.list();
        } catch (Exception ex) {
            log.error(ex.getMessage());
            log.error(ex.getStackTrace().toString());
        }
        return entityList;
    }

    public <T> List<T> executeQuery(String query) {
        List<T> entityList = new ArrayList<>();
        Session session = null;
        try {
            session = getSession();
            Query q = session.createQuery(query);
            entityList = q.list();
        } catch (Exception ex) {
            log.error(ex.getMessage());
            log.error(ex.getStackTrace().toString());
        }
        return entityList;
    }

    public Object getObjectById(Class record, Long recordId) {
        Session session = null;
        Object object = null;
        try {
            session = getSession();
            object = session.get(record, recordId);
        } catch (Exception ex) {
            log.error(ex.getMessage());
            log.error(ex.getStackTrace().toString());
        }
        return object;
    }

    /*
     * Note Hibernate doesnt allow Date and TimeStamp paramters to be set
     * dynamically without specifying the types
     */
    public <T> List<T> executeQuery(String query,
            Map<String, Object> paramsMap, int start, int size) {
        List<T> entityList = new ArrayList<>();
        Session session = null;
        try {
            session = getSession();
            Query q = session.createQuery(query);
            if (paramsMap != null) {
                for (String key : paramsMap.keySet()) {
                    q.setParameter(key, paramsMap.get(key));
                }
            }
            q.setFirstResult(start);
            q.setMaxResults(size);
            entityList = q.list();
        } catch (Exception ex) {
            log.error(ex.getMessage());
            log.error(ex.getStackTrace().toString());
        }
        return entityList;
    }

    public Collection getAllRecordsByParameterId(Class manyClass, Class oneClass, java.lang.Long parameterId, int pageIndex, int pageSize) {
        java.lang.String strOneClass = getProcessedClassName(oneClass);
        java.lang.String hql = "SELECT c FROM " + manyClass.getName() + " c WHERE c." + strOneClass + ".id=" + parameterId;
        org.hibernate.Query query = getSession().createQuery(hql);
        query.setFirstResult(pageIndex);
        query.setMaxResults(pageSize);
        Collection returnCol = (Collection) query.list();
        return returnCol;
    }

    public Object getSingleRecordByParameterId(Class singleClass, Class oneClass, java.lang.Long parameterId) {
        java.lang.String strOneClass = getProcessedClassName(oneClass);
        java.lang.String hql = "SELECT c FROM " + singleClass.getName() + " c WHERE c." + strOneClass + ".id=" + parameterId;
        org.hibernate.Query query = getSession().createQuery(hql);

        return query.uniqueResult();
    }

    private java.lang.String getProcessedClassName(java.lang.Class clazz) {
        java.lang.String retString = clazz + "";
        retString = retString.substring(retString.lastIndexOf("."));

        retString = retString.substring(1, 2).toLowerCase() + "" + retString.substring(2);
        return retString;
    }

}
