package com.deepanshu.Model;

public class ActionType {

    private String actionTypeName;
    private boolean view;
    private boolean edit;

    public String getActionTypeName() {
        return actionTypeName;
    }

    public void setActionTypeName(String actionTypeName) {
        this.actionTypeName = actionTypeName;
    }

    public boolean isView() {
        return view;
    }

    public void setView(boolean view) {
        this.view = view;
    }

    public boolean isEdit() {
        return edit;
    }

    public void setEdit(boolean edit) {
        this.edit = edit;
    }

    public ActionType(String actionTypeName, boolean view, boolean edit) {
        this.actionTypeName=actionTypeName;
        this.view = view;
        this.edit = edit;
    }
}
