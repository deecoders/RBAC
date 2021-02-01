package com.deepanshu;

import com.deepanshu.Model.User;

public interface Authentication {
    public User login(String username, String password);
}
