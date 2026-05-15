package com.system_design.lld.Allen;

import com.system_design.lld.Allen.Entities.Question;
import com.system_design.lld.Allen.Entities.Test;
import com.system_design.lld.Allen.Entities.User;
import com.system_design.lld.Allen.Enum.QuestionType;
import com.system_design.lld.Allen.Enum.Role;
import com.system_design.lld.Allen.Services.UserService;

public class AllenMain {
    public static void main(String []args) {
        // String userId, String userName, String userEmail, Role role
        User instructor=  new User("ins-1", "sahil.kanungo", "kanungosahil123@gmail.com", Role.INSTRUCTOR);


        User student1 = new User("allen-1", "Tej.Sharma", "tej.sharma@allen.com", Role.STUDENT);
        User student2 = new User("allen-2", "Tej.Sharma", "tej.sharma@allen.com", Role.STUDENT);


        // String title, String description
        Test test = new Test("TST1","Final Exam");
        // String questionId, QuestionType questionType, String question
        test.addQuestions(new Question("qid1", QuestionType.MULTIPLE_CHOICE, "\"What is the capital of France?\" \"A) London\" \"B) Paris\" \"C) Berlin\" \"D)"));
        test.addQuestions(new Question("qid2", QuestionType.DESCRIPTIVE, "Describe the limitation of MAC"));

        UserService userService = new UserService();
        userService.createdTestUser(instructor, test);

        userService.printTestsByUser(instructor.getUserId());
        userService.assignedStudentsToTest(student1, test);
        userService.assignedStudentsToTest(student2, test);

        userService.printTestsByStudent(student2.getUserId());
        userService.printTestsByStudent(student1.getUserId());






        //Test can only be created by Instructor


    }
}
