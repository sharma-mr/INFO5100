/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.HealthcareInsuranceAgentRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class HealthcareInsuranceAgentOrganization extends Organization{

    public HealthcareInsuranceAgentOrganization() {
        super(Organization.Type.HealthcareInsuranceAgent.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new HealthcareInsuranceAgentRole());
        return roles;
    }
     
}