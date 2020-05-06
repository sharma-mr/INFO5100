/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PharmaceuticalEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.PharmacyAgentOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PharmacyAgentWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class RequestDoctorToPharmacyAgentJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem system;
    private Network sourceNetwork;
    private Network targetNetwork;

    /**
     * Creates new form RequestLabTestJPanel
     */
    public RequestDoctorToPharmacyAgentJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, EcoSystem system, Network sourceNetwork, Network targetNetwork) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.system = system;
        this.sourceNetwork = sourceNetwork;
        this.targetNetwork = targetNetwork;
        valueLabel.setText(enterprise.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        requestTestJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        messageJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(null);

        requestTestJButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        requestTestJButton.setText("Request Task");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        add(requestTestJButton);
        requestTestJButton.setBounds(380, 190, 169, 37);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Message");
        add(jLabel1);
        jLabel1.setBounds(270, 140, 65, 22);
        add(messageJTextField);
        messageJTextField.setBounds(380, 140, 170, 20);

        backJButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton);
        backJButton.setBounds(230, 190, 113, 37);

        valueLabel.setText("<value>");
        add(valueLabel);
        valueLabel.setBounds(380, 100, 130, 14);

        enterpriseLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(255, 255, 255));
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel);
        enterpriseLabel.setBounds(250, 90, 120, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/pharmacy.jpg"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(4, 4, 1480, 750);
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed

        String message = messageJTextField.getText();
        if (!message.isEmpty()) {
            PharmacyAgentWorkRequest request = new PharmacyAgentWorkRequest();
            request.setMessage(message);
            request.setSender(userAccount);
            request.setStatus("Sent");

            Enterprise ent = null;
            Organization org = null;
            if (sourceNetwork != targetNetwork) {
                    for (Enterprise enterprise : targetNetwork.getEnterpriseDirectory().getEnterpriseList()) {
                        if (enterprise instanceof PharmaceuticalEnterprise) {
                            ent = enterprise;
                        }
                        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                            if (organization instanceof PharmacyAgentOrganization) {
                                org = organization;
                                break;
                            }
                        }
                    }
                } else {
                    for (Enterprise enterprise : sourceNetwork.getEnterpriseDirectory().getEnterpriseList()) {
                        if (enterprise instanceof PharmaceuticalEnterprise) {
                            ent = enterprise;
                        }
                        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                            if (organization instanceof PharmacyAgentOrganization) {
                                org = organization;
                                break;
                            }
                        }
                    }
                } 
            if (org != null) {
                org.getWorkQueue().getWorkRequestList().add(request);
                userAccount.getWorkQueue().getWorkRequestList().add(request);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please enter correct input");
        }
        messageJTextField.setText("");
    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DoctorWorkAreaJPanel dwjp = (DoctorWorkAreaJPanel) component;
        dwjp.populateDoctorToPharmacyAgentRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField messageJTextField;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
