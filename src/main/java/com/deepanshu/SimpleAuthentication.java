package com.deepanshu;

import com.deepanshu.Dao.UserDao;
import com.deepanshu.DaoImpl.UserDaoImpl;
import com.deepanshu.Model.User;

public class SimpleAuthentication implements Authentication{

    @Override
    public User login(String username, String password) {
        UserDao userDao=new UserDaoImpl();
        User user=userDao.getUser(username);
        if(user!=null && password.equals(user.getPassword())){
            return user;
        }
        return null;
    }
}
