package com.cognizant.springlearn.dao;

import com.cognizant.springlearn.model.Employee;
import com.cognizant.springlearn.service.exception.EmployeeNotFoundException;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeDao {
    private static List<Employee> employeeList = new ArrayList<>();

    public List<Employee> getAllEmployees() {
        return employeeList;
    }

    public void updateEmployee(Employee updatedEmployee) throws EmployeeNotFoundException {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId().equals(updatedEmployee.getId())) {
                employeeList.set(i, updatedEmployee);
                return;
            }
        }
        throw new EmployeeNotFoundException("Employee with ID " + updatedEmployee.getId() + " not found");
    }

    public void deleteEmployee(int id) throws EmployeeNotFoundException {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId() == id) {
                employeeList.remove(i);
                return;
            }
        }
        throw new EmployeeNotFoundException("Employee with ID " + id + " not found");
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }
}
