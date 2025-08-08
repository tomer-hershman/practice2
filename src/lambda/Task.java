package lambda;

public class Task {
    public String name;
    public boolean isDone;
    public int importance;
    Task(String name, boolean isDone, int importance) {
        this.name = name;
        this.isDone = isDone;
        this.importance = importance;
    }
    public void updateIsDone(boolean isDone) {
        this.isDone = isDone;
    }
    public void updateImportance(int importance) {
        this.importance = importance;
    }
    public String getName() {
        return name;
    }
    public boolean getIsDone() {
        return isDone;
    }
    public int getImportance() {
        return importance;
    }
}
