package com.deepanshu.Dao;

import java.util.UUID;

public interface UserRoleDao {

    void addRoleToUser(String userName, String roleName);
    void deleteRoleFromUser(String userName, String roleName);
}
