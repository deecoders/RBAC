package com.deepanshu;

import com.deepanshu.Dao.RoleResourceAccessDao;
import com.deepanshu.DaoImpl.RoleResourceAccessDaoImpl;
import com.deepanshu.DaoImpl.UserRoleDaoImpl;
import com.deepanshu.Model.User;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

public class DisplayControlUser implements DisplayControl{
    User user;
    boolean exit=false;
    Scanner sc = new Scanner(System.in);

    public DisplayControlUser(User user) {
        this.user=user;
    }

    boolean isExit(){
        return this.exit;
    }

    @Override
    public void display() {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int option;
        while(!isExit()){
            System.out.println("Press 1 to view roles\nPress 2 to view resource access\nPress 3 to exit");
            try {
                option = Integer.parseInt(input.readLine());
                List<String> roles = new UserRoleDaoImpl().getUserRoles(user.getUsername());
                switch (option) {
                    case 1:
                        System.out.println("Your roles are : ");
                        for (int i = 0; i < roles.size(); i++) {
                            System.out.println(roles.get(i));
                        }
                        break;
                    case 2:
                        System.out.println("Enter Resource Name");
                        String resourceName;
                        resourceName = input.readLine();
                        System.out.println("Geting  access type for " + resourceName);
                        for (int i = 0; i < roles.size(); i++) {
                            System.out.println("Access type as " + roles.get(i));
                            new RoleResourceAccessDaoImpl().getAccessTypes(roles.get(i), resourceName);
                        }
                        break;
                    case 3:
                        this.exit = true;
                        break;
                }
            }
            catch(Exception e){}
        }
    }
}
