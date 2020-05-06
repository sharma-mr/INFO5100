/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Type type) {
        Organization organization = null;
        if (type.getValue().equals(Type.YogaTrainer.getValue())) {
            organization = new YogaTrainerOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Dietician.getValue())) {
            organization = new DieticianOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Doctor.getValue())) {
            organization = new DoctorOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Nurse.getValue())) {
            organization = new NurseOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.HealthcarePOS.getValue())) {
            organization = new HealthcarePOSOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.HealthcareInsuranceAgent.getValue())) {
            organization = new HealthcareInsuranceAgentOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Pharmacist.getValue())) {
            organization = new PharmacistOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.PharmacyAgent.getValue())) {
            organization = new PharmacyAgentOrganization();
            organizationList.add(organization);
        }

        return organization;
    }
}
