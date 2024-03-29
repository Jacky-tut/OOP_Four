package homework;

import java.util.ArrayList;

public class Program {

    /*
    a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
    b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
    поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
    c. Для хранения фруктов внутри коробки можно использовать ArrayList;
    d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
    вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
    e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
    подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
    Можно сравнивать коробки с яблоками и апельсинами;
    f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
    Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
    Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
    g. Не забываем про метод добавления фрукта в коробку.

    Формат сдачи: ссылка на гитхаб проект*/
    public static void main(String[] args) {

        Box<Apple> appleBox = new Box<>();
        appleBox.addFruits(new Apple(10));

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruits(new Orange(7));

        System.out.println(appleBox.getWeight());
        System.out.println(orangeBox.getWeight());

        System.out.println(orangeBox.compare(appleBox));

        Box<Apple> appleNewBox = new Box<>();
        Box<Orange> orangeNewBox = new Box<>();

        appleBox.shift(appleNewBox);
        orangeBox.shift(orangeNewBox);


        System.out.println(appleNewBox);
        System.out.println(appleBox);
        System.out.println(orangeNewBox);
        System.out.println(orangeBox);

    }

}
