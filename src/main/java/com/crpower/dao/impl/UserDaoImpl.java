package com.crpower.dao.impl;

import com.crpower.dao.IUserDao;
import com.crpower.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class UserDaoImpl implements IUserDao {
    private SqlSessionFactory factory;
    public UserDaoImpl(SqlSessionFactory factory) {
        this.factory = factory;
    }
    public List<User> findAll(){
        SqlSession session = factory.openSession();
        List<User> users = session.selectList("com.crpower.dao.IUserDao.findAll");
        session.close();
        return users;
    }

}
