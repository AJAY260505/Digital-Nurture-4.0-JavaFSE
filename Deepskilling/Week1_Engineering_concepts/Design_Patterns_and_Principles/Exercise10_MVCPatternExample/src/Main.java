public class Main {
    public static void main(String[] args) {
        Student student = new Student("Ajay", "6383393", "A");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);

        // Initial view
        controller.updateView();

        // Update student details
        controller.setStudentName("Ajay J");
        controller.setStudentGrade("A+");

        // Updated view
        controller.updateView();
    }
}
