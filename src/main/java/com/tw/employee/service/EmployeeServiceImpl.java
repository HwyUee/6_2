package com.tw.employee.service;

import com.tw.employee.pojo.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by HwyUee on 2018/4/25.
 */
@Service("iEmployeeService")
public class EmployeeServiceImpl implements IEmployeeService {

    HashMap<Integer, Employee> employeeHM = new HashMap<Integer, Employee>();


    @Override
    public String addEmployee(Employee employee) {

            if (employeeHM.containsKey(employee.getId())) {
                return "id重复，该员工已存在";
            } else {
                employeeHM.put(employee.getId(), employee);
                return employee.toString() + "已经成功被添加";
            }

    }

        @Override
        public String removeEmployee ( int id){

            if (employeeHM.containsKey(id)) {
                return employeeHM.remove(id) + "被成功删除";
            } else {
                return "该员工不存在";
            }
        }

        @Override
        public String updateEmployee (Employee employee){
            if (!employeeHM.containsKey(employee.getId())) {
                return "该员工不存在";
            }
            Employee e = employeeHM.get(employee.getId());
            if (employee.getName() != null) {
                e.setName(employee.getName());
            }
            if (employee.getSex() != null) {
                e.setSex(employee.getSex());
            }
            if (employee.getAge() != 0) {
                e.setAge(employee.getAge());
            }
            employeeHM.put(e.getId(), e);
            return e + "信息已经更新";
        }

        @Override
        public ArrayList<Employee> selectEmployee () {
            ArrayList<Employee> employeeArr = new ArrayList<Employee>();
            Iterator it = employeeHM.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object val = entry.getValue();
                employeeArr.add((Employee) val);
            }
            return employeeArr;
        }
    }

