package com.lov2codce.springdemo.com.mycoolapp.service;

import com.lov2codce.springdemo.com.mycoolapp.entity.Employee;

import java.util.List;

public interface EmployeeService {

     List<Employee> findAll();

     Employee findById(int theId);

     void save (Employee theEmployee);

     void deleteById(int theId);
}
