package Homework9.task2;

public class Tree {
    /* Создать класс Tree с перегруженными конструкторами.
    В классе есть Tree есть поля:
    String type; int height, int coutOfsticks, String colour;

    Конструктор1 принимающий в параметры String type; int height
    и присваивающий значение полям coutOfsticks значение 13,
    colour "Зеленый".

    Конструктор2 принимающий в параметры int height, int coutOfsticks,
    String colour и присваивающий значение полю type "пихта".

    Констуктор по умолчанию 3, который присваивает height = 350, coutOfsticks = 29,
    сolour = "Желтый".

    Конструктор4 который принимает в параметры String type,
    и вызывает внутри себя конструктор 3.

    Создать в отдельном классе main 4 объекта класса Tree используя 4 созданных конструктора.*/
    public String type;
    public Integer height;
    public Integer countOfSticks;
    public String colour;

    public Tree(String type, Integer height) {
        this.type = type;
        this.height = height;
        this.countOfSticks = 13;
        this.colour = "Green";
    }

    public Tree(Integer height, Integer countOfSticks) {
        this.type = "Yew";
        this.height = height;
        this.countOfSticks = countOfSticks;
    }

    public Tree(String type, Integer height, Integer countOfSticks, String colour) {
        this.type = type;
        this.height = 350;
        this.countOfSticks = 29;
        this.colour = "Yellow";
    }

    public Tree(String type) {
        this(type, 150, 14, "Purple");
        this.type = type;
    }
}
