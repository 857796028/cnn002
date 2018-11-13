package com.itheima.bos.dao.impl;

import com.itheima.bos.dao.IBaseDao;
import org.hibernate.Hibernate;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import javax.annotation.Resource;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Set;

/**
 * Created by zgc on 11 : 2018/11/10 0010 : 下午 4:32
 */
public class BaseDaoImpl<T> extends HibernateDaoSupport implements IBaseDao<T>{
    private Class<T> entityClass;
    @Resource //注入spring工厂 中的对象 sessionFactory
    public void setMySessionFactory(SessionFactory sessionFactory){
        super.setSessionFactory(sessionFactory);

    }

//生成构造 方法
    public BaseDaoImpl() {
        ParameterizedType superclass= (ParameterizedType) this.getClass().getGenericSuperclass();
        Type[] actualTypeArguments = superclass.getActualTypeArguments();
        entityClass = (Class<T>) actualTypeArguments[0];
    }

    @Override
    public void save(T entity) {
        this.getHibernateTemplate().save(entity);
    }

    @Override
    public void delete(T entity) {
        this.getHibernateTemplate().delete(entity);
    }

    @Override
    public void update(T entity) {
        this.getHibernateTemplate().update(entity);
    }

    @Override
    public T findById(Serializable id) {
       return  this.getHibernateTemplate().get(entityClass,id);
    }

    @Override
    public List<T> findAll() {
        String hql  = "FROM " + entityClass.getSimpleName();
        List<T> list = (List<T>) this.getHibernateTemplate().find(hql);
        return list;
    }
}
