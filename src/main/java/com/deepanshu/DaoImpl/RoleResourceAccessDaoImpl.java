package com.deepanshu.DaoImpl;

import com.deepanshu.Dao.RoleResourceAccessDao;
import com.deepanshu.Model.ActionType;
import com.deepanshu.Model.Resource;
import com.deepanshu.Model.RoleResourceAcess;

import java.util.ArrayList;
import java.util.List;

public class RoleResourceAccessDaoImpl implements RoleResourceAccessDao {

    static List<RoleResourceAcess> roleResourceAccess;
    public RoleResourceAccessDaoImpl() {
    }

    public static void init(){
        roleResourceAccess=new ArrayList<RoleResourceAcess>();
        List<String> editAccess = new ArrayList<String>();
        List<String> viewAccess = new ArrayList<String>();
        editAccess.add("View");
        editAccess.add("Edit");
        viewAccess.add("View");
        RoleResourceAcess roleResourceAcess1= new RoleResourceAcess("Admin","Payroll",editAccess);
        roleResourceAccess.add(roleResourceAcess1);
        roleResourceAcess1= new RoleResourceAcess("Admin","Production",viewAccess);
        roleResourceAccess.add(roleResourceAcess1);
        roleResourceAcess1= new RoleResourceAcess("Accountant","Payroll",editAccess);
        roleResourceAccess.add(roleResourceAcess1);
        roleResourceAcess1= new RoleResourceAcess("Accountant","Production",viewAccess);
        roleResourceAccess.add(roleResourceAcess1);
        roleResourceAcess1= new RoleResourceAcess("Developer","Production",editAccess);
        roleResourceAccess.add(roleResourceAcess1);
        roleResourceAcess1= new RoleResourceAcess("Developer","Payroll",viewAccess);
        roleResourceAccess.add(roleResourceAcess1);

    }

    @Override
    public void addRoleResourceAccess(String roleName, String resourceName,String actionType) {
        RoleResourceAcess roleResourceAccess1;
        List<String> actionTypeList = new ArrayList<String>();
        if("View".equals(actionType)){
            actionTypeList.add("View");
            roleResourceAccess1 = new RoleResourceAcess(roleName,resourceName,actionTypeList);
            roleResourceAccess.add(roleResourceAccess1);
            actionTypeList.clear();
        }
        else if("Edit".equals(actionType)){
            actionTypeList.add("View");
            actionTypeList.add("Edit");
            roleResourceAccess1=new RoleResourceAcess(roleName,resourceName,actionTypeList);
            roleResourceAccess.add(roleResourceAccess1);
            actionTypeList.clear();
        }
        else {
            System.out.println("Action type undefined");
        }
    }

    @Override
    public void deleteRoleResourceAccess(String roleName, String resourceName) {

    }

    @Override
    public void getAccessTypes(String roleName, String resourceName) {
        List<String> accessList;
        for(int i=0;i<roleResourceAccess.size();i++){
            if(roleResourceAccess.get(i).getRoleName().equals(roleName) && roleResourceAccess.get(i).getResourceName().equals(resourceName)){
                System.out.println(roleResourceAccess.get(i).printAllActionTypes());
                return;
            }
        }
        System.out.println("Data not found for given resource name and role name");
        return;
    }
}
