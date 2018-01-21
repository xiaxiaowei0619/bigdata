package com.it18zhang.eshop.service.impl;

import com.it18zhang.eshop.dao.BaseDao;
import com.it18zhang.eshop.service.BaseService;

import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * BaseService实现类。
 * @param <T>
 */
public abstract class BaseServiceImpl<T> implements BaseService<T>{
    private BaseDao<T> dao;

    private Class<T> clazz;

    public BaseServiceImpl(){
        ParameterizedType type = (ParameterizedType)this.getClass().getGenericSuperclass();
        clazz = (Class) type.getActualTypeArguments()[0];
    }

    public void setDao(BaseDao<T> dao) {
        this.dao = dao;
    }

    public void saveEntity(T t) {
        dao.saveEntity(t);
    }

    public void updateEntity(T t) {
         dao.updateEntity(t);
    }

    public void saveOrUpdateEntity(T t) {
         dao.saveOrUpdateEntity(t);
    }

    public void deleteEntity(T t) {
         dao.deleteEntity(t);
    }

    public T getEntity(Integer id) {
        return dao.getEntity(id);
    }

    public List<T> findByHOL(String hql, Object... objects) {
        return dao.findByHOL(hql,objects);
    }

    public void execHQL(String hql, Object... objects) {
         dao.execHQL(hql, objects);
    }

    //查询所有实体
    public List<T> findAllEntities(){
        String hql = "from " + clazz.getSimpleName();
        return this.findByHOL(hql);
    };
}
