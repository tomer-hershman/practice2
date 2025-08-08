package lambda;

import java.util.ArrayList;

public class TaskManager {
    public static ArrayList<Task> tasks = new ArrayList<>();

    public static void addTaskToList(Task task) {
        tasks.add(task);
    }

    public static void createTask(String name, boolean isDone, int importance) {
        Task task = new Task(name, isDone, importance);
        addTaskToList(task);
    }


    public static void filterTasksInternal(TaskFilter filter, ActionOnFilteredTask action,boolean IsReversed) {
        for (Task task : tasks) {
            if (filter.filterTask(task) ^ IsReversed) {
                action.actionOnFilteredTask(task);
            }
        }
    }
    public static void filterTasks(TaskFilter filter, ActionOnFilteredTask action){
        filterTasksInternal(filter, action, false);
    }

    public static void filterTasksReversed(TaskFilter filter, ActionOnFilteredTask action) {
        filterTasksInternal(filter, action, true);
    }


    public static void printFilteredTasks(TaskFilter filter) {
        filterTasks(filter,(task) -> System.out.println("task name: " + task.getName()));
    }
    public static void deleteFilteredTasks(TaskFilter filter) {
        filterTasks(filter,(task -> tasks.remove(task)));
    }
    public static void raiseImportanceOfFilteredTasks(TaskFilter filter, int importance) {
        filterTasks(filter,(task) -> task.updateImportance(task.getImportance() + importance));
    }
    public static void LowerImportanceOfFilteredTasks(TaskFilter filter, int importance) {
        filterTasksReversed(filter,(task) -> task.updateImportance(task.getImportance() - importance));
    }



}
