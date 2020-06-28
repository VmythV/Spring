package com.myth.dao;

import com.myth.pojo.User;

import java.util.List;

/**
 * @author myth
 * @Date 2020-06-27 12:06
 */
public interface UserMapper {
    List<User> queryUser();
}
