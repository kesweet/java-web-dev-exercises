package org.launchcode.java.studios.questions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Quiz {

//Add questions
//Run or carry out the quiz
//Grade the quiz

    private String quizName;
    private String quizTaker;
    private ArrayList<String> questions;
    private ArrayList<Question> questionObjects;

    public Quiz(String quizName) {
        this.quizName = quizName;
    }

    public String getQuizName() {
        return quizName;
    }

    public void setQuizName(String quizName) {
        this.quizName = quizName;
    }

    public String getQuizTaker() {
        return quizTaker;
    }

    public void setQuizTaker(String quizTaker) {
        this.quizTaker = quizTaker;
    }

    public ArrayList<String> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<String> questions) {
        this.questions = questions;
    }


    public void runTheQuiz() {
        for (int i = 0; i < this.questionObjects.size(); i++) {
            System.out.println("Question " + (i+1) + ": " + this.questionObjects.get(i).getQuestionContent() + "\n");
            System.out.println("Answers: \n");
            this.questionObjects.get(i).printListOfOptions();
            System.out.println();
        }
    }

    public void gradeTheQuiz() {
        int grade = 0;
        int totalQuestions = this.questionObjects.size();
        for (int i = 0; i < this.questionObjects.size(); i++) {
            if (this.questionObjects.get(i).getInputAnswer().equals(this.questionObjects.get(i).getCorrectAnswer().get(i))) {
                grade++;
            }
        }
        int percentage = grade/totalQuestions * 100;
        System.out.println("Your final grade: " + percentage);
    }
}
