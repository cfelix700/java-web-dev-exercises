package org.example;

public class TrueFalse extends Question {
    private String question;
    private String answer;
    public TrueFalse(String question, String answer){
        super(questionm new String[] {"true", "false"});
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "True or False:\n" +
                "question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}

