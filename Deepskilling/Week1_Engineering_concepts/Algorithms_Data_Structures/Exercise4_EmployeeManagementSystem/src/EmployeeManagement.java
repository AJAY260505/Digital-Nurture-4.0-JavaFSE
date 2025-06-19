class Employee {
    int employeeId;
    String name;
    String position;
    double salary;

    Employee(int id, String name, String position, double salary) {
        this.employeeId = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    void display() {
        System.out.println("ID: " + employeeId + ", Name: " + name +
                           ", Position: " + position + ", Salary: ₹" + salary);
    }
}

public class EmployeeManagement {
    static final int MAX_EMPLOYEES = 100;
    static Employee[] employees = new Employee[MAX_EMPLOYEES];
    static int count = 0;

    static void addEmployee(Employee e) {
        if (count < MAX_EMPLOYEES) {
            employees[count++] = e;
            System.out.println("Employee added.");
        } else {
            System.out.println("Employee array is full.");
        }
    }

    static void displayAll() {
        System.out.println("\nAll Employees:");
        for (int i = 0; i < count; i++) {
            employees[i].display();
        }
    }

    static void searchEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                System.out.println("Employee found:");
                employees[i].display();
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    static void deleteEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--count] = null;
                System.out.println("Employee deleted.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public static void main(String[] args) {
        addEmployee(new Employee(101, "Ajay", "Developer", 40000));
        addEmployee(new Employee(102, "Riya", "HR", 35000));
        addEmployee(new Employee(103, "Karan", "Tester", 32000));

        displayAll();

        searchEmployee(102);

        deleteEmployee(101);

        displayAll();
    }
}
