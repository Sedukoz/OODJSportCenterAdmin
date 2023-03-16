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
public class ModCoachPhoneMain extends javax.swing.JFrame {

    /**
     * Creates new form AddCoachRecords
     */
    public ModCoachPhoneMain() {
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
        NewPhoneField = new javax.swing.JTextField();
        OldPhoneField = new javax.swing.JTextField();
        Title1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        IDLabel1 = new javax.swing.JLabel();
        OldAddLabel = new javax.swing.JLabel();
        OldAddLabel1 = new javax.swing.JLabel();

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

        Title1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        Title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title1.setText("Modify Coach Contact Number");
        Title1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Real Champions Sport Academy System");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        IDLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        IDLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IDLabel1.setText("Enter Coach ID");

        OldAddLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        OldAddLabel.setText("Original Contact Number");

        OldAddLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        OldAddLabel1.setText("New Contact Number");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(OldPhoneField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NewPhoneField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IDField, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(21, 21, 21))
            .addComponent(Verifier, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(Title1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(IDLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(OldAddLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(OldAddLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(ModButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Title1)
                .addGap(41, 41, 41)
                .addComponent(IDLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(OldAddLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(OldPhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(OldAddLabel1)
                .addGap(11, 11, 11)
                .addComponent(NewPhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(Verifier, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(ModButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BackButton)
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ModButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModButtonActionPerformed
        String ID, OGContact, NewContact, line, line_2;
        BufferedReader br;
        StringBuffer sr;
        ID = IDField.getText();
        OGContact = OldPhoneField.getText();
        NewContact = NewPhoneField.getText();
        if(OGContact.isEmpty() || NewContact.isEmpty()){
            Verifier.setText("This Field is mandatory");
        }
        else{
            try {
                Scanner file = new Scanner(new File("CoachRecords.txt"));
                while(file.hasNextLine()){
                    String lineFromFile = file.nextLine();
                    if (lineFromFile.contains(" // Phone: "+OGContact+" // Sport:")&&(lineFromFile.contains("ID: "+ID+" // Name:"))){
                        line_2 = lineFromFile;
                        lineFromFile = lineFromFile.replace(OGContact,NewContact);
                        br = new BufferedReader(new FileReader("CoachRecords.txt"));
                        sr = new StringBuffer();
                        while ((line = br.readLine()) != null) {
                            line = line.replace(line_2,lineFromFile);
                            sr.append(line);
                            sr.append('\n');
                        }
                        br.close();
                        FileOutputStream fileOut = new FileOutputStream("CoachRecords.txt");
                        fileOut.write(sr.toString().getBytes());
                        fileOut.close();
                        Verifier.setText("Contact Number Updated Successfully");
                        IDField.setText("");
                        OldPhoneField.setText("");
                        NewPhoneField.setText("");
                        break;
                    }
                    else{
                        Verifier.setText("Coach ID or Original Number are incorrect");
                    }
                }
               
            }
            
            catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error:Student Records Unavailable.\nAdd Student Records First.", "Error!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_ModButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        this.setVisible(false);
        ModCoachMain a = new ModCoachMain();
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
                new ModCoachPhoneMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JTextField IDField;
    private javax.swing.JLabel IDLabel1;
    private javax.swing.JButton ModButton;
    private javax.swing.JTextField NewPhoneField;
    private javax.swing.JLabel OldAddLabel;
    private javax.swing.JLabel OldAddLabel1;
    private javax.swing.JTextField OldPhoneField;
    private javax.swing.JLabel Title1;
    private javax.swing.JTextField Verifier;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
