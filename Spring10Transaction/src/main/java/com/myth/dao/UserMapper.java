package com.myth.dao;

import com.myth.pojo.User;

import java.util.List;

/**
 * @author myth
 * @Date 2020-06-27 12:06
 */
public interface UserMapper {
    List<User> queryUser();

    //添加一个用户
    int addUser(User user);

    //根据id删除用户
    int deleteUser(int id);
}
