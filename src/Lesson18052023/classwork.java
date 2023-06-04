package Lesson18052023;

import java.util.Scanner;

public class classwork {
    public static void main(String[] args) {
        System.out.println("Введіть ваше число:");
        Scanner number = new Scanner(System.in);
        String stopWord = "STOP";
        int result = 0;
        while (true) {
            String yourNumberStr = number.next();
            if (yourNumberStr.equals(stopWord)) {
                System.out.println("Ваше число: " + result);
                break;
            }
            int yourNumber = Integer.parseInt(yourNumberStr);
            result = result + yourNumber;
        }
    }
}
