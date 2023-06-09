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
public class ModSportFeeMain extends javax.swing.JFrame {

    /**
     * Creates new form AddCoachRecords
     */
    public ModSportFeeMain() {
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
        ModButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        Verifier = new javax.swing.JTextField();
        PreField = new javax.swing.JTextField();
        NewField = new javax.swing.JTextField();
        IDLabel1 = new javax.swing.JLabel();
        IDLabel2 = new javax.swing.JLabel();
        IDLabel3 = new javax.swing.JLabel();
        Title1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Real Champions Sport Academy System");

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

        IDLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        IDLabel1.setText("Enter Originial Fees");

        IDLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        IDLabel2.setText("Enter New Fees");

        IDLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        IDLabel3.setText("Enter Sport ID");

        Title1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        Title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title1.setText("Modify Sport Fees");
        Title1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Real Champions Sport Academy System");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Title1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Verifier, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(IDLabel2)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(ModButton, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(IDLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PreField, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(IDLabel3)
                            .addGap(161, 161, 161))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(NewField, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(74, 74, 74)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Title1)
                .addGap(51, 51, 51)
                .addComponent(IDLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(IDLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PreField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(IDLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NewField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Verifier, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ModButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(BackButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ModButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModButtonActionPerformed
        String SportID, OGFee, NewFee, line, line_2;
        BufferedReader br;
        StringBuffer sr;
        SportID = IDField.getText();
        OGFee = PreField.getText();
        NewFee = NewField.getText();
        if(SportID.isEmpty() || OGFee.isEmpty() || NewFee.isEmpty()){
            Verifier.setText("This Field is Mandatory");
        }
        else{
            try {
                Scanner file = new Scanner(new File("SportRecords.txt"));
                while(file.hasNextLine()){
                    String lineFromFile = file.nextLine();
                    if (lineFromFile.contains("ID: "+SportID+" // Name:") && (lineFromFile.contains("Fee: "+OGFee+" //"))){
                        line_2 = lineFromFile;
                        lineFromFile = lineFromFile.replace(OGFee,NewFee);
                        br = new BufferedReader(new FileReader("SportRecords.txt"));
                        sr = new StringBuffer();
                        while ((line = br.readLine()) != null) {
                            line = line.replace(line_2,lineFromFile);
                            sr.append(line);
                            sr.append('\n');
                        }
                        br.close();
                        FileOutputStream fileOut = new FileOutputStream("SportRecords.txt");
                        fileOut.write(sr.toString().getBytes());
                        fileOut.close();
                        Verifier.setText("Fees Updated Successfully");
                        IDField.setText("");
                        PreField.setText("");
                        NewField.setText("");
                        break;
                    }
                    else{
                        Verifier.setText("Sport ID or Original Fees are incorrect.");
                    }
                }
               
            }
            
            catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error:Sport Records Unavailable.\nAdd Sport Records First.", "Error!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_ModButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        this.setVisible(false);
        ModSportsMain a = new ModSportsMain();
        a.setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void VerifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerifierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VerifierActionPerformed

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
                new ModSportFeeMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JTextField IDField;
    private javax.swing.JLabel IDLabel1;
    private javax.swing.JLabel IDLabel2;
    private javax.swing.JLabel IDLabel3;
    private javax.swing.JButton ModButton;
    private javax.swing.JTextField NewField;
    private javax.swing.JTextField PreField;
    private javax.swing.JLabel Title1;
    private javax.swing.JTextField Verifier;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
