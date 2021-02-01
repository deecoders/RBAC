package com.deepanshu.Model;

import java.util.UUID;

public class UserRole {

    private String userName;
    private String roleName;

    @Override
    public String toString() {
        return "UserRole{" +
                "userName='" + userName + '\'' +
                ", roleName='" + roleName + '\'' +
                '}';
    }

    public UserRole(String userName, String roleName) {
        setRoleName(roleName);
        setUserName(userName);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
