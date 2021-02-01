package com.deepanshu;

import com.deepanshu.Model.User;

public class Home {
    User user;
    boolean isAdmin;

    public Home(User user) {
        setUser(user);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void control(){
        System.out.println("Welcome! You are logged in as "+user.getUsername());
        if("admin".equals(user.getUsername()))
            this.isAdmin=true;
        else
            this.isAdmin=false;

        DisplayControl displayControl = DisplayControlFactory.generateControl(isAdmin,user);
        displayControl.display();
    }
}
