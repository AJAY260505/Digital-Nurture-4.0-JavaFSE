public class TaskManager {
    Task head = null;

    public void addTask(int id, String name, String status) {
        Task newTask = new Task(id, name, status);
        if (head == null) {
            head = newTask;
        } else {
            Task temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = newTask;
        }
    }

    public void traverseTasks() {
        Task temp = head;
        while (temp != null) {
            System.out.println("Task ID: " + temp.taskId + ", Name: " + temp.taskName + ", Status: " + temp.status);
            temp = temp.next;
        }
    }

    public void searchTask(int id) {
        Task temp = head;
        while (temp != null) {
            if (temp.taskId == id) {
                System.out.println("Found Task: " + temp.taskName + " [" + temp.status + "]");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Task not found.");
    }

    public void deleteTask(int id) {
        if (head == null) return;

        if (head.taskId == id) {
            head = head.next;
            return;
        }

        Task temp = head;
        while (temp.next != null && temp.next.taskId != id) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        } else {
            System.out.println("Task not found.");
        }
    }
}
