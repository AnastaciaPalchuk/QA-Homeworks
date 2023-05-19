package QALesson;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Яку програму ви хочете встановити?");
        Scanner scanner = new Scanner(System.in);
        String yourProgram = scanner.nextLine();

        System.out.println("Яку операційну систему ви використовуєте?");
        Scanner scanner1 = new Scanner(System.in);
        String yourOS = scanner.next();
        switch (yourProgram.toUpperCase().trim()) {
            case ("INTELLIJ IDEA"):
                switch (yourOS.toUpperCase().trim()) {
                    case ("LINUX"):
                        System.out.println("Посилання на вашу програму: https://www.jetbrains.com/idea/download/#section=linux");
                        break;
                    case ("MACOS"):
                        System.out.println("Посилання на вашу програму: https://www.jetbrains.com/idea/download/#section=mac");
                        break;
                    case ("WINDOWS"):
                        System.out.println("Посилання на вашу програму: https://www.jetbrains.com/idea/download/#section=windows");
                        break;
                    default:
                        System.out.println("Операційну систему не знайдено, перевірте правильність написання");
                        break;
                }
                break;
            case ("GIT"):
                switch (yourOS.toUpperCase().trim()) {
                    case ("LINUX"):
                        System.out.println("Посилання на вашу програму: https://git-scm.com/download/linux");
                        break;
                    case ("MACOS"):
                        System.out.println("Посилання на вашу програму: https://git-scm.com/download/mac");
                        break;
                    case ("WINDOWS"):
                        System.out.println("Посилання на вашу програму: https://git-scm.com/download/win");
                        break;
                    default:
                        System.out.println("Операційну систему не знайдено, перевірте правильність написання");
                        break;
                }
                break;
            case ("JAVA"):
                switch (yourOS.toUpperCase().trim()) {
                    case ("LINUX"):
                        System.out.println("Посилання на вашу програму: https://www.oracle.com/java/technologies/downloads/");
                        break;
                    case ("MACOS"):
                        System.out.println("Посилання на вашу програму: https://www.oracle.com/java/technologies/downloads/#jdk20-mac");
                        break;
                    case ("WINDOWS"):
                        System.out.println("Посилання на вашу програму: https://www.oracle.com/java/technologies/downloads/#jdk20-windows");
                        break;
                    default:
                        System.out.println("Операційну систему не знайдено, перевірте правильність написання");
                        break;
                }
                break;
            default:
                System.out.println("Програму не знайдено, перевірте правильність написання");
                break;
        }
    }
}


