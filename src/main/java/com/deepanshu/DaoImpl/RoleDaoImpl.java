package com.deepanshu.DaoImpl;

import com.deepanshu.Dao.RoleDao;
import com.deepanshu.Model.Role;

import java.util.ArrayList;
import java.util.List;

public class RoleDaoImpl implements RoleDao {

    static List<Role> roles;
    public RoleDaoImpl() {
    }

    public static void init(){
        roles = new ArrayList<Role>();
        Role role1= new Role("Admin");
        Role role2= new Role("Accountant");
        Role role3= new Role("Developer");
        roles.add(role1);
        roles.add(role2);
        roles.add(role3);
    }

    @Override
    public void addRole(Role role) {
        roles.add(role);
    }

    @Override
    public List<Role> getAllRoles() {
        return roles;
    }

    public static void printAllRoles(){

        for(int i=0;i< roles.size();i++){
            System.out.println(roles.get(i).toString());
        }
    }
}
