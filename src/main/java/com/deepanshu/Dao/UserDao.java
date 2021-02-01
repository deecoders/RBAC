package com.deepanshu.Dao;

import com.deepanshu.Model.User;

import java.util.List;

public interface UserDao {

    public User getUser(String username);
    public void deleteUser(String userName);
    public void addUser(User user);
    public List<User> getAllUsers();
}
