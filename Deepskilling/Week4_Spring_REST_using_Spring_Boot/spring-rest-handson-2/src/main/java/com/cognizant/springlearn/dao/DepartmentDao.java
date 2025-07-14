import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.cognizant.springlearn.model.Department; // Make sure path is correct

@Repository
public class DepartmentDao {
    @Autowired
    @Qualifier("departmentList")
    private List<Department> departmentList;

    public List<Department> getAllDepartments() {
        return departmentList;
    }
}
