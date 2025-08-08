package generics;

import java.util.ArrayList;

public class BooleanInfoSignal implements InfoSignal<Boolean> {
    ArrayList<Boolean> values;

    public BooleanInfoSignal(ArrayList<Boolean> values) {
        this.values = values;
    }

    @Override
    public Boolean getLatestValue() {
        if (values.isEmpty()) {
            return values.get(values.size() - 1);
        }
        else {
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
        return values.toArray(array);
    }
}
