package com.cognizant.springlearn.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;

import com.cognizant.springlearn.model.Employee;
import com.cognizant.springlearn.service.exception.EmployeeNotFoundException;

@Repository
public class EmployeeDao {

    @Autowired
    private ApplicationContext context;

    @SuppressWarnings("unchecked")
    private List<Employee> getEmployeeList() {
        return (List<Employee>) context.getBean("employeeList");
    }

    public List<Employee> getAllEmployees() {
        return getEmployeeList();
    }

    public void updateEmployee(Employee updatedEmployee) throws EmployeeNotFoundException {
        List<Employee> employeeList = getEmployeeList();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId().equals(updatedEmployee.getId())) {
                employeeList.set(i, updatedEmployee);
                return;
            }
        }
        throw new EmployeeNotFoundException("Employee with ID " + updatedEmployee.getId() + " not found");
    }

    public void deleteEmployee(int id) throws EmployeeNotFoundException {
        List<Employee> employeeList = getEmployeeList();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId() == id) {
                employeeList.remove(i);
                return;
            }
        }
        throw new EmployeeNotFoundException("Employee with ID " + id + " not found");
    }

    public void addEmployee(Employee employee) {
        getEmployeeList().add(employee);
    }
}
