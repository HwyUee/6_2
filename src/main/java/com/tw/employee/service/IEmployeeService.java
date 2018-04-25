package com.tw.employee.service;

import com.tw.employee.pojo.Employee;

import java.util.ArrayList;

/**
 * Created by HwyUee on 2018/4/25.
 */
public interface IEmployeeService {
     String addEmployee(Employee employee);
     String removeEmployee(int id);
     String updateEmployee(Employee employee);
     ArrayList<Employee> selectEmployee();

}
