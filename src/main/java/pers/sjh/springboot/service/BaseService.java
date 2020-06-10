package pers.sjh.springboot.service;

import pers.sjh.springboot.condition.BaseCondition;
import pers.sjh.springboot.domain.common.Result;

import java.util.List;

/**
 * @author SunJinHang
 * @date 2020-06-05 09:56
 */
public interface BaseService<T> {

    Result<Object>  create(T obj);

    Result<Object>  update(T obj);

    Result<Object>  delete(T obj);

    List<T> findAll();

    T findById(String id);

}
