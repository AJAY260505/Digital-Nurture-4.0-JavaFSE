package Deepskilling.Week3_Spring_Data_Jpa.JPA_vs_Hibernate_vs_SpringData.src.main.java.com.cognizant.SpringDataJPAImplementation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
