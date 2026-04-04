package com.pierre.basic.calculations.vs.bot;

public class Main {
    public static void main(String[] args) {
        int nQuestions = 20;

        User user = new User();
        Bot bot = new Bot();

        for (int i = 3; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {}
        }
        System.out.println("Game starts!");
    }
}
