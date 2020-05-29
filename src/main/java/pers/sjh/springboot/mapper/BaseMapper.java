package pers.sjh.springboot.mapper;

import pers.sjh.springboot.condition.BaseCondition;

import java.io.Serializable;
import java.util.List;

/**
 * @author SunJinHang
 * @date 2020-05-18 16:32
 */
public interface BaseMapper<T> {

    int create(T obj);

    int update(T obj);

    int delete(T obj);

    T findById(Serializable id);

    T findByCode(Serializable id);

    T findOne(T obj);

    List<T> find(T obj);

    List<T> findAll();

    List searchList(BaseCondition condition);

    int searchCount(BaseCondition condition);
}
