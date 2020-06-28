package com.myth.dao;

import com.myth.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @author myth
 * @Date 2020-06-27 15:41
 */
public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {
    public List<User> queryUser() {
        return getSqlSession().getMapper(UserMapper.class).queryUser();
//        SqlSession sqlSession = getSqlSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        return mapper.queryUser();
    }
}
