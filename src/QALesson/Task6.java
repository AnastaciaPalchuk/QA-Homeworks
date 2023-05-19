package QALesson;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Введіть ваше перше число:");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();

        System.out.println("Введіть ваш символ:");
        char char1 = scanner.next().charAt(0);
        System.out.println(char1);

        System.out.println("Введіть ваше друге число:");
        int number2 = scanner.nextInt();

        char char2 = '-';
        char char3 = '+';
        char char4 = '%';
        char char5 = '*';


        System.out.println(char1 == char2 ? number1 - number2 : char1 == char3 ? number1 + number2 : char1 == char4 ? number1 % number2 : char1 == char5 ? number1 * number2 : 0);



    }
}
