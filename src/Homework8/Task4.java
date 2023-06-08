package Homework8;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        int a;
        int b;
        System.out.println("Input number 1: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        System.out.println("Input number 2: ");
        b = scanner.nextInt();
        Integer[][] integers = new Integer[a][b];
        int[] arraybiggest = new int[a];

        for (int i = 0; i < integers.length; i++) {
            for (int x = 0; x < integers[i].length; x++) {
                integers[i][x] = (int) (Math.random() * 1001);

            }
        }
        /*for (int i = 0; i < integers.length; i++) {
            for (int x = 0; x < integers.length; x++) {
                System.out.print(integers[i][x] + " ");
            }
            System.out.println("\n");
        }*/
        for (int i = 0; i < integers.length; i++) {
            int biggest = 0;
            for (int x = 0; x < integers[i].length; x++) {
                if (integers[i][x] > biggest) {
                    biggest = integers[i][x];

                }
            }
            arraybiggest[i] = biggest;
        }
        for (int i = 0; i < arraybiggest.length; i++) {
            System.out.print(arraybiggest[i] + " ");
        }
    }
}
