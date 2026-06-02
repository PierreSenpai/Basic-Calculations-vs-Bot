package com.pierrewalther;

public class Bot extends Thread {
    private int nQuestions;

    public Bot(int nQuestions) {
        this.nQuestions = nQuestions;
    }

    private void printLine(int current) {
        System.out.print(String.format("\rBot: %s/%s done", current, nQuestions));
    }

    @Override public void run() {
        for (int i = 0; i < nQuestions; i++) {
            printLine(i);
            // wait between 1-5 seconds
            try {
                Thread.sleep((int)(Math.random() * 4000) + 1000);
            } catch (InterruptedException ie) {}
        }
        printLine(nQuestions);
        System.out.println("\n");
    }

}
