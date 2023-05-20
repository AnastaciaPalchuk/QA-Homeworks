package Homework5;

public class Task6 {
    public static void main(String[] args) {
        int[] numberArray = new int[45];
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = (int) ((Math.random() * 101) - 50);
//            System.out.println(numberArray[i] + " ");
        }
        int minimum = numberArray[0];
        int maximum = numberArray[0];
        for (int i = 0; i < numberArray.length; i++) {
            if (minimum > numberArray[i]) {
                minimum = numberArray[i];
            } if (maximum < numberArray[i]){
                maximum = numberArray[i];
            }
            }
        System.out.println("Найменше число:" + minimum);
        System.out.println("Найбільше число:" + maximum);
            }

}


