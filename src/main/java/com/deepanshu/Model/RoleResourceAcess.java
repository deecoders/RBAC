package com.deepanshu.Model;

import java.util.List;
import java.util.UUID;

public class RoleResourceAcess {

    private UUID id;
    private String roleName;
    private String resourceName;
    private List<String> actionTypes;

    public String printAllActionTypes(){
        String s="";
        s+='{';
        for(int i=0;i<actionTypes.size();i++){
            s+=(actionTypes.get(i)+", ");
        }
        s+='}';
        return s;
    }
    @Override
    public String toString() {
        return "RoleResourceAcess{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                ", resourceName='" + resourceName + '\'' +
                ", actionTypes=" + printAllActionTypes()+
                '}';
    }

    public RoleResourceAcess(String roleName, String resourceName, List<String> actionTypes) {
        this.roleName = roleName;
        this.resourceName = resourceName;
        this.actionTypes = actionTypes;
        setId(UUID.randomUUID());
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public List<String> getActionTypes() {
        return actionTypes;
    }

    public void setActionTypes(List<String> actionTypeNames) {
        this.actionTypes = actionTypeNames;
    }
}
