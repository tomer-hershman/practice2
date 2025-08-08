package generics;

import java.util.ArrayList;

public class StringInfoSignal implements InfoSignal<String>{
    ArrayList<String> values;

    public StringInfoSignal(ArrayList<String> values) {
        this.values = values;
    }

    @Override
    public String getLatestValue() {
        if (values.isEmpty()) {
            return values.get(values.size() - 1);
        }
        else {
            return null;
        }
    }

    @Override
    public void update(String value) {
        values.add(value);
    }

    @Override
    public String[] getAsArray() {
        String[] array = new String[values.size()];
        return values.toArray(array);
    }
}
