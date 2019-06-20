import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        String[] arrayOfStrings = {"1", "2", "3", "4"};
        main.swapNumber(0, 3, arrayOfStrings);
        for (String o : arrayOfStrings) {
            System.out.print(o);
        }
        System.out.println();

        ArrayList arrayList = main.toArrayList(arrayOfStrings);
        System.out.println(arrayList.toString());
    }

    public <T> void swapNumber(int index1, int index2, T[] array) {
        T a = array[index1];
        array[index1] = array[index2];
        array[index2] = a;
    }

    public <T> ArrayList toArrayList(T[] array) {
        ArrayList<T> arrayList = new ArrayList<>();
        for (T o : array) {
            arrayList.add(o);
        }
        return arrayList;
    }
}
