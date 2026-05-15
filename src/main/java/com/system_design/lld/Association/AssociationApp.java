package com.system_design.lld.Association;

import java.util.List;

public class AssociationApp {
    public static void main(String []args) {
        Group backend = new Group("Backend");
        Group frontend = new Group("FrontEnd");

        User sahil = new User("Sahil Kanungo");
        User vishwesh = new User("Vishwesh Bajpai");

        backend.addUser(sahil);
        frontend.addUser(vishwesh);


        sahil.joinGroup(backend);
        sahil.joinGroup(frontend);

        vishwesh.joinGroup(backend);

        print(backend.getUsers());
        print(frontend.getUsers());
        print(sahil.getGroups());
        print(vishwesh.getGroups());
    }


    private static void print(List<?> iterableList) {
        for (Object obj :  iterableList) {
            if (obj instanceof User e) {
                System.out.println("\n" + e.getUserName());
            } else if (obj instanceof Group g) {
                System.out.println("\n" + g.getGroupName());
            }
        }
    }
}
