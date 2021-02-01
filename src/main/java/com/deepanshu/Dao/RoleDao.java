package com.deepanshu.Dao;

import com.deepanshu.Model.Role;

import java.util.List;

public interface RoleDao {
    public void addRole(Role role);
    public List<Role> getAllRoles();
}
