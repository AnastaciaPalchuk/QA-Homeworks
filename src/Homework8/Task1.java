package Homework8;

import java.util.ArrayList;

public class Task1 {


    public static void NumberSum(int[] numbers) {
        ArrayList arrayList2 = new ArrayList<>();
        ArrayList arrayList = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                arrayList2.add(numbers[i]);
            } else {
                arrayList.add(numbers[i]);
            }
        }
        System.out.println(arrayList);
        System.out.println(arrayList2);
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 9, 36};
        NumberSum(numbers);
    }
}
