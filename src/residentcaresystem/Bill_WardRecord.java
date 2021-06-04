
package residentcaresystem;

/**
 *
 * @author Mahiteja Bellamkonda
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class Bill_WardRecord extends javax.swing.JFrame {
Connection con=null;
ResultSet rs=null;
PreparedStatement pst=null;
    /**
     * Creates new form Bill_RoomRecord
     */
    public Bill_WardRecord() {
        initComponents();
        con= Connect.ConnectDB();
        Get_Data();
        setLocationRelativeTo(null);
    }
 private void Get_Data(){
         try{
     String sql="Select BillNo as 'Bill No',DisChargePatient_Ward.ID as 'Discharge ID', AdmitPatient_Ward.AdmitID as 'Admit ID',PatientRegistration.PatientID as 'Patient ID',PatientRegistration.PatientName as 'Patient Name',PatientRegistration.Gen as 'Gender',PatientRegistration.BG as 'Blood Group',Disease,AdmitDate as 'Admit Date',Ward.WardName as 'Ward Name',Doctor.DoctorID as 'Doctor ID',DoctorName as 'Doctor Name',DischargeDate as 'Discharge Date',Bill_Ward.BedCharges as 'Bed Charges',Bill_Ward.ServiceCharges as 'Service Charges',Bill_Ward.BillingDate as 'Billing Date',PaymentMode as 'Payement Mode',PaymentModeDetails as 'Payment Mode Details',TotalCharges as 'Total Charges',ChargesPaid as 'Charges Paid',DueCharges as 'Due Charges',NoOfDays as 'No Of Days',TotalBedCharges as 'Total Bed Charges' from Ward,Doctor,PatientRegistration,AdmitPatient_Ward,DischargePatient_Ward,Bill_Ward where Ward.WardName=AdmitPatient_Ward.WardName and Doctor.DoctorID=AdmitPatient_Ward.DoctorID and PatientRegistration.PatientID=AdmitPatient_Ward.PatientID  and AdmitPatient_Ward.admitID= DischargePatient_Ward.admitID and Bill_Ward.DischargeID=DischargePatient_Ward.ID  order by Billingdate";
     pst=con.prepareStatement(sql);
          rs= pst.executeQuery();
         jTable1.setModel(DbUtils.resultSetToTableModel(rs));
         }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
          
}
    }
    /**
     * 
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Billing Record");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1306, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       try{
            con=Connect.ConnectDB();
            int row= jTable1.getSelectedRow();
            this.hide();
            Bill_Ward frm = new Bill_Ward();
            frm.setVisible(true);
            String add= jTable1.getModel().getValueAt(row, 0).toString();
            frm.txtBillNo.setText(add);
             String add1= jTable1.getModel().getValueAt(row, 1).toString();
            frm.txtDischargeID.setText(add1);
             String add2= jTable1.getModel().getValueAt(row, 2).toString();
            frm.txtAdmitID.setText(add2);
             String add3= jTable1.getModel().getValueAt(row, 3).toString();
            frm.PatientID.setText(add3);
              String add4= jTable1.getModel().getValueAt(row, 4).toString();
            frm.txtPatientName.setText(add4);
              String add5= jTable1.getModel().getValueAt(row, 5).toString();
            frm.txtGender.setText(add5);
              String add6= jTable1.getModel().getValueAt(row, 6).toString();
            frm.txtBloodGroup.setText(add6);
              String add7= jTable1.getModel().getValueAt(row, 7).toString();
            frm.txtDisease.setText(add7);
              String add8= jTable1.getModel().getValueAt(row, 8).toString();
            frm.txtAdmitDate.setText(add8);
              String add9= jTable1.getModel().getValueAt(row, 9).toString();
            frm.txtWardname.setText(add9);
              String add10= jTable1.getModel().getValueAt(row, 10).toString();
            frm.txtDoctorID.setText(add10);
              String add11= jTable1.getModel().getValueAt(row, 11).toString();
            frm.txtDoctorName.setText(add11);
              String add12= jTable1.getModel().getValueAt(row, 12).toString();
            frm.txtDischargeDate.setText(add12);
              String add13= jTable1.getModel().getValueAt(row, 13).toString();
            frm.txtBedCharges.setText(add13);
              String add14= jTable1.getModel().getValueAt(row, 14).toString();
            frm.txtServiceCharges.setText(add14);
              String add15= jTable1.getModel().getValueAt(row, 15).toString();
            frm.txtBillingDate.setText(add15);
              String add16= jTable1.getModel().getValueAt(row, 16).toString();
            frm.cmbPaymentMode.setSelectedItem(add16);
              String add17= jTable1.getModel().getValueAt(row, 17).toString();
            frm.txtPaymentModeDetails.setText(add17);
             String add18= jTable1.getModel().getValueAt(row, 18).toString();
            frm.txtTotalCharges.setText(add18);
             String add19= jTable1.getModel().getValueAt(row, 19).toString();
            frm.txtTotalPaid.setText(add19);
             String add20= jTable1.getModel().getValueAt(row, 20).toString();
            frm.txtDueCharges.setText(add20);
             String add21= jTable1.getModel().getValueAt(row, 21).toString();
            frm.txtNoOfDays.setText(add21);
             String add22= jTable1.getModel().getValueAt(row, 22).toString();
            frm.txtTotalBedCharges.setText(add22);
            frm.PatientID.setText(add3);
            frm.btnUpdate.setEnabled(true);
            frm.btnDelete.setEnabled(true);
            frm.btnSave.setEnabled(false);
             
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.hide();
       Bill_Ward frm = new Bill_Ward();
       frm.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Bill_RoomRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bill_RoomRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bill_RoomRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bill_RoomRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bill_RoomRecord().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}

