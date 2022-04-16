package com.nareksarkisyan.spring.springboot.springboot_rest.dao;

import com.nareksarkisyan.spring.springboot.springboot_rest.entity.Employee;

import java.util.List;

public interface EmployeeDao {

    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);
}
