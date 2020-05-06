/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Mrinal Sharma
 */
public class EmployeeDirectory {
    
     private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String name, Role role){
        Employee employee = new Employee();
        employee.setName(name);
        employee.setRole(role);
        employeeList.add(employee);
        return employee;
    }
    
}
