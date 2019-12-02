package org.launchcode.java.studios.questions;

import java.util.ArrayList;

public class TrueFalse extends Question {
    static Boolean falseValue = false;
    static Boolean trueValue = true;
    static ArrayList<Boolean> listOfTrueFalse = new ArrayList<>();

    public TrueFalse(String questionContent, ArrayList correctAnswer, ArrayList listOfTrueFalse) {
        super(questionContent, correctAnswer, listOfTrueFalse);
        this.listOfTrueFalse.add(trueValue);
        this.listOfTrueFalse.add(falseValue);
        this.setListOfOptions(listOfTrueFalse);
    }

    public void printPossibleAnswers() {
        System.out.println("Choice 1: " + trueValue + "\n" + "Choice 2: " + falseValue);
    }

}
