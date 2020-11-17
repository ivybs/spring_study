package com.ibs.service;

import com.ibs.dao.UserDao;
import com.ibs.dao.UserDaoImp;
import com.ibs.dao.UserDaoMysqlImp;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImp implements UserService {
//        UserDao userDao = new UserDaoImp();
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }


}
