package Homework9.task4;

import java.util.Scanner;

public class Calculator {
    /*Создать класс калькулятор.
    В нем создать методы:
    summ, minus, multiply, division.
            Сложение, вычитание, умножение и деление соответственно.
    Каждый метод принимает в качестве параметров два значения типа double.
    И выводит в консоль результат действия.

    Также в классе есть метод старт. Который выводит сообщение в консоль, что
    калькулятор запущен. И предлагает ввести действие в вашей консоли.

    Калькулятор должен принимать только следующие типы действий:
            2+4;    - пример синтаксиса сложения;
    5-6;    - пример синтаксиса вычитания;
    25*3;   - пример синтаксиса умножения;
    34/3;   - пример синтаксиса деления;
    После ввода действия на консоль выводится ответ этого действия.
    И после снова выводится сообщение о предложении ввести действие.

    в случае ввода другого синтаксиса консоль возвращается сообщение:
            "Введите корректное действие".
    И после снова выводится сообщение о предложении ввести действие.

    Программа закрывается после ввода команды Stop.
    Перед закрытием на консоль должно выводится сообщение:
            "Калькулятор закрыт".*/
    public static void sum(double a, double b) {
        double result = a + b;
        System.out.println(result);
    }

    public static void minus(double a, double b) {
        double result = a - b;
        System.out.println(result);
    }

    public static void multiple(double a, double b) {
        double result = a * b;
        System.out.println(result);
    }

    public static void division(double a, double b) {
        double result = a / b;
        System.out.println(result);
    }

    public static void start() {
        System.out.println("Калькулятор запущено! Введіть дію:");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            start();
            String a = scanner.next();
            if (a.equals("Stop")) {
                System.out.println("Калькулятор закрито.");
                break;
            }
            String charter = scanner.next();
            double b = scanner.nextInt();
            System.out.println(a);

            if (charter.equals("+")) {
                sum(Double.parseDouble(a), b);
            } else if (charter.equals("-")) {
                minus(Double.parseDouble(a), b);
            } else if (charter.equals("*")) {
                multiple(Double.parseDouble(a), b);
            } else if (charter.equals("/")) {
                division(Double.parseDouble(a), b);
            } else {
                System.out.println("Введіть корректну дію.");
            }
        }
    }
}
