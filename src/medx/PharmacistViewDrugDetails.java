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

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static medx.ViewPatientDetailsPanel.queryResult;

/**
 *
 * @author router
 */
public class PharmacistViewDrugDetails extends stdpanel {
    /**
     * Creates new form NewDoctorPanel
     */
    public PharmacistViewDrugDetails( JPanel j, ResultSet rs ) {
        super( j );
        initComponents();
        JDBCConnections j1 = new JDBCConnections();
        this.nextDrugId.setText( j1.getNextDrugId().toString() );
        initComponents();
        try {
            nextDrugId.setText( rs.getString("dg_id") );
            drugName.setText( rs.getString("dg_name") );
            drugMan.setText( rs.getString("dg_manufacturer") );
            drugRate.setText( rs.getString("dg_rate"));
            drugManDate.setText( rs.getString( "dg_manufacture_date") );
            drugExpDate.setText(  rs.getString( "dg_expiry"));  
            drugInitialAvail.setText( rs.getString( "dg_inital_avail"));
            drugVendor.setText( rs.getString( "dg_vendro"));
        } catch ( Exception e ) {
            e.printStackTrace();
        }
    }
    public void refreshAction() {
        this.drugName.setText("");
        this.drugMan.setText("");
        this.drugExpDate.setText("");
        this.drugManDate.setText("");
        this.drugInitialAvail.setText("");
        this.drugVendor.setText("");
        this.drugRate.setText("");
        JDBCConnections j1 = new JDBCConnections();
        this.nextDrugId.setText( j1.getNextDrugId().toString() );
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
        drugName = new javax.swing.JTextField();
        drugMan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        drugManDate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        drugExpDate = new javax.swing.JTextField();
        docSubmit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        nextDrugId = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        drugRate = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        drugInitialAvail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        drugVendor = new javax.swing.JTextField();

        jLabel1.setText("Drug Name ");

        jLabel2.setText("Manufacturer");

        jLabel3.setText("Rate");

        drugName.setEditable(false);

        drugMan.setEditable(false);
        drugMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugManActionPerformed(evt);
            }
        });

        jLabel4.setText("Manufacture Date");

        drugManDate.setEditable(false);
        drugManDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugManDateActionPerformed(evt);
            }
        });

        jLabel5.setText("Expiry Date");

        drugExpDate.setEditable(false);
        drugExpDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugExpDateActionPerformed(evt);
            }
        });

        docSubmit.setBackground(new java.awt.Color(255, 0, 51));
        docSubmit.setText("Delete");
        docSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docSubmitActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        nextDrugId.setEditable(false);

        jLabel9.setText("Drug Id");

        drugRate.setEditable(false);
        drugRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugRateActionPerformed(evt);
            }
        });

        jLabel10.setText("Initial Availability");

        drugInitialAvail.setEditable(false);
        drugInitialAvail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugInitialAvailActionPerformed(evt);
            }
        });

        jLabel11.setText("Vendor");

        drugVendor.setEditable(false);
        drugVendor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugVendorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(drugManDate, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(drugMan, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel5))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nextDrugId, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(drugName, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(drugRate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(drugExpDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(drugInitialAvail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(docSubmit)
                            .addGap(18, 18, 18)
                            .addComponent(jButton1))
                        .addComponent(drugVendor, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextDrugId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(drugName, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(drugMan, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(drugRate, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(drugManDate, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(drugExpDate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(drugInitialAvail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(drugVendor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(docSubmit)
                    .addComponent(jButton1))
                .addContainerGap(44, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void drugManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugManActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drugManActionPerformed

    private void docSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docSubmitActionPerformed
        // TODO add your handling code here:
        JDBCConnections jdbcConn = new JDBCConnections();
        jdbcConn.DeleteDrugRecord( Integer.parseInt( this.nextDrugId.getText() ) );
        WelcomePanel w1 = new WelcomePanel(j1);
        j1.removeAll();
        j1.add(w1);
        j1.repaint();
        j1.revalidate();
    }//GEN-LAST:event_docSubmitActionPerformed

    private void drugManDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugManDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drugManDateActionPerformed

    private void drugExpDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugExpDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drugExpDateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            WelcomePanel a1 = new WelcomePanel(j1);
            j1.removeAll();
            j1.add(a1);
            j1.repaint();
            j1.revalidate();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void drugRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drugRateActionPerformed

    private void drugInitialAvailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugInitialAvailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drugInitialAvailActionPerformed

    private void drugVendorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugVendorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drugVendorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton docSubmit;
    private javax.swing.JTextField drugExpDate;
    private javax.swing.JTextField drugInitialAvail;
    private javax.swing.JTextField drugMan;
    private javax.swing.JTextField drugManDate;
    private javax.swing.JTextField drugName;
    private javax.swing.JTextField drugRate;
    private javax.swing.JTextField drugVendor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nextDrugId;
    // End of variables declaration//GEN-END:variables
}