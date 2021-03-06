/*
 * Copyright (C) 2014 router
 *
 * 
            @Override
            public void setSelectedItem(Object anItem) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Object getSelectedItem() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public int getSize() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public E getElementAt(int index) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void addListDataListener(ListDataListener l) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void removeListDataListener(ListDataListener l) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        }his program is free software: you can redistribute it and/or modify
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

import java.util.Vector;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author router
 */
public class NewPatientPanel extends stdpanel {
    String PatientName;
    Integer PatientAge;
    String PatientGender;
    String PatientAddressLine1;
    String PatientAddressLine2;
    Integer PatientPhone;
    String[] DoctorNames;
    String[] testS = new String[]{ "gi", "hey" };


    /**
     * Creates new form NewPatientPanel
     */
    public NewPatientPanel( JPanel j ) {
        super( j );
        initComponents();
        JDBCConnections j1 = new JDBCConnections();
        this.nextPatientId.setText( j1.getNextPatientId().toString() );
        this.nextAppoinmentID.setText( j1.getNextAppoinmentId().toString() );
    }
    public void RefreshPane( ) {
        patName.setText("");
        patAddress1.setText("");
        patAddress2.setText("");
        patAge.setText("");
        patPhone.setText("");
        this.appoinmentDay.setText("");
        this.appoinmentMonth.setText("");
        this.appoinmentYear.setText("");
        this.appoinmentTime1.setText("");
        this.appoinmentTime2.setText("");
        JDBCConnections j1 = new JDBCConnections();
        this.nextPatientId.setText( j1.getNextPatientId().toString() );
        this.nextAppoinmentID.setText( j1.getNextAppoinmentId().toString() );
    }
    
