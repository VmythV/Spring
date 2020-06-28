package com.myth.dao;

import com.myth.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @author myth
 * @Date 2020-06-27 14:35
 */
public class UserMapperImpl implements UserMapper {

    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<User> queryUser() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.queryUser();
    }
}
