package generics;

import java.util.ArrayList;

public class StringInfoSignal implements InfoSignal<String>{
    ArrayList<String> values;

    @Override
    public String getLatestValue() {
        try {
            return values.get(values.size() - 1);
        }
        catch (IndexOutOfBoundsException e) {
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
