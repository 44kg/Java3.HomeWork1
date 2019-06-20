package task3;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits;

    public Box() {
        fruits = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        float weight = 0.0f;
        for (T fruit : fruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public boolean compare(Box box) {
        if (this.getWeight() == box.getWeight()) {
            return true;
        }
        else return false;
    }

    public void shiftFruits(Box<T> box) {
        fruits.addAll(box.getFruits());
        box.getFruits().clear();
    }

    public ArrayList getFruits() {
        return fruits;
    }

    @Override
    public String toString() {
        return  "Фруктов: " + fruits.size() + ". Вес: " + getWeight();
    }
}
