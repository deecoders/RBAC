package com.deepanshu;

import com.deepanshu.DaoImpl.RoleDaoImpl;
import com.deepanshu.DaoImpl.UserDaoImpl;
import com.deepanshu.DaoImpl.UserRoleDaoImpl;
import com.deepanshu.Model.Role;
import com.deepanshu.Model.User;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class DisplayControlAdmin implements DisplayControl{
    User user;
    boolean exit=false;
    public DisplayControlAdmin(User user) {
        this.user=user;
    }

    @Override
    public void display() {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int option;
        System.out.println("In admin control");
        while(!exit){
            System.out.println("Press 1 to add a user\nPresss 2 to delete user" +
                    "\nPress 3 to edit role of a user"+
                    "\nPress 4 to view all roles of a user\nPress 5 to view all users\nAny other key to exit");
            try {
                option = Integer.parseInt(input.readLine());
                switch (option){
                    case 1:
                        String username, name, password;
                        System.out.println("Enter username(unique)");
                        username=input.readLine();
                        System.out.println("Enter name");
                        name=input.readLine();
                        System.out.println("Enter password");
                        password=input.readLine();

                        User user=new User(username,name,password);
                        new UserDaoImpl().addUser(user);
                        break;
                    case 2:
                        System.out.println("Enter username to delete");
                        username=input.readLine();
                        new UserDaoImpl().deleteUser(username);
                        break;
                    case 3:
                        System.out.println("Enter username whose roles need to be edited");
                        username=input.readLine();
                        new UserRoleDaoImpl().deleteAllRolesForUser(username);
                        System.out.println("For each role press 1 to assign/0 to skip");
                        List<Role> roles=new RoleDaoImpl().getAllRoles();
                        for(int i=0;i<roles.size();i++){
                            System.out.println(roles.get(i).getName());
                            option=Integer.parseInt(input.readLine());
                            if(option==1){
                                new UserRoleDaoImpl().addRoleToUser(username,roles.get(i).getName());
                            }
                        }
                        System.out.println("Roles edited successsfully");
                        break;
                    case 4:
                        System.out.println("Enter username whose roles need to be viewed");
                        username=input.readLine();
                        List<String> roleList=new UserRoleDaoImpl().getUserRoles(username);
                        System.out.println("Your roles are");
                        for(int i=0;i<roleList.size();i++){
                            System.out.println(roleList.get(i));
                        }
                        break;
                    case 5:
                        List<User> listUser=new UserDaoImpl().getAllUsers();
                        for(int i=0;i<listUser.size();i++){
                            System.out.println(listUser.get(i).toString());
                        }
                        break;
                    default:
                        this.exit=true;
                }
            }
            catch(Exception e){

            }
        }
    }
}
