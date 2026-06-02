package com.pierrewalther;
import java.util.Scanner;

public class Main {
    public static Question[] questions;

    private static void generateQuestions(int nQuestions) {
        questions = new Question[nQuestions];
        for (int i = 0; i < nQuestions; i++) {
            questions[i] = new Question();
        }
    }

    public static void main(String[] args) {
        int nQuestions = 20;
        generateQuestions(nQuestions);

        Scanner scanner = new Scanner(System.in);
        User user = new User();
        Bot bot = new Bot(nQuestions);

        // test output
        for (Question q : questions) {
            System.out.println(q.askQuestion(scanner));
        }

        // countdown
        for (int i = 3; i > 0; i--) {
            System.out.print("\r" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {}
        }
        System.out.println("\rGame starts!");

        // start threads
        user.start();
        bot.start();
    }
}
