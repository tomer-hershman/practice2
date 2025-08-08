package generics;

import java.util.ArrayList;

public class BooleanInfoSignal implements InfoSignal<Boolean> {
    ArrayList<Boolean> values;

    @Override
    public Boolean getLatestValue() {
        try {
            return values.get(values.size() - 1);
        }
        catch (IndexOutOfBoundsException e) {
            return null;
        }
    }

    @Override
    public void update(Boolean value) {
        values.add(value);
    }

    @Override
    public Boolean[] getAsArray() {
        Boolean[] array = new Boolean[values.size()];
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
