package com.myth.dao;

import com.myth.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @author myth
 * @Date 2020-06-27 15:41
 */
public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {
    public List<User> queryUser() {
        return getSqlSession().getMapper(UserMapper.class).queryUser();
    }

    public int addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    public int deleteUser(int id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }
}
