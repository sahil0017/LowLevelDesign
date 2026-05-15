package com.system_design.lld.Allen.Services;

import com.system_design.lld.Allen.Entities.Test;
import com.system_design.lld.Allen.Entities.User;
import com.system_design.lld.Allen.Enum.Role;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class UserService {
    private final Map<String, Test> userTestMap = new ConcurrentHashMap<>();
    private final Map<String, Test> studentTestMap = new ConcurrentHashMap<>();

    public UserService() {

    }

    public void createdTestUser(User user, Test test) {
        if (isInstructorRole(user.getUserRole())) {
            // createTest
            userTestMap.put(user.getUserId(), test);
        } else {
            System.out.println("Test assigned to instructor role");
        }
    }


    public void assignedStudentsToTest(User user, Test test) {
        if (isStudentRole(user.getUserRole())) {
            studentTestMap.put(user.getUserId(), test);
        } else {
            System.out.println("Test assigned to instructor role");
        }
    }


    public void printTestsByUser(String userId) {
        for(Map.Entry<String, Test> userTests : userTestMap.entrySet()) {
            if(userTests.getKey().equalsIgnoreCase(userId)) {
                System.out.println("User" + userId + " Test " + userTests.getValue().getTitle());
            }
        }
    }

    public void printTestsByStudent(String studentId) {
        for(Map.Entry<String, Test> userTests : studentTestMap.entrySet()) {
            if(userTests.getKey().equalsIgnoreCase(studentId)) {
                System.out.println("User" + studentId + " Test " + userTests.getValue().getTitle());
            }
        }
    }


    private boolean isInstructorRole (Role role) {
        return role.equals(Role.INSTRUCTOR);
    }

    private boolean isStudentRole (Role role) {
        return role.equals(Role.STUDENT);
    }
}
