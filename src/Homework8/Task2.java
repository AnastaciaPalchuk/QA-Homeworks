package Homework8;

import java.lang.reflect.Array;

public class Task2 {
    public static void text() {
        System.out.println("I'm empty");
    }

    public static void text(String text) {
        System.out.println("Your text: " + text);
    }

    public static void text(String[] array) {
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");

        }
    }
    public static void text (Integer[] numberArray) {
        int result = 0;
        for (int i = 0; i < numberArray.length; i++){
            result += numberArray[i];
        }
        System.out.println(result);
    }

    public static void text(String text, Integer number) {
        System.out.println("Your text: " + text + ", " + "your number: " + number);
    }

    public static void main(String[] args) {
        text();
        System.out.println("=======================");
        text("Testing my code");
        String[] array = {"Text1", "Text2", "Text3"};
        text(array);
        System.out.println("\n");
        System.out.println("=======================");
        Integer[] numberArray = {1, 4, 16, 34, 9};
        text(numberArray);
        System.out.println("=======================");
        text("This is my text", 5);

    }
}
