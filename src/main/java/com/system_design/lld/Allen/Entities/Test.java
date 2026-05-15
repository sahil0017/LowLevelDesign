package com.system_design.lld.Allen.Entities;

import com.system_design.lld.Allen.Enum.Role;

import java.util.ArrayList;
import java.util.List;

public class Test {
    private final String title;
    private final String description;
    private List<Question> questionList;

    public Test(String title, String description) {
        this.title = title;
        this.description = description;
        this.questionList = new ArrayList<>();
    }

    // add
    public void addQuestions(Question question) {
        this.questionList.add(question);
    }

    // remove
    public void removeQuestion(Question question) {
        this.questionList.remove(question);
    }

    // update
    public void updateQuestion(String questionId, Question updatedQuestion) {
        for (Question question : this.questionList) {
            if (question.getQuestionId().equalsIgnoreCase(questionId)) {
                this.questionList.remove(question);
                this.questionList.add(updatedQuestion);
            } else {
                System.out.println("No Question with question ID present in the system");
            }
        }
    }


    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }


}
