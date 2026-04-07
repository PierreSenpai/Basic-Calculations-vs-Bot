package com.pierre.basic.calculations.vs.bot;

public class Main {

    private int[] generateQuestion() {
        // op: 0 = add, 1 = sub, 2 = mul
        int op = (int) Math.round(Math.random() * 2);
        return generateQuestion(op);
    }

    private int[] generateQuestion(int op) {
        // a [op] b = res
        int a = (int) Math.round(Math.random() * 20);
        int b = (int) Math.round(Math.random() * 20);
        int res;

        switch (op) {
            // add
            case 0: res = a + b;
                    break;
            // sub
            case 1: res = a - b;
                    break;
            // mul
            case 2: res = a * b;
                    break;
            default: res = 0;
        }

        return new int[]{a, b, op, res};
    }
    public static void main(String[] args) {
        int nQuestions = 20;

        Main game = new Main();
        User user = new User();
        Bot bot = new Bot(nQuestions);

        for (int n : game.generateQuestion()) {System.out.println(n);}

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
