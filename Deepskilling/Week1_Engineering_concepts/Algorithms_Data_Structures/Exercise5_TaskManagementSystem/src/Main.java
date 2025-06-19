public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        manager.addTask(101, "Design UI", "Pending");
        manager.addTask(102, "Develop Backend", "In Progress");
        manager.addTask(103, "Write Tests", "Pending");

        System.out.println("All Tasks:");
        manager.traverseTasks();

        System.out.println("\nSearch Task ID 102:");
        manager.searchTask(102);

        System.out.println("\nDelete Task ID 101:");
        manager.deleteTask(101);

        System.out.println("\nTasks after deletion:");
        manager.traverseTasks();
    }
}
