package homework;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }


    public void addFruits(T fruit){
        fruits.add(fruit);
    }


    public float getWeight() {

        float TotalFruitWeight = 0;

        for (T fruit: fruits) {
            TotalFruitWeight += fruit.getWeight();
        }
        return TotalFruitWeight;
    }

    public boolean compare(Box box){
        return this.getWeight() == box.getWeight();
    }

    public void shift(Box<T> newbox) {
        for (T fruit: fruits) {
            newbox.addFruits(fruit);
        }

        fruits.clear();
    }

    @Override
    public String toString() {
        return "Box{" + "fruits=" + fruits + '}';
    }
}
