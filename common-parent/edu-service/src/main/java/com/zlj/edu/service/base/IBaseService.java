package com.zlj.edu.service.base;

/**
 * @author zlj
 * @version 1.8
 * @date 2019/11/28 11:04
 */
public interface IBaseService<T> {
    public T findById(Integer id);

    public T findByUUId(String uuid);

    public void deleteById(Integer id);

    public void deleteByUUId(String  uid);

    public void update(T t);

    public void insert(T t);
}
