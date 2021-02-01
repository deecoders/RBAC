package com.deepanshu.Dao;

import com.deepanshu.Model.ActionType;
import com.deepanshu.Model.RoleResourceAcess;

import java.util.List;

public interface RoleResourceAccessDao {
    public void addRoleResourceAccess(String roleName, String resourceName, String actionTypes);
    public void deleteRoleResourceAccess(String roleName, String resourceName);
    public void getAccessTypes(String roleName, String resourceName);
}
