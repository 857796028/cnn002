package com.itheima.bos.dao;

import org.apache.poi.ss.formula.functions.T;

import java.io.Serializable;
import java.util.List;

/**
 * Created by zgc on 11 : 2018/11/10 0010 : 下午 4:29
 */
public interface IBaseDao<T> {
    public void save(T entity);
    public void delete(T entity);
    public void update(T entity);
    public T findById(Serializable id);

    public List<T> findAll();

}
