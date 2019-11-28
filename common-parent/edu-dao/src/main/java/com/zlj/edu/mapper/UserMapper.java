package com.zlj.edu.mapper;

import com.zlj.edu.mapper.base.BaseMapper;
import com.zlj.edu.model.User;

/**
 * @author zlj
 * @version 1.8
 * @date 2019/11/28 10:43
 */
public interface UserMapper extends BaseMapper<User> {

    public User findById(Integer id);

    public void deleteById(Integer id);

    public void update(User user);

    public void insert(User user);

}
