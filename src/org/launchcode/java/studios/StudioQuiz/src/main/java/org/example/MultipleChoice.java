package org.example;

public class MultipleChoice extends Question {
    private final  String correct;
    public MultipleChoice(String question, String [] choices, String correct){
        super(question, choices);
        this.correct = correct;
    }
}
