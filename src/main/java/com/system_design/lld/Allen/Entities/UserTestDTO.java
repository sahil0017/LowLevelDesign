package com.system_design.lld.Allen.Entities;

import com.system_design.lld.Allen.Enum.TestStage;

public class UserTestDTO {
    private Test test;
    private TestStage testStage;

    public UserTestDTO(Test test, TestStage testStage) {
        this.test = test;
        this.testStage =  testStage;
    }
}
