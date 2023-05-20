package Homework5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введіть число");
        Scanner number = new Scanner(System.in);
        int yourNumber = number.nextInt();
        String numberStr = Integer.toString(yourNumber);
        String[] numberStr1 = numberStr.split("");
        for(int i = 0; i < numberStr1.length / 2; i++)
        {
            String temp = numberStr1[i];
            numberStr1[i] = numberStr1[numberStr1.length - i - 1];
            numberStr1[numberStr1.length - i - 1] = temp;
        }
        String newstring = String.join("", numberStr1);
        if (newstring.equals(numberStr)){
            System.out.println("Ваше число є поліндромом");
        }else {
            System.out.println("Ваше число не є поліндромом");
        }
    }
}
