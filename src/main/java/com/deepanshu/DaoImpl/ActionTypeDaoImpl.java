package com.deepanshu.DaoImpl;

import com.deepanshu.Dao.ActionTypeDao;
import com.deepanshu.Model.ActionType;
import com.deepanshu.Model.Resource;

import java.util.ArrayList;
import java.util.List;

public class ActionTypeDaoImpl implements ActionTypeDao {

    static List<ActionType> actionTypes;
    public ActionTypeDaoImpl() {
    }

    public static void init(){
        actionTypes = new ArrayList<ActionType>();
        ActionType VIEW=new ActionType("View",true,false);
        ActionType EDIT=new ActionType("Edit",true, true);
        actionTypes.add(VIEW);
        actionTypes.add(EDIT);
    }

    @Override
    public void addActionType(ActionType actionType) {
            actionTypes.add(actionType);
    }

    @Override
    public void deleteActionType(String actionType) {
        for(int i=0;i<actionTypes.size();i++){
            if(actionTypes.get(i).getActionTypeName().equals(actionType)) {
                actionTypes.remove(i);
                break;
            }
        }
    }
}
