package QALesson;

import java.util.Date;
import java.util.Scanner;

public class HomeworkLesson4Task3 {
    public static void main(String[] args) {
        System.out.println("Homework Lesson 4 Task 3");
        System.out.println("Введіть рік вашого народження:");
        Scanner input = new Scanner(System.in);
        int yearOfBirth = input.nextInt();
        Date date = new Date();
        String actualYear = String.format("%tY", date);
        int actualYearInt = Integer.parseInt(actualYear);
        System.out.println("Ваш вік =  " + (actualYearInt - yearOfBirth));
    }
}

