package com.pierre.basic.calculations.vs.bot;

public class Main {
    public Question[] questions;

    public Main(int nQuestions) {
        questions = new Question[nQuestions];
        for (int i = 0; i < nQuestions; i++) {
            questions[i] = new Question();
        }
    }

    public static void main(String[] args) {
        int nQuestions = 20;

        Main game = new Main(nQuestions);
        User user = new User();
        Bot bot = new Bot(nQuestions);

        // test output
        for (Question q : game.questions) {
            System.out.println(String.format("%s %c %s = %s", q.a, q.op, q.b, q.res));
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
