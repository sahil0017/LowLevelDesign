package com.system_design.lld.Allen.Services;

import com.system_design.lld.Allen.Entities.Test;
import com.system_design.lld.Allen.Entities.User;
import com.system_design.lld.Allen.Entities.UserTestDTO;
import com.system_design.lld.Allen.Enum.TestStage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TestServices {
    Map<String, UserTestDTO> testStatus = new ConcurrentHashMap<>();

    TestServices() {
    }

//    public void startTest(TestStage testStage, Test test, User user) {
//        testStage.
//    }
}

