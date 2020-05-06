/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DoctorRole;
import Business.Role.DieticianRole;
import Business.Role.HealthcarePOSRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author apple
 */
public class HealthcarePOSOrganization extends Organization {
    
    public HealthcarePOSOrganization() {
        super(Organization.Type.HealthcarePOS.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new HealthcarePOSRole());
        return roles;
    }
}
