package Homework5;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        String[] names = {"Петя", "Маша", "Альона", "Федя", "Саша", "Антон", "Глеб"};
        String[] places = {"школу", "магазин", "церкву", "тренажерний зал", "кіно", "поліклініку"};
        int[] time = {10, 12, 14, 16, 18, 20};
        System.out.println("Введіть три числа:");
        Scanner numbers = new Scanner(System.in);
        int number1 = numbers.nextInt();
        int number2 = numbers.nextInt();
        int number3 = numbers.nextInt();
        System.out.println(names[number1] + " йде в " + places[number2] + " о " + time[number3] + " годині.");
    }
}
