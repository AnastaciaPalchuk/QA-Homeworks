package ClassWork0606;

import java.util.Set;

 class Task1 {
   /* 1)Создать класс Auto. В данном классе создать поле String name, int price, boolean isNew
    создать геттеры и сеттеры для данных полей, а также конструктор класса,
    принимающий в параметры все поля данного класса.*/

    public String name;
    public int price;
    public boolean isNew;

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public boolean getIsNew() {
        return isNew;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setNew(Boolean isNew) {
        this.isNew = isNew;
    }

    public Task1(String Name, Integer price, boolean isNew) {
        this.name = Name;
        this.price = price;
        this.isNew = isNew;

    }
    @Override
     public String toString () {
        return name + " Price: " + price + " " + isNew;
    }
}

class Main {
    public static void main(String[] args) {
        Task1 Audi = new Task1("Audi", 250000, true);
//        System.out.println(Audi.getName());
//        System.out.println(Audi.getPrice());
        System.out.println(Audi);
    }


}
