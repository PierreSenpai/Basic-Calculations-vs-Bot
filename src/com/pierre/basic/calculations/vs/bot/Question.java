package com.pierre.basic.calculations.vs.bot;

public class Question {
    // format: a [op] b = res
    public String a;
    public String b;
    public char op;
    public int res;

    private static char[] operators = {'+', '-', '*'};

    public Question() {
        // op: 0 = add, 1 = sub, 2 = mul
        int opNum = (int) Math.round(Math.random() * 2);
        op = operators [opNum];

        // numbers
        int num1 = (int) Math.round(Math.random() * 40) - 20;
        int num2 = (int) Math.round(Math.random() * 40) - 20;

        // calculate result
        switch (op) {
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num1 - num2;
                break;
            case '*':
                res = num1 * num2;
                break;
            default:
                res = 0;
        }

        // surround negative numbers with parentheses
        if (num1 < 0) {
            a = "(" + num1 + ")";
        } else { a = String.valueOf(num1); }

        if (num2 < 0) {
            b = "(" + num2 + ")";
        } else { b = String.valueOf(num2); }
    }
}
