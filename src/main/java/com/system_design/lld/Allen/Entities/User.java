package com.system_design.lld.Allen.Entities;

import com.system_design.lld.Allen.Enum.Role;

public class User {
    private final String userName;
    private final String userEmail;
    private final Role role;
    private final String userId;

    public User(String userId, String userName, String userEmail, Role role) {
        this.userId = userId;
        this.userEmail = userEmail;
        this.role = role;
        this.userName = userName;
    }


    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserId() {
        return userId;
    }

    public Role getUserRole() {
        return role;
    }
}


            