package org.launchcode.java.studios.questions;

import java.util.ArrayList;

public class QuizRunner {
    public static void main(String[] args) {
        Question question = new CheckBox();
        Quiz quiz = new Quiz("My Quiz");
        quiz.addQuestion();
    }
}
