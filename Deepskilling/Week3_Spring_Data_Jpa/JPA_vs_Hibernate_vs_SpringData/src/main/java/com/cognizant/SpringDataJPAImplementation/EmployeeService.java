package Deepskilling.Week3_Spring_Data_Jpa.JPA_vs_Hibernate_vs_SpringData.src.main.java.com.cognizant.SpringDataJPAImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Transactional
    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }
}
