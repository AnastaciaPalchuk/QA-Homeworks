package Homework5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner weight = new Scanner(System.in);
        int basic = 0;
        System.out.println("Скільки кілограм металу максимально можливо залишити на складі?");
        int maximum = weight.nextInt();
        while (true) {

            System.out.println("Cкільки металу ви хочете залишити на складі?");
            int tempWeight = weight.nextInt();
            if((maximum- tempWeight)==0){
                break;
            }
            if(tempWeight<=5){
                System.out.println("Введіть кількість більше п'яти");
                System.out.println("Ви ще можете залишити " + (maximum - basic) + "кг металу");
                continue;
            }
            if ((basic + tempWeight) > maximum) {
                System.out.println("Занадто велика кількість металу");
                System.out.println("Ви ще можете залишити " + (maximum - basic) + "кг металу");
                continue;
            }

            basic = basic + tempWeight;
            if (basic == maximum) {
                System.out.println("Склад заповнено");
                break;
            }

            System.out.println("Ви ще можете залишити " + (maximum - basic) + "кг металу");
        }

    }
}

