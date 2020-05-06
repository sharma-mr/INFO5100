/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Role.Role;

/**
 *
 * @author Mrinal Sharma
 */
public class Employee {
    
     private String name;
    private int id;
    private static int count = 1;
    private Role role;

    public Employee() {
        id = count;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    
    
}
