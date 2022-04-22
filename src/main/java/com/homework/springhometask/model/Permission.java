package com.homework.springhometask.model;

public enum Permission {
    USERS_READ("users:read"),
    USERS_WRITE("users:write"),
    USERS_DELETE("users:delete");

    private final String permission;

    Permission(String permission){
        this.permission = permission;
    }

    public String getPermission(){
        return permission;
    }
}
