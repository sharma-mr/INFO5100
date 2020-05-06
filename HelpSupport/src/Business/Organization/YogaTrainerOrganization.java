/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.YogaTrainerRole;
import Business.Role.DieticianRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class YogaTrainerOrganization extends Organization{

    public YogaTrainerOrganization() {
        super(Organization.Type.YogaTrainer.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new YogaTrainerRole());
        return roles;
    }
     
}