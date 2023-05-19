package QALesson;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введіть значення Х:");
        Scanner number1 = new Scanner(System.in);
        int X = number1.nextInt();

        System.out.println("Введіть значення Y:");
        Scanner number2 = new Scanner(System.in);
        int Y = number2.nextInt();

        boolean check = X > Y;
        String checkXY = String.valueOf(check);
        if (X > Y) {
            System.out.println("Число Х більше за число Y і це " + checkXY);
        } else {
            System.out.println("Число Y більше за Х і це " + checkXY);

        }

    }
        }


