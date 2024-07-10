package list;

import java.util.ArrayList;
import java.util.List;

public class ListTask {
    private List<Task> tasks;

    public ListTask() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String description) {
        tasks.add(new Task(description));
    }

    public void removeTask(String description) {
        List<Task> tasksToRemove = new ArrayList<>();
        for (Task task : tasks) {
            if (task.getDescription().equals(description)) {
                tasksToRemove.add(task);
            }
        }
        tasks.removeAll(tasksToRemove);
    }

    public int getTotalTasks(){
        return tasks.size();
    }

    public void getTaskDescriptions() {
        System.out.println(tasks);
    }
}
