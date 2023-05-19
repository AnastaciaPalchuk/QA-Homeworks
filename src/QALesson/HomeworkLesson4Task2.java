package QALesson;

import java.util.Scanner;

public class HomeworkLesson4Task2 {
    public static void main(String[] args) {
        System.out.println("Homework 4 Task 2:");
        Scanner input2 = new Scanner(System.in);
        System.out.println("Введіть три довжини сторін трикутника:");
        int number1 = input2.nextInt();
        int number2 = input2.nextInt();
        int number3 = input2.nextInt();
        if (number1 == 0 ) {
            System.out.println("З данними сторонами неможливо побудувати трикутник");
        } else if (number2 == 0) {
            System.out.println("З данними сторонами неможливо побудувати трикутник");
        } else if (number3 == 0) {
            System.out.println("З данними сторонами неможливо побудувати трикутник");
        } else if ((number1 + number2) <= number3) {
            System.out.println("З данними сторонами неможливо побудувати трикутник");
        } else if ((number2 + number3) <= number1) {
            System.out.println("З данними сторонами неможливо побудувати трикутник");
        } else if ((number1 + number3) <= number2) {
            System.out.println("З данними сторонами неможливо побудувати трикутник");
        }else {
            System.out.println("З данними сторонами можливо побудувати трикутник");
        }

    }
}
