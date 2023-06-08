package Homework9.task1;

import java.util.Objects;

public class Computer {
   /* 1) Создать класс Computer c конструктором принимающим параметры
    Марка тип String, цена тип int, оперативная память тип int,
    и видеокарта тип int.
    Переопределить метод toString для вывода объекта класса в след. виде:
            "Создан PC.
    Имя = марка.
            Цена = цена.
            Видеокарта = объем видеокарты
    ОЗУ = Объем оперативной памяти."

    Все поля класса Computer должны быть приватными.
    Также создайте публичные методы для получения информации о полях класса Computer.
    А также методы для изменения его полей.

    Переопределите метод equals и метод hashCode для вашего класса.
    Сделайте так, чтобы компьютеры считались одинаковыми в случае если у них
    равны значения полей марка, оперативная память и видеокарта.

    В отдельном классе создайте объект класса компьютер, и выведите в консоль
    информацию о вашем объекте.*/
    private String brand;
    private Integer price;
    private Integer RAM;
    private Integer videoCard;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getRAM() {
        return RAM;
    }

    public void setRAM(Integer RAM) {
        this.RAM = RAM;
    }

    public Integer getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(Integer videoCard) {
        this.videoCard = videoCard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer computer)) return false;
        return Objects.equals(getBrand(), computer.getBrand()) && Objects.equals(getRAM(), computer.getRAM()) && Objects.equals(getVideoCard(), computer.getVideoCard());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getRAM(), getVideoCard());
    }

    @Override
    public String toString () {
        return "Створено РС: " + "\n" +
                "Марка: " + brand + "\n" +
                "Ціна: " + price + "\n" +
                "Обсяг оперативної пам'яті: " + RAM + "\n" +
                "Відео карта: " + videoCard;
    }
}

