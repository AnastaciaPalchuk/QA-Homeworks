package Homework5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 11);
//            System.out.print(numbers[i] + " ");
        }
        System.out.println("Введіть ваше число від 1-10:");
        boolean actual = false;
        Scanner yourNumber = new Scanner(System.in);
        int yourDigit = yourNumber.nextInt();
        for (int i = 0; i < numbers.length; i++){
           if (yourDigit == numbers[i]) {
               actual = true;
               break;
           }else {
               actual = false;
           }
        }
            if (actual == true){
                System.out.println("Це число існує в данному масиві.");
            }else {
                System.out.println("Це число не існує в данному масиві.");

            }
    }
}
