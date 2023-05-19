package QALesson;

public class HomeworkLesson3 {
    public static void main(String[] args) {
        System.out.println("Task 1");
        String string1 = "This line that I want to cut, cause it is too long";
        int indexE = string1.indexOf("T");
        int indexG = string1.lastIndexOf("e");
        String string2 = string1.substring(indexE, indexG + 1);
        String string2test = string2.replace("I", "don't");
        String string3 = string2test.concat(" it is perfect");
        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);


        System.out.println("Task 2");
        String task2string1 = "Testing, is my favourite job";
        String[] splitText = task2string1.split(" ");
        String firstWord = splitText[0];
        int lengthFirst = firstWord.length();
        System.out.println("Cлово1 = "+ firstWord+" Длинна этого слова = "+lengthFirst);
        String secondWord = splitText[1];
        int lengthSecond = secondWord.length();
        System.out.println("Cлово2 = "+ secondWord+", Длинна этого слова = "+lengthSecond);
        String thirdWord = splitText[2];
        int lengthThird = thirdWord.length();
        System.out.println("Cлово3 = "+ thirdWord+", Длинна этого слова = "+lengthThird);
        String fourthWord = splitText[3];
        int lengthFourth = fourthWord.length();
        System.out.println("Cлово4 = "+ fourthWord+", Длинна этого слова = "+lengthFourth);
        String fifthWord = splitText[4];
        int lengthFifth = fifthWord.length();
        System.out.println("Cлово5 = "+ fifthWord+", Длинна этого слова = "+lengthFifth);



        System.out.println("Task 3");
        String task3string1 ="Completely random text in English. In it, we just need to determine how many times the character 'a' occurs there. And we can use the split method and the length method.";
        String[] task3Split = task3string1.split("a");
        int ammountA = task3Split.length-1;
        System.out.println(ammountA);

    }
}
