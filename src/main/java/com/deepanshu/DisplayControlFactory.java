package com.deepanshu;

import com.deepanshu.DisplayControl;
import com.deepanshu.DisplayControlAdmin;
import com.deepanshu.DisplayControlUser;
import com.deepanshu.Model.User;

public class DisplayControlFactory {
    public static DisplayControl generateControl(boolean isAdmin, User user){
        if(isAdmin)
            return new DisplayControlAdmin(user);
        else
            return new DisplayControlUser(user);
    }
}
