package com.example.calculator;


public class Calculator {
    private int lastResult;

    public int calculate(int num1, int num2, char sign) {
        switch (sign) {
            case '+':
                lastResult = num1+num2;
                break;
            case '-':
                lastResult = num1 - num2;
                break;
            case '*':
                lastResult = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    throw new ArithmeticException("0으로 나눌 수 없습니다!");
                }
                lastResult = num1 / num2;
                break;
            default:
                throw new IllegalArgumentException("+,-,*,/ 중에 입력하세요!");
        }

        return lastResult;
    }
    public int getLastResults() {
        return lastResult;
    }

    public void clearResult() {
        lastResult = 0;
    }
}