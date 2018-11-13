package com.itheima.bos.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Created by zgc on 11 : 2018/11/10 0010 : 下午 4:45
 */
public class BaseAction<T> extends ActionSupport implements ModelDriven<T>{

private  T model;
    @Override
    public T getModel() {
        return null;
    }
    public BaseAction( ){
        ParameterizedType superclass1 = (ParameterizedType) this.getClass().getGenericSuperclass();
        Type[] actualTypeArguments = superclass1.getActualTypeArguments();
        Class<T> entityClass = (Class<T>) actualTypeArguments[0];
        try {
            model = entityClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
    
}
