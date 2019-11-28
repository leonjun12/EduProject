package com.zlj.edu.mapper.base;

import com.zlj.edu.model.User;

/**
 * @author zlj
 * @version 1.8
 * @date 2019/11/28 10:50
 */
public interface BaseMapper<T> {

    public T findById(Integer id);

    public T findByUUId(String uuid);

    public void deleteById(Integer id);

    public void deleteByUUId(String  uid);

    public void update(T t);

    public void insert(T t);
}
