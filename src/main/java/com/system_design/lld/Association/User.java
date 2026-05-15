package com.system_design.lld.Association;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userName;
    private List<Group> groups = new ArrayList<>();

    User(String userName) {
        this.userName = userName;
    }

    public void joinGroup(Group group) {
        if(!groups.contains(group)) {
            groups.add(group);
            group.addUser(this);
        }
    }

    public String getUserName() {
        return userName;
    }

    public List<Group> getGroups() {
        return groups;
    }
}
