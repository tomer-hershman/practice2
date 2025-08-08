package generics;

import java.util.ArrayList;

public class IntInfoSignal implements InfoSignal<Integer> {
    ArrayList<Integer> values;

    @Override
    public Integer getLatestValue() {
        try {
            return values.get(values.size() - 1);
        }
        catch (IndexOutOfBoundsException e) {
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
        for (int i = 0; i < values.size(); i++) {
            if (values.get(i) != null) {
                array[i] = values.get(i);
            } else {
                array[i] = null;
            }
        }
        return array;
    }
}
