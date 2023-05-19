package QALesson;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Введіть ваше число:");
        Scanner scanner = new Scanner(System.in);
        int one = scanner.nextInt();

        if (one == 1){
            System.out.println("Понеділок");
        }else if (one == 2){
            System.out.println("Вівторок");
        } else if (one== 3) {
            System.out.println("Середа");
        } else if (one == 4) {
            System.out.println("Четвер");
        } else if (one == 5) {
            System.out.println("П'ятниця");
        }else if (one == 6) {
            System.out.println("Суббота");
        }else if (one == 7) {
            System.out.println("Неділя");
        }else {
            System.out.println("Краще в сьогодні була П'ятниця");
        }
    }
}
