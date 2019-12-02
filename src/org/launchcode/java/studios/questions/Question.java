package org.launchcode.java.studios.questions;

import java.util.ArrayList;

public abstract class Question {
    private String inputAnswer;
    private String questionContent;
    private ArrayList<String> correctAnswer;
    private ArrayList<String> listOfOptions;

    public Question(String questionContent, ArrayList correctAnswer, ArrayList listOfOptions) {
        this.questionContent = questionContent;
        this.correctAnswer = correctAnswer;
        this.listOfOptions = listOfOptions;
    }

    public String getInputAnswer() {
        return inputAnswer;
    }

    public void setInputAnswer(String inputAnswer) {
        this.inputAnswer = inputAnswer;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }

    public ArrayList<String> getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(ArrayList correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public ArrayList<String> getListOfOptions() {
        return listOfOptions;
    }

    public void setListOfOptions(ArrayList<String> listOfOptions) {
        this.listOfOptions = listOfOptions;
    }

    public void printQuestion() {
        System.out.println("Question: " + this.questionContent);
    }

    public void printInputAnswer() {
        System.out.println("Your answer: " + this.inputAnswer);
    }

    public void printCorrectAnswers() {
        for (int i = 0; i < this.correctAnswer.size(); i++) {
            System.out.println("Correct Answer " + (i+1) + ": " + this.correctAnswer.get(i) + "\n");
        }
    }

    public Boolean isUserAnswerCorrect() {
        if (this.inputAnswer.toLowerCase().equals(this.correctAnswer)) {
            return true;
        } else {
            return false;
        }
    }

    public void printListOfOptions() {
        for (int i = 0; i < this.listOfOptions.size(); i++) {
            System.out.println("Option " + (i+1) + ": " + this.listOfOptions.get(i) + "\n");
        }
    }
}
