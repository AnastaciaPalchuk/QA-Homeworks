package Homework6;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 101);
        System.out.println("Введіть ваше ім'я: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Let the game begin!");
        System.out.println("Введіть ваше число: ");
        while (true) {
           int number = scanner.nextInt();
           if (number > randomNumber) {
               System.out.println("Your number is too big. Please, try again..");
               continue;
           }
           if (number < randomNumber) {
               System.out.println("Your number is too small. Please, try again..");
               continue;
           }
           if (number == randomNumber) {
               System.out.println("Congratulations, " + name);
               break;
           }
        }

    }
}