    public void RefresAvailableBox() {
        JDBCConnections j1 = new JDBCConnections();
        Integer docId = j1.getDoctorId( this.jComboBox1.getSelectedItem().toString() );
        doctorId.setText( docId.toString() );
        Integer docAvailableSeates = 15 - j1.getDoctorTotalAppoinments( docId );
        docAvailable.setText( docAvailableSeates.toString() );
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        patName = new javax.swing.JTextField();
        patAge = new javax.swing.JTextField();
        patGender = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        patAddress1 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        patAddress2 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        patPhone = new javax.swing.JTextField();
        patSubmit = new javax.swing.JButton();
        patReset = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        nextPatientId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        doctorId = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        docAvailable = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        appoinmentDay = new javax.swing.JTextField();
        appoinmentTime1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        nextAppoinmentID = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        appoinmentYear = new javax.swing.JTextField();
        appoinmentMonth = new javax.swing.JTextField();
        appoinmentTime2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        jLabel1.setText("Patient Name ");

        jLabel2.setText("Age");

        jLabel3.setText("Gender");

        patAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patAgeActionPerformed(evt);
            }
        });

        patGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "male", "female" }));
        patGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patGenderActionPerformed(evt);
            }
        });

        jLabel6.setText("Address Line 1");

        patAddress1.setColumns(20);
        patAddress1.setRows(5);
        jScrollPane1.setViewportView(patAddress1);

        jLabel7.setText("Address Line 2");

        patAddress2.setColumns(20);
        patAddress2.setRows(5);
        jScrollPane2.setViewportView(patAddress2);

        jLabel8.setText("Phone");

        patSubmit.setText("Submit");
        patSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patSubmitActionPerformed(evt);
            }
        });

        patReset.setBackground(new java.awt.Color(255, 0, 0));
        patReset.setText("Reset");
        patReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patResetActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Doctor Name ");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton2.setText("Check Availability");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        nextPatientId.setEditable(false);
        nextPatientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextPatientIdActionPerformed(evt);
            }
        });

        jLabel5.setText("Patient Id");

        jLabel9.setText("Doc Id");

        doctorId.setEditable(false);

        jLabel10.setText("Available");

        docAvailable.setEditable(false);
        docAvailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docAvailableActionPerformed(evt);
            }
        });

        jLabel11.setText("Appoinment Details");

        jLabel12.setText("Appoinment Date");

        jLabel13.setText("Appoinment Time");

        appoinmentDay.setToolTipText("dd");

        appoinmentTime1.setToolTipText("hh");

        jLabel14.setText("Patient Details");

        nextAppoinmentID.setEditable(false);
        nextAppoinmentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextAppoinmentIDActionPerformed(evt);
            }
        });

        jLabel15.setText("Appoinment Id");

        appoinmentYear.setToolTipText("yyyy");

        appoinmentMonth.setToolTipText("mm");

        appoinmentTime2.setToolTipText("mm");

        jLabel16.setText("( DD - MM - YYYY )");

        jLabel17.setText("( HH:MM )");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(patName, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addGap(54, 54, 54))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nextPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nextAppoinmentID, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(patPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addGap(30, 30, 30)
                                                .addComponent(doctorId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel17)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(patAge, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(167, 167, 167)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel4)))
                                    .addComponent(patGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(patReset)
                                        .addGap(34, 34, 34)
                                        .addComponent(jButton1)
                                        .addGap(39, 39, 39)
                                        .addComponent(patSubmit))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(jLabel12))
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel13)
                                                    .addComponent(jLabel16))))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 52, Short.MAX_VALUE)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(docAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(appoinmentTime1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                                            .addComponent(appoinmentDay, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(appoinmentMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(8, 8, 8)
                                                .addComponent(appoinmentYear))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(appoinmentTime2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addGap(128, 128, 128))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nextPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(nextAppoinmentID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(doctorId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(docAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(appoinmentDay, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(appoinmentMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(appoinmentYear)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel16)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(appoinmentTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(appoinmentTime2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel17)))
                                .addGap(495, 495, 495))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel3)
                                .addGap(45, 45, 45)
                                .addComponent(jLabel6)
                                .addGap(73, 73, 73)
                                .addComponent(jLabel7)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(patName, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(patAge, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(patGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(patPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(patReset)
                            .addComponent(jButton1)
                            .addComponent(patSubmit))
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void patAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patAgeActionPerformed

    private void patSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patSubmitActionPerformed
        // TODO add your handling code here:
        PatientName = patName.getText();
        PatientAge =  Integer.parseInt( patAge.getText() );
        PatientGender = (String)patGender.getSelectedItem();
        PatientAddressLine1 = patAddress1.getText();
        PatientAddressLine2 = patAddress2.getText();
        PatientPhone = Integer.parseInt( patPhone.getText() );
        JDBCConnections j1 = new JDBCConnections();
        j1.createNewPatientRecord( PatientName,PatientAge,PatientGender,
                PatientAddressLine1, PatientAddressLine2, PatientPhone );
        Integer docId = j1.getDoctorId( this.jComboBox1.getSelectedItem().toString() );
        j1.createNewAppoinment( PatientName, docId );
        Integer appoinmentId = Integer.parseInt( this.nextAppoinmentID.getText() );
        String AppoinmentDay = this.appoinmentDay.getText() + "-"+ this.appoinmentMonth.getText()+ "-"+ this.appoinmentYear.getText();
        String AppoinmentTime = this.appoinmentTime1.getText() + ":"+ this.appoinmentTime2.getText();
        j1.addAppoinmentDetails( appoinmentId, AppoinmentDay, AppoinmentTime );
        JOptionPane.showMessageDialog(null,"Successfully Added","Add New Patient",JOptionPane.WARNING_MESSAGE);
        this.RefreshPane();
        this.RefresAvailableBox();
    }//GEN-LAST:event_patSubmitActionPerformed

    private void patResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patResetActionPerformed
        this.RefreshPane();
    }//GEN-LAST:event_patResetActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            AdminPanel a1 = new AdminPanel(j1);
            j1.removeAll();
            j1.add(a1);
            j1.repaint();
            j1.revalidate();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void patGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patGenderActionPerformed

    private void nextPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextPatientIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nextPatientIdActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        JDBCConnections j1 = new JDBCConnections();
        Integer docId = j1.getDoctorId( this.jComboBox1.getSelectedItem().toString() );
        doctorId.setText( docId.toString() );
        Integer docAvailableSeates = 15 - j1.getDoctorTotalAppoinments( docId );
        docAvailable.setText( docAvailableSeates.toString() );
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void docAvailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docAvailableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_docAvailableActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JDBCConnections j1 = new JDBCConnections();
        DoctorNames = j1.getDoctorNames();
        jComboBox1.removeAllItems();
        DefaultComboBoxModel DocModel = new DefaultComboBoxModel(DoctorNames);
        jComboBox1.setModel(DocModel );
        doctorId.setText( j1.getDoctorId( this.jComboBox1.getSelectedItem().toString() ).toString() );
        this.RefresAvailableBox();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void nextAppoinmentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextAppoinmentIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nextAppoinmentIDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField appoinmentDay;
    private javax.swing.JTextField appoinmentMonth;
    private javax.swing.JTextField appoinmentTime1;
    private javax.swing.JTextField appoinmentTime2;
    private javax.swing.JTextField appoinmentYear;
    private javax.swing.JTextField docAvailable;
    private javax.swing.JTextField doctorId;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    public javax.swing.JTextField nextAppoinmentID;
    private javax.swing.JTextField nextPatientId;
    private javax.swing.JTextArea patAddress1;
    private javax.swing.JTextArea patAddress2;
    private javax.swing.JTextField patAge;
    private javax.swing.JComboBox patGender;
    private javax.swing.JTextField patName;
    private javax.swing.JTextField patPhone;
    private javax.swing.JButton patReset;
    private javax.swing.JButton patSubmit;
    // End of variables declaration//GEN-END:variables
}
