package generics;

public interface InfoSignal<T> {

    public T getLatestValue();

    public void update(T value);

    public T[] getAsArray();
}
