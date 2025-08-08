package generics;

import java.util.ArrayList;

public class GenericHelperClass<T> {
    public void printArrayList(ArrayList<T> list) {
        for (T item : list) {
            System.out.println(item);
        }
    }

}
