package com.pierre.basic.calculations.vs.bot;

public class Question {
    // format: a [op] b = res
    public int a;
    public int b;
    public char op;
    public int res;

    private static char[] operators = {'+', '-', '*'};

    public Question() {
        // op: 0 = add, 1 = sub, 2 = mul
        int opNum = (int) Math.round(Math.random() * 2);
        op = operators [opNum];

        // numbers
        a = (int) Math.round(Math.random() * 20);
        b = (int) Math.round(Math.random() * 20);

        // calculate result
        switch (op) {
            case '+':
                res = a + b;
                break;
            case '-':
                res = a - b;
                break;
            case '*':
                res = a * b;
                break;
            default:
                res = 0;
        }
    }
}
