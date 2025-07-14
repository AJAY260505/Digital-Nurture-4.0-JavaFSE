package com.cognizant.springlearn.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cognizant.springlearn.model.Employee;

@Repository
public class EmployeeDao {

    private List<Employee> employeeList;

    @Autowired
    public EmployeeDao(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public List<Employee> getAllEmployees() {
        return employeeList;
    }
}
