package com.deepanshu.DaoImpl;

import com.deepanshu.Dao.ResourceDao;
import com.deepanshu.Model.Resource;
import com.deepanshu.Model.User;

import java.util.ArrayList;
import java.util.List;

public class ResourceDaoImpl implements ResourceDao {

    static List<Resource> resources;
    public ResourceDaoImpl() {
    }

    public static void init(){
        resources = new ArrayList<Resource>();
        Resource resource1 = new Resource("Payroll");
        Resource resource2 = new Resource("Production");
        resources.add(resource1);
        resources.add(resource2);
    }

    @Override
    public void addResource(String resourceName) {

    }

    @Override
    public void deleteResource(String resourceName) {

    }

    public static void printAllResources(){

        for(int i=0;i< resources.size();i++){
            System.out.println(resources.get(i).toString());
        }
    }
}
