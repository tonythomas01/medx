/*
 * Copyright (C) 2014 router
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package medx;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author router
 */
public class NewDoctorPanel extends stdpanel {
    String DoctorName;
    Integer DoctorAge;
    String DoctorGender;
    String DoctorAddressLine1;
    String DoctorAddressLine2;
    String DoctorPhone;
    Integer DoctorJoiningYear;
    String DoctorDepartment;

    /**
     * Creates new form NewDoctorPanel
     */
    public NewDoctorPanel( JPanel j ) {
        super( j );
        initComponents();
        JDBCConnections j1 = new JDBCConnections();
        this.nextDocId.setText( j1.getNextDotorId().toString() );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    public void doResetAction() {
        docName.setText("");
        docAddress1.setText("");
        docAddress2.setText("");
        docAge.setText("");
        docJoiningYear.setText("");
        docPhone.setText("");
        docDepartment.setText("");
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        docName = new javax.swing.JTextField();
        docAge = new javax.swing.JTextField();
        docGender = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        docDepartment = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        docJoiningYear = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        docAddress1 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        docAddress2 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        docPhone = new javax.swing.JTextField();
        docSubmit = new javax.swing.JButton();
        docReset = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        nextDocId = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        jLabel1.setText("Doctor Name ");

        jLabel2.setText("Age");

        jLabel3.setText("Gender");

        docAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docAgeActionPerformed(evt);
            }
        });

        docGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "male", "female" }));

        jLabel4.setText("Department");

        docDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docDepartmentActionPerformed(evt);
            }
        });

        jLabel5.setText("Joining Year");

        docJoiningYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docJoiningYearActionPerformed(evt);
            }
        });

        jLabel6.setText("Address Line 1");

        docAddress1.setColumns(20);
        docAddress1.setRows(5);
        jScrollPane1.setViewportView(docAddress1);

        jLabel7.setText("Address Line 2");

        docAddress2.setColumns(20);
        docAddress2.setRows(5);
        jScrollPane2.setViewportView(docAddress2);

        jLabel8.setText("Phone");

        docSubmit.setText("Submit");
        docSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docSubmitActionPerformed(evt);
            }
        });

        docReset.setBackground(new java.awt.Color(255, 51, 51));
        docReset.setText("Reset");
        docReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docResetActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        nextDocId.setEditable(false);

        jLabel9.setText("Doctor Id");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(docSubmit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(docReset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addComponent(docPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(docAge, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(docGender, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nextDocId, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(docJoiningYear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(docDepartment, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                            .addComponent(docName, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextDocId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(docName, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(docAge, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(docGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(docDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(docJoiningYear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(docPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(docSubmit)
                    .addComponent(docReset)
                    .addComponent(jButton1))
                .addGap(28, 28, 28))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void docAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_docAgeActionPerformed

    private void docSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docSubmitActionPerformed
        // TODO add your handling code here:
        DoctorName = docName.getText();
        DoctorAge =  Integer.parseInt( docAge.getText() );
        DoctorGender = (String)docGender.getSelectedItem();
        DoctorDepartment = docDepartment.getText();
        DoctorAddressLine1 = docAddress1.getText();
        DoctorAddressLine2 = docAddress2.getText();
        DoctorJoiningYear = Integer.parseInt( docJoiningYear.getText() );
        DoctorPhone =  docPhone.getText();
        JDBCConnections j1 = new JDBCConnections();
        j1.createNewDoctorRecord( DoctorName,DoctorAge,DoctorGender, DoctorDepartment, 
                DoctorJoiningYear, DoctorAddressLine1, DoctorAddressLine2, DoctorPhone );
        JOptionPane.showMessageDialog(null,"Successfully Added","Add New Doctor",JOptionPane.WARNING_MESSAGE);
        this.doResetAction();
        this.nextDocId.setText( j1.getNextDotorId().toString() );
    }//GEN-LAST:event_docSubmitActionPerformed

    private void docResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docResetActionPerformed
        docName.setText("");
        docAddress1.setText("");
        docAddress2.setText("");
        docAge.setText("");
        docJoiningYear.setText("");
        docPhone.setText("");
        docDepartment.setText("");
    }//GEN-LAST:event_docResetActionPerformed

    private void docDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docDepartmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_docDepartmentActionPerformed

    private void docJoiningYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docJoiningYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_docJoiningYearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            AdminPanel a1 = new AdminPanel(j1);
            j1.removeAll();
            j1.add(a1);
            j1.repaint();
            j1.revalidate();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea docAddress1;
    private javax.swing.JTextArea docAddress2;
    private javax.swing.JTextField docAge;
    private javax.swing.JTextField docDepartment;
    private javax.swing.JComboBox docGender;
    private javax.swing.JTextField docJoiningYear;
    private javax.swing.JTextField docName;
    private javax.swing.JTextField docPhone;
    private javax.swing.JButton docReset;
    private javax.swing.JButton docSubmit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nextDocId;
    // End of variables declaration//GEN-END:variables
}
