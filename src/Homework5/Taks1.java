package Homework5;

import java.util.Scanner;

public class Taks1 {
    public static void main(String[] args) {
        Bear bear = new Bear();
        bear.name = "Whiskey";
        bear.age = 16;
        System.out.println(bear.getFullInfo());
//        System.out.println("Введіть ваш текст:");
//        Scanner input = new Scanner(System.in);
//        String stopWord = "STOP";
//        String result = " ";
//        while(true) {
//            String newOneWord = input.next();
//            if(newOneWord.equals(stopWord)) {
//                break;
//            }
//            result = result + " " + newOneWord;
//        }
//        System.out.println("Ваш текст:" + result);
    }
}
