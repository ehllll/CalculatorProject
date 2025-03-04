package com.example.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("1번째 숫자를 입력하세요: ");
            int num1 = scanner.nextInt();

            System.out.print("2번째 숫자를 입력하세요: ");
            int num2 = scanner.nextInt();

            System.out.println("num1 = " + num1);
            System.out.println("num2 = " + num2);

            System.out.print("사칙연산 기호를 입력하세요: ");
            char sign1 = scanner.next().charAt(0);

            int result = 0;
            boolean validOperation = true;

            switch (sign1) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("0으로 나눌 수 없습니다");
                        validOperation = false;

                    } else {
                        result = num1 / num2;
                    }
                    break;

                default:
                    System.out.println("+.-,*,/ 중에 입력해주세요");
                    validOperation = false;
            }

            if (validOperation) {
                System.out.println("결과: " + result);

            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료): ");
            String check = scanner.next();
            if(check.equals("exit")) {
                System.out.println("계산기를 종료합니다");
                break;
            }
        }
        scanner.close();

    }
}