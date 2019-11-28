package com.zlj.edu.service.base;

import com.zlj.edu.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author zlj
 * @version 1.8
 * @date 2019/11/28 11:06
 */
public abstract class BaseServiceImpl<T> implements IBaseService<T>{

//    统一管理dao
    @Autowired
       protected UserMapper userMapper;
}
