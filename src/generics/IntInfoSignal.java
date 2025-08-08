package generics;

import java.util.ArrayList;

public class IntInfoSignal implements InfoSignal<Integer> {
    ArrayList<Integer> values;

    public IntInfoSignal(ArrayList<Integer> values) {
        this.values = values;

    }

    @Override
    public Integer getLatestValue() {
        if (values.isEmpty()) {
            return values.get(values.size() - 1);
        }
        else {
            return null;
        }
    }

    @Override
    public void update(Integer value) {
        values.add(value);
    }

    @Override
    public Integer[] getAsArray() {
        Integer[] array = new Integer[values.size()];
        return values.toArray(array);
    }
}
