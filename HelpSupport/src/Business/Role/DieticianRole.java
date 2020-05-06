/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DieticianOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.DieticianRole.DieticianWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class DieticianRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {  
    return new DieticianWorkAreaJPanel(userProcessContainer, account, (DieticianOrganization)organization, enterprise, business, network);
    }
    
    
}
