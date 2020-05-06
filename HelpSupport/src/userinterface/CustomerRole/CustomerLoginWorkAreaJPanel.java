/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import userinterface.DoctorRole.*;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HealthcareInsuranceAgentWorkRequest;
import Business.WorkQueue.YogaTrainerWorkRequest;
import Business.WorkQueue.NurseWorkRequest;
import Business.WorkQueue.PharmacyAgentWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.DieticianRole.RequestYogaTrainerJPanel;
import userinterface.HealthcarePOSRole.RequestHealthcareInsuranceAgentJPanel;
import userinterface.PharmacistRole.RequestPharmacyAgentJPanel;

/**
 *
 * @author raunak
 */
public class CustomerLoginWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private Enterprise enterprise;
    private Network sourceNetwork;
    private Network targetNetwork;
    private UserAccount userAccount;
    /**
     * Creates new form PlumberWorkAreaJPanel
     */
    public CustomerLoginWorkAreaJPanel(JPanel userProcessContainer, EcoSystem system,UserAccount userAccount, Network sourceNetwork) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = userAccount;
        this.sourceNetwork = sourceNetwork;
        populateNetworkComboBox();
        populateRequestTable();
        populateDoctorToPharmacyAgentRequestTable();
        populateDoctorToHealthcareInsuranceAgentRequestTable();
        populateDoctorToYogaTrainerRequestTable();
    }
    
    
    private void populateNetworkComboBox() {
        networkComboBox.removeAllItems();
        for (Network network : system.getNetworkList()) {
            networkComboBox.addItem(network);
        }
    }
    
    
    
    public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            if(request instanceof NurseWorkRequest){
            Object[] row = new Object[4];
            row[0] = request.getMessage();
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            String result = ((NurseWorkRequest) request).getTestResult();
            row[3] = result == null ? "Waiting" : result;
            model.addRow(row);
            }
        }
    }
    
    public void populateDoctorToYogaTrainerRequestTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable1.getModel();
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            if (request instanceof YogaTrainerWorkRequest) {
                Object[] row = new Object[4];
                row[0] = request.getMessage();
                row[1] = request.getReceiver();
                row[2] = request.getStatus();
                String result = ((YogaTrainerWorkRequest) request).getTestResult();
                row[3] = result == null ? "Waiting" : result;
                model.addRow(row);
            }
        }
    }

    public void populateDoctorToHealthcareInsuranceAgentRequestTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable3.getModel();
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            if (request instanceof HealthcareInsuranceAgentWorkRequest) {
                Object[] row = new Object[4];
                row[0] = request.getMessage();
                row[1] = request.getReceiver();
                row[2] = request.getStatus();
                String result = ((HealthcareInsuranceAgentWorkRequest) request).getTestResult();
                row[3] = result == null ? "Waiting" : result;
                model.addRow(row);
            }
        }
    }

    public void populateDoctorToPharmacyAgentRequestTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable2.getModel();
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            if (request instanceof PharmacyAgentWorkRequest) {
                Object[] row = new Object[4];
                row[0] = request.getMessage();
                row[1] = request.getReceiver();
                row[2] = request.getStatus();
                String result = ((PharmacyAgentWorkRequest) request).getTestResult();
                row[3] = result == null ? "Waiting" : result;
                model.addRow(row);
            }
        }
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        requestTestJButton = new javax.swing.JButton();
        refreshTestJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        workRequestJTable1 = new javax.swing.JTable();
        requestTestJButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        workRequestJTable2 = new javax.swing.JTable();
        requestTestJButton2 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        workRequestJTable3 = new javax.swing.JTable();
        requestTestJButton3 = new javax.swing.JButton();
        networkComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(null);

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Message", "Receiver", "Status", "Result", "Network"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(3).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(4).setResizable(false);
        }

        add(jScrollPane1);
        jScrollPane1.setBounds(40, 122, 443, 108);

        requestTestJButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        requestTestJButton.setText("Request Task To Nurse");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        add(requestTestJButton);
        requestTestJButton.setBounds(206, 262, 282, 37);

        refreshTestJButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });
        add(refreshTestJButton);
        refreshTestJButton.setBounds(491, 26, 111, 37);

        enterpriseLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel);
        enterpriseLabel.setBounds(40, 26, 127, 30);

        valueLabel.setText("<value>");
        add(valueLabel);
        valueLabel.setBounds(197, 33, 158, 26);

        workRequestJTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Message", "Receiver", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(workRequestJTable1);
        if (workRequestJTable1.getColumnModel().getColumnCount() > 0) {
            workRequestJTable1.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable1.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable1.getColumnModel().getColumn(2).setResizable(false);
            workRequestJTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane2);
        jScrollPane2.setBounds(563, 122, 353, 108);

        requestTestJButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        requestTestJButton1.setText("Request Task To Pharmacy Agent ");
        requestTestJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButton1ActionPerformed(evt);
            }
        });
        add(requestTestJButton1);
        requestTestJButton1.setBounds(529, 477, 387, 37);

        workRequestJTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Message", "Receiver", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(workRequestJTable2);
        if (workRequestJTable2.getColumnModel().getColumnCount() > 0) {
            workRequestJTable2.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable2.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable2.getColumnModel().getColumn(2).setResizable(false);
            workRequestJTable2.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane3);
        jScrollPane3.setBounds(570, 341, 346, 97);

        requestTestJButton2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        requestTestJButton2.setText("Request Task To Yoga Trainer ");
        requestTestJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButton2ActionPerformed(evt);
            }
        });
        add(requestTestJButton2);
        requestTestJButton2.setBounds(563, 262, 353, 37);

        workRequestJTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Message", "Receiver", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(workRequestJTable3);
        if (workRequestJTable3.getColumnModel().getColumnCount() > 0) {
            workRequestJTable3.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable3.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable3.getColumnModel().getColumn(2).setResizable(false);
            workRequestJTable3.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane4);
        jScrollPane4.setBounds(35, 341, 453, 102);

        requestTestJButton3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        requestTestJButton3.setText("Request Task To HealthInsurance Agent ");
        requestTestJButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButton3ActionPerformed(evt);
            }
        });
        add(requestTestJButton3);
        requestTestJButton3.setBounds(35, 477, 453, 37);

        networkComboBox.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        networkComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkComboBoxActionPerformed(evt);
            }
        });
        add(networkComboBox);
        networkComboBox.setBounds(450, 600, 104, 34);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Select network");
        add(jLabel1);
        jLabel1.setBounds(229, 603, 152, 28);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Image11.jpg"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(0, 0, 1940, 970);
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestLabTestJPanel", new RequestNurseJPanel(userProcessContainer, userAccount, enterprise, system, sourceNetwork, (Network)networkComboBox.getSelectedItem()));
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateRequestTable();
        populateDoctorToPharmacyAgentRequestTable();
        populateDoctorToHealthcareInsuranceAgentRequestTable();
        populateDoctorToYogaTrainerRequestTable();
        
    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void requestTestJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButton1ActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestLabTestJPanel", new RequestPharmacyAgentJPanel(userProcessContainer, userAccount, enterprise, system, sourceNetwork, (Network)networkComboBox.getSelectedItem()));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_requestTestJButton1ActionPerformed

    private void requestTestJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButton2ActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestLabTestJPanel", new RequestYogaTrainerJPanel(userProcessContainer, userAccount, enterprise, system, sourceNetwork, (Network)networkComboBox.getSelectedItem()));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_requestTestJButton2ActionPerformed

    private void requestTestJButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButton3ActionPerformed
            // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestLabTestJPanel", new RequestHealthcareInsuranceAgentJPanel(userProcessContainer, userAccount, enterprise, sourceNetwork, (Network)networkComboBox.getSelectedItem()));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_requestTestJButton3ActionPerformed

    private void networkComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_networkComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JComboBox networkComboBox;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JButton requestTestJButton1;
    private javax.swing.JButton requestTestJButton2;
    private javax.swing.JButton requestTestJButton3;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workRequestJTable;
    private javax.swing.JTable workRequestJTable1;
    private javax.swing.JTable workRequestJTable2;
    private javax.swing.JTable workRequestJTable3;
    // End of variables declaration//GEN-END:variables
}

