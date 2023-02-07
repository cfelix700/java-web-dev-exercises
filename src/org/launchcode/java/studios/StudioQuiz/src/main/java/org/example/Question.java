package org.example;

public abstract class Question {
    private String question;

    public Question(String question){
        this.question = question;

    }


    public String toString() {
        return "Question{" +
                "question='" + question + '\'' +
                '}';
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
