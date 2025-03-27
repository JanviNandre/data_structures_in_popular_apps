import java.util.PriorityQueue;

/**
 * Demonstrates PriorityQueue - processes elements by priority
 */
public class PriorityQueueDemo {
    private PriorityQueue<Task> taskQueue = new PriorityQueue<>(
            (a, b) -> Integer.compare(a.getPriority(), b.getPriority())
    );

    /**
     * Adds new task to queue
     * @param task to add
     */
    public void addTask(Task task) {
        taskQueue.add(task);
        System.out.println("Added task: " + task.getName());
    }

    /**
     * Processes highest priority task
     * @return completed task
     */
    public Task completeTask() {
        return taskQueue.poll();
    }

    /**
     * @return number of pending tasks
     */
    public int getTaskCount() {
        return taskQueue.size();
    }
}

class Task {
    private String name;
    private int priority;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() { return name; }
    public int getPriority() { return priority; }
}