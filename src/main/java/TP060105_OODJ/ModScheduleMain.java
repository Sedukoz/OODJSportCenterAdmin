/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP060105_OODJ;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;



/**
 *
 * @author Ahmed
 */
public class ModScheduleMain extends javax.swing.JFrame {

    /**
     * Creates new form AddCoachRecords
     */
    public ModScheduleMain() {
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

        IDField = new javax.swing.JTextField();
        IDLabel = new javax.swing.JLabel();
        ModButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        Verifier = new javax.swing.JTextField();
        NewSchLabel = new javax.swing.JLabel();
        NewSchField = new javax.swing.JFormattedTextField();
        OldSchLabel = new javax.swing.JLabel();
        OldSchField = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        Title1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Real Champions Sport Academy System");

        IDLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        IDLabel.setText("Enter Schedule ID:");

        ModButton.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        ModButton.setText("Confirm");
        ModButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModButtonActionPerformed(evt);
            }
        });

        BackButton.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        Verifier.setBackground(new java.awt.Color(204, 255, 255));
        Verifier.setBorder(null);
        Verifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerifierActionPerformed(evt);
            }
        });

        NewSchLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        NewSchLabel.setText("New Schedule Date");

        NewSchField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        NewSchField.setText("DD/MM/YYYY");
        NewSchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewSchFieldActionPerformed(evt);
            }
        });

        OldSchLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        OldSchLabel.setText("Original Schedule Date:");

        OldSchField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        OldSchField.setText("DD/MM/YYYY");

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Real Champions Sport Academy System");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Title1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        Title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title1.setText("Modify Schedule Dates:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Verifier)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Title1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(OldSchLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NewSchField, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(OldSchField, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(NewSchLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(IDLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(ModButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(Title1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(IDLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(OldSchLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(OldSchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(NewSchLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NewSchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(Verifier, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ModButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(BackButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ModButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModButtonActionPerformed
        String SchID, OGSch, NewSch, line, line_2;
        BufferedReader br;
        StringBuffer sr;
        SchID = IDField.getText();
        OGSch = OldSchField.getText();
        NewSch = NewSchField.getText();
        if(SchID.isEmpty() || OGSch.isEmpty() || NewSch.isEmpty()){
            Verifier.setText("This Field is Mandatory");
        }
        else{
            try {
                Scanner file = new Scanner(new File("ScheduleRecords.txt"));
                while(file.hasNextLine()){
                    String lineFromFile = file.nextLine();
                    if (lineFromFile.contains("ID: "+SchID+" | Schedule: "+OGSch)){
                        line_2 = lineFromFile;
                        lineFromFile = lineFromFile.replace(OGSch,NewSch);
                        br = new BufferedReader(new FileReader("ScheduleRecords.txt"));
                        sr = new StringBuffer();
                        while ((line = br.readLine()) != null) {
                            line = line.replace(line_2,lineFromFile);
                            sr.append(line);
                            sr.append('\n');
                        }
                        br.close();
                        FileOutputStream fileOut = new FileOutputStream("ScheduleRecords.txt");
                        fileOut.write(sr.toString().getBytes());
                        fileOut.close();
                        Verifier.setText("Schedule Updated Successfully.");
                        IDField.setText("");
                        OldSchField.setText("DD/MM/YYYY");
                        NewSchField.setText("DD/MM/YYYY");
                        break;
                    }
                    else{
                        Verifier.setText("Invalid Schedule ID or Original Date");
                    }
                }
               
            }
            
            catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error:Schedule Records Unavailable.\nAdd Schedule Records First.", "Error!", JOptionPane.ERROR_MESSAGE);
            }
        } 
    }//GEN-LAST:event_ModButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        this.setVisible(false);
        AdminModifyMain a = new AdminModifyMain();
        a.setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void VerifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerifierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VerifierActionPerformed

    private void NewSchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewSchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewSchFieldActionPerformed

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
            java.util.logging.Logger.getLogger(AddCoachRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCoachRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCoachRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCoachRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModScheduleMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JTextField IDField;
    private javax.swing.JLabel IDLabel;
    private javax.swing.JButton ModButton;
    private javax.swing.JFormattedTextField NewSchField;
    private javax.swing.JLabel NewSchLabel;
    private javax.swing.JFormattedTextField OldSchField;
    private javax.swing.JLabel OldSchLabel;
    private javax.swing.JLabel Title1;
    private javax.swing.JTextField Verifier;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
