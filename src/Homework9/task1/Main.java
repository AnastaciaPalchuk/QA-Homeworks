package Homework9.task1;

import Homework9.task1.Computer;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setBrand("Macbook");
        computer.setPrice(1300);
        computer.setRAM(8);
        computer.setVideoCard(1050);

        System.out.println(computer);
    }
}
