package Deepskilling.Week3_Spring_Data_Jpa.JPA_vs_Hibernate_vs_SpringData.src.main.java.com.cognizant.SpringDataJPAImplementation;
import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String department;

    public Employee() {}
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    // getters & setters
}
