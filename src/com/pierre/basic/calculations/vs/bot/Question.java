package com.pierre.basic.calculations.vs.bot;

public class Question {
    // format: a [op] b = res
    public String a;
    public String b;
    public char op;
    public int res;

    private static char[] operators = {'+', '-', '*', '/'};

    public Question() {
        // op: 0 = add, 1 = sub, 2 = mul, 3 = div
        int opNum = (int) Math.round(Math.random() * 3);
        op = operators [opNum];
        int num1, num2;

        // loop to ensure that division has nice result
        while (true) {
            // numbers
            num1 = (int) Math.round(Math.random() * 40) - 20;
            num2 = (int) Math.round(Math.random() * 40) - 20;

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
                case '/':
                    // division by zero
                    if (num2 == 0) {continue;}
                    res = num1 / num2;
                    // if division results in truncated float
                    if (res * num2 != num1) {continue;}
                    break;
                default:
                    res = 0;
            }
            break;
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
