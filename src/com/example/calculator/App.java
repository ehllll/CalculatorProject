package com.example.calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {

            System.out.print("1번째 숫자를 입력하세요: ");
            int num1 = scanner.nextInt();

            System.out.print("2번째 숫자를 입력하세요: ");
            int num2 = scanner.nextInt();

            System.out.println("num1 = " + num1);
            System.out.println("num2 = " + num2);

            System.out.print("사칙연산 기호를 입력하세요: ");
            char sign = scanner.next().charAt(0);

            int result = calculator.calculate(num1, num2, sign);
            boolean valid = true;

            switch (sign) {
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
                        valid = false;

                    } else {
                        result = num1 / num2;
                    }
                    break;

                default:
                    System.out.println("+.-,*,/ 중에 입력해주세요");
                    valid = false;
            }

            if (valid) {
                System.out.println("결과: " + result);

            }

            System.out.println("더 계산하시겠습니까? (yes: 계속, exit: 종료, clear: 최근 결과 삭제): ");
            String check = scanner.next();
            if (check.equals("exit")) {
                System.out.println("계산기를 종료합니다!");
                break;
            } else if (check.equals("yes")) {
                System.out.println("계산을 계속합니다!");
            } else if (check.equals("clear")) {
                calculator.clearResult();
                System.out.println("최근 결과가 초기화되었습니다 / 현재 결과: " + calculator.getLastResults());
            }
        }
    }

    }


