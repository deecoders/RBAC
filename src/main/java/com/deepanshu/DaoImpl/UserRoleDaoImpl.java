package com.deepanshu.DaoImpl;

import com.deepanshu.Dao.UserRoleDao;
import com.deepanshu.Model.UserRole;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class UserRoleDaoImpl implements UserRoleDao {
    static List<UserRole> userRoles;
    public UserRoleDaoImpl() {
    }

    public static void init(){
        userRoles = new ArrayList<UserRole>();
        UserRole userRole1= new UserRole("admin","Admin");
        UserRole userRole2= new UserRole("anksh","Developer");
        UserRole userRole3= new UserRole("anksh","Accountant");
        UserRole userRol4= new UserRole("shkaya","Accountant");
        userRoles.add(userRole1);
        userRoles.add(userRole2);
        userRoles.add(userRole3);
        userRoles.add(userRol4);
    }

    @Override
    public void addRoleToUser(String userName, String roleName) {
        UserRole userRole=new UserRole(userName, roleName);
        userRoles.add(userRole);
    }

    @Override
    public void deleteRoleFromUser(String userName, String roleName) {
        for(int i=0;i<userRoles.size();i++){
            if(userRoles.get(i).getUserName().equals(userName) && userRoles.get(i).getRoleName().equals(roleName)){
                userRoles.remove(i);
            }
        }
    }

    public void deleteAllRolesForUser(String username){
        for(int i=0;i<userRoles.size();i++){
            deleteRoleFromUser(username,userRoles.get(i).getRoleName());
        }
    }

    public List<String> getUserRoles(String username){
        List<String> roles = new ArrayList<String>();
        for(int i=0;i<userRoles.size();i++){
            if(userRoles.get(i).getUserName().equals(username))
                roles.add(userRoles.get(i).getRoleName());
        }
        return roles;
    }

    public static void printAllUserRoles(){

        for(int i=0;i< userRoles.size();i++){
            System.out.println(userRoles.get(i).toString());
        }
    }
}
