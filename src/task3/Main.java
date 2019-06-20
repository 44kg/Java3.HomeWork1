package task3;

public class Main {
    public static void main(String[] args) {
        Apple[] apples = new Apple[30];
        Orange[] oranges = new Orange[30];
        for (int i = 0; i < apples.length; i++) {
            apples[i] = new Apple();
        }
        for (int i = 0; i < oranges.length; i++) {
            oranges[i] = new Orange();
        }

        Box<Apple> box1 = new Box<>();
        Box<Apple> box2 = new Box<>();
        Box<Orange> box3 = new Box<>();
        Box<Orange> box4 = new Box<>();

        for (int i = 0; i < 10; i++) {
            box1.addFruit(apples[i]);
        }
        for (int i = 10; i < 30; i++) {
            box2.addFruit(apples[i]);
        }
        for (int i = 0; i < 12; i++) {
            box3.addFruit(oranges[i]);
        }
        for (int i = 12; i < 20; i++) {
            box4.addFruit(oranges[i]);
        }

        System.out.println("Вес: " + box1.getWeight());
        System.out.println("Вес: " + box2.getWeight());
        System.out.println("Вес: " + box3.getWeight());
        System.out.println("Вес: " + box4.getWeight());

        System.out.println("Сравнение весов: " + box1.compare(box2));
        System.out.println("Сравнение весов: " + box3.compare(box1));

        box1.shiftFruits(box2);
        box3.shiftFruits(box4);

        System.out.println("Сравнение весов: " + box1.compare(box3));

        System.out.println(box1.toString());
        System.out.println(box2.toString());
        System.out.println(box3.toString());
        System.out.println(box4.toString());
    }
}
