package com.system_design.lld.Allen.Entities;

import com.system_design.lld.Allen.Enum.QuestionType;

/**
 * multiple-choice, true/false, and short answer types
 */
public class Question {
    private final String questionId;
    private final QuestionType questionType;
    private final String question;


    public Question(String questionId, QuestionType questionType, String question) {
        this.questionId = questionId;
        this.questionType = questionType;
        this.question = question;
    }

    public String getQuestionId() {
        return questionId;
    }



}
