package com.zlj.edu.service;

import com.zlj.edu.model.User;
import com.zlj.edu.service.base.BaseServiceImpl;
import com.zlj.edu.service.base.IBaseService;

/**
 * @author zlj
 * @version 1.8
 * @date 2019/11/28 11:12
 */
public interface IUserService extends IBaseService<User> {

    public User login(String username ,String password);
}
