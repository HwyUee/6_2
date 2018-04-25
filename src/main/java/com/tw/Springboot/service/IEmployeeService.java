package com.tw.Springboot.service;

import com.tw.Springboot.pojo.Employee;

import java.util.ArrayList;

/**
 * Created by HwyUee on 2018/4/25.
 */
public interface IEmployeeService {
    public String addEmployee(Employee employee);
    public String removeEmployee(int id);
    public String updateEmployee(Employee employee);
    public ArrayList<Employee> selectEmployee();

}
