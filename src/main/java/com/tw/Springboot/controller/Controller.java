package com.tw.Springboot.controller;

import com.tw.Springboot.pojo.Employee;
import com.tw.Springboot.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * Created by HwyUee on 2018/4/25.
 */
@RestController
@RequestMapping("/employee/")
public class Controller {
    @Autowired
    private IEmployeeService iEmployeeService;

    /**
     * 增加员工
     * @param employee
     * @return
     */
    @RequestMapping(value = "add.do")
    public String addEmployee(Employee employee){

        return iEmployeeService.addEmployee(employee);
    }

    /**
     * 根据员工id删除员工
     * @param id
     * @return
     */
    @RequestMapping(value = "remove.do")
    @ResponseBody
    public String removeEmployee(int id){

        return iEmployeeService.removeEmployee(id);
    }

    /**
     * 更新员工
     * @param employee
     * @return
     */
    @RequestMapping(value = "update.do")
    public String updateEmployee(Employee employee){
        return iEmployeeService.updateEmployee(employee);
    }

    /**
     * 查询所有的员工
     * @return
     */
    @RequestMapping(value = "select.do")
    @ResponseBody
    public ArrayList<Employee> selectEmployee(){

        return iEmployeeService.selectEmployee();
    }

}
