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

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author router
 */
public class WelcomePanel extends stdpanel {

    /**
     * Creates new form AdminPanel
     */  
    public WelcomePanel(JPanel j) {
        super(j);
        initComponents(); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        loginas = new javax.swing.JComboBox();

        jButton3.setText("Login");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Login As");

        loginas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin", "Doctor", "Receptionist", "Pharmacist" }));
        loginas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(227, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if( loginas.getSelectedItem() == "Admin" ) {
            AdminPanel a1 = new AdminPanel(j1);
            j1.removeAll();
            j1.add(a1);
            j1.repaint();
            j1.revalidate();
        }
        if( loginas.getSelectedItem() == "Receptionist" ) {
            ReceptionPanel a1 = new ReceptionPanel(j1);
            j1.removeAll();
            j1.add(a1);
            j1.repaint();
            j1.revalidate();
        }
        if( loginas.getSelectedItem() == "Doctor" ) {
            DoctorView d1 = new DoctorView(j1);
            j1.removeAll();
            j1.add(d1);
            j1.repaint();
            j1.revalidate();
        }
        if( loginas.getSelectedItem() == "Pharmacist" ) {
            PharmacistPanel p1 = new PharmacistPanel(j1);
            j1.removeAll();
            j1.add(p1);
            j1.repaint();
            j1.revalidate();
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void loginasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox loginas;
    // End of variables declaration//GEN-END:variables
}
