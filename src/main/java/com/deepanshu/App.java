package com.deepanshu;



import com.deepanshu.Dao.RoleDao;
import com.deepanshu.Dao.UserDao;
import com.deepanshu.Dao.UserRoleDao;
import com.deepanshu.DaoImpl.*;
import com.deepanshu.Model.User;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import static com.deepanshu.App.isValidState;

/**
 * Hello world!
 *
 */
public class App {

    static boolean state=false;
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    public App(){
    }

    public static void init(){
        UserDaoImpl.init();
        RoleDaoImpl.init();
        UserRoleDaoImpl.init();
        ResourceDaoImpl.init();
        ActionTypeDaoImpl.init();
        RoleResourceAccessDaoImpl.init();
    }

    static boolean isValidState(){
        return !state;
    }

    public static void main( String[] args ) throws IOException {
            App app=new App();
            init();

            String username;
            String password;
            Scanner sc=new Scanner(System.in);
            while(isValidState()) {
                System.out.println("Enter username : ");
                username=sc.nextLine();
                System.out.println("Enter password : ");
                password=sc.nextLine();
                Authentication auth = new SimpleAuthentication();
                User user=auth.login(username,password);
                if(user!=null){
                    Home home=new Home(user);
                    home.control();
                }
                else{
                    System.out.println("Wrong Credentials...Please try again\nPress 1 to continue\n Press 2 to exit");
                    int option= Integer.parseInt(input.readLine());
                    if(option==2)
                        App.state=true;
                }
            }
        }
    }
