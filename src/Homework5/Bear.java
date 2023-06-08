package Homework5;

import java.util.Scanner;

public class Bear extends Animal {
    static Scanner scanner = new Scanner(System.in);
    public int age;

    public static void main(String[] args) {
        Bear.scanner.next();
    }

    public int getFullInfo() {
        String name = this.getName();
        String fullInfo = name + " " + this.age;
        return this.age;
    }
}
