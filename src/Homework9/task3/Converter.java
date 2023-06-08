package Homework9.task3;

public class Converter {
    /*Необходимо создать класс конвертер, который будет иметь методы конвертации примитивных типов данных:
    метод convertToInt; (конвертирует byte, short, int, long, char, float, double, String). При вводе boolean выводит сообщение, что введен тип boolean.
    convertToDouble;    (конвертирует byte, short, int, long, char, float, double, String). При вводе boolean выводит сообщение, что введен тип boolean.
    converToString;     (конвертирует byte, short, int, long, char, boolean, float, double, String).
    У данного класса должен быть только один конструктор, в параметрах которого можно указать его имя.
    А также только один метод геттер для получения информации о названии данного конвертра.*/
    public String name;

    public Converter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static int convertToInt(byte b) {
        int result = Byte.toUnsignedInt(b);
        return result;
    }

    public static int convertToInt(short b) {
        int result = Integer.valueOf(b);
        return result;
    }

    public static int convertToInt(int b) {
        return b;
    }

    public static int convertToInt(long b) {
        int result = (int) b;
        return result;
    }

    public static int convertToInt(char b) {
        int result = b;
        return result;
    }

    public static int convertToInt(float b) {
        int result = (int) b;
        return result;
    }

    public static int convertToInt(double b) {
        int result = (int) b;
        return result;
    }

    public static int convertToInt(String b) {
        int result = Integer.parseInt(b);
        return result;
    }

    public static void convertToInt(boolean b) {
        System.out.println("Введено тип boolean.");
    }

    public static double convertToDouble(byte b) {
        double result = b;
        return result;
    }

    public static double convertToDouble(short b) {
        double result = b;
        return result;
    }

    public static double convertToDouble(int b) {
        double result = b;
        return result;
    }

    public static double convertToDouble(long b) {
        double result = b;
        return result;
    }

    public static double convertToDouble(char b) {
        double result = b;
        return result;
    }

    public static double convertToDouble(float b) {
        double result = b;
        return result;
    }

    public static double convertToDouble(double b) {
        return b;
    }

    public static double convertToDouble(String b) {
        double result = Double.parseDouble(b);
        return result;
    }

    public static void convertToDouble(boolean b) {
        System.out.println("Введено тип boolean.");
    }

    public static String convertToString(byte b) {
        String result = "" + b;
        return result;
    }

    public static String convertToString(short b) {
        String result = "" + b;
        return result;
    }

    public static String convertToString(int b) {
        String result = "" + b;
        return result;
    }

    public static String convertToString(long b) {
        String result = "" + b;
        return result;
    }

    public static String convertToString(char b) {
        String result = "" + b;
        return result;
    }

    public static String convertToString(float b) {
        String result = "" + b;
        return result;
    }

    public static String convertToString(double b) {
        String result = b + "";
        return result;
    }

    public static String convertToString(String b) {
        return b;
    }

    public static void convertToString(boolean b) {
        System.out.println("Введено тип boolean.");
    }
}
