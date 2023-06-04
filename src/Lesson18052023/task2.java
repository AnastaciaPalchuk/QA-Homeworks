package Lesson18052023;

public class task2 {
    public static void main(String[] args) {
        int[] numbers = new int[45];
        int start = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) ((Math.random() * 101) - 50);
        }
        for (int i = 0; i < numbers.length; i++) {
            start = start + numbers[i];
        }
        System.out.println(start);
    }
}