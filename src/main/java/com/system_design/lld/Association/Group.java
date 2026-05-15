package com.system_design.lld.Association;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private final String groupName;
    private final List<User> userList = new ArrayList<>();

    Group(String groupName) {
        this.groupName = groupName;
    }

    public void addUser(User user) {
        if (!userList.contains(user)) {
            userList.add(user);
            user.joinGroup(this);
        }
    }

    public String getGroupName() {
        return groupName;
    }

    public List<User> getUsers() {
        return userList;
    }
}
