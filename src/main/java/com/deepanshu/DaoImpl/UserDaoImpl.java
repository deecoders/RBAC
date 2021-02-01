package com.deepanshu.DaoImpl;

import com.deepanshu.Dao.UserDao;
import com.deepanshu.Model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {

    static List<User> users;
    public UserDaoImpl() {
    }

    public static void init(){
        users = new ArrayList<User>();
        User user1=new User("admin","Deepanshu","123");
        User user2=new User("anksh","Ankush","123");
        User user3=new User("shkaya","Shivi","123");
        users.add(user1);
        users.add(user2);
        users.add(user3);
    }

    @Override
    public User getUser(String username) {
        for(int i=0;i<users.size();i++){
            User user=users.get(i);
            if(user.getUsername().equals(username)){
                return user;
            }
        }
        return null;
    }

    @Override
    public void deleteUser(String userName) {
        new UserRoleDaoImpl().deleteAllRolesForUser(userName);
        for(int i=0;i<users.size();i++){
            if(userName.equals(users.get(i).getUsername())){
                users.remove(i);
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public List<User> getAllUsers() {
        return users;
    }

    public static void printAllUsers(){

        for(int i=0;i< users.size();i++){
            System.out.println(users.get(i).toString());
        }
    }
}
