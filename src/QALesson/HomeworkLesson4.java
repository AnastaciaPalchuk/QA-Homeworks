package QALesson;

import java.util.Scanner;

public class HomeworkLesson4 {
    public static void main(String[] args) {
        System.out.println("Homework 3 Task 1:");
        Scanner input = new Scanner(System.in);
        System.out.println("Введите ваш текст:");
        String string1 = input.next();
        String string2 = input.next();
        String string3 = input.next();
        String string4 = input.next() + " " + input.next() + " " + input.next();
        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);
        System.out.println(string4);

        System.out.println("Homework 3 Task 2:");
        Scanner input2 = new Scanner(System.in);
        System.out.println("Введите ваши числа:");
        int number1 = input2.nextInt();
        int number2 = input2.nextInt();
        int number3 = input2.nextInt();
        if (number1 > 0 || number2 > 0 || number3 > 0 || (number1 + number2) > number3) {
            System.out.println("Из етих сторон можно построить треугольник");
        }
        else {
            System.out.println("Из етих сторон нельзя построить треугольник");
        }


    }
}
