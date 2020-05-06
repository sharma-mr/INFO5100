/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DieticianRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Mrinal Sharma
 */
public class DieticianOrganization extends Organization{

    public DieticianOrganization() {
        super(Organization.Type.Dietician.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DieticianRole());
        return roles;
    }
     
   
    
    
}
