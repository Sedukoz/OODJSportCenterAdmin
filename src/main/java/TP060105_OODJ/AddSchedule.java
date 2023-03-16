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
public class AddSchedule extends javax.swing.JFrame {

    /**
     * Creates new form AddCoachRecords
     */
    public AddSchedule() {
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

        Title = new javax.swing.JLabel();
        StudentField = new javax.swing.JTextField();
        StudentLabel = new javax.swing.JLabel();
        RegButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        Verifier = new javax.swing.JTextField();
        ScheduleLabel = new javax.swing.JLabel();
        ScheduleField = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Real Champions Sport Academy System");

        Title.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        Title.setText("Add Sport Schedule");

        StudentLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        StudentLabel.setText("Student ID:");

        RegButton.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        RegButton.setText("Confirm");
        RegButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegButtonActionPerformed(evt);
            }
        });

        BackButton.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        Verifier.setBackground(new java.awt.Color(204, 204, 255));
        Verifier.setBorder(null);
        Verifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerifierActionPerformed(evt);
            }
        });

        ScheduleLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        ScheduleLabel.setText("Schedule Date:");

        ScheduleField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        ScheduleField.setText("DD/MM/YYYY");

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
            .addComponent(Verifier)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(StudentLabel)
                                    .addComponent(StudentField, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ScheduleLabel)
                                    .addComponent(ScheduleField, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 66, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(RegButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(Title)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(StudentLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StudentField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(ScheduleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScheduleField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Verifier, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RegButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(BackButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegButtonActionPerformed
        String Student, Schedule;
        int SportCenterID = 301, flag = 0;
        Student = StudentField.getText();
        Schedule = ScheduleField.getText();
        if (Student.isEmpty() || Schedule.isEmpty()){
            Verifier.setText("This field is Mandatory.");
        }
        else {
            try {
                Scanner file = new Scanner(new File("StudentRecords.txt"));
                while(file.hasNextLine()){
                    final String lineFromFile = file.nextLine();
                        if(!lineFromFile.contains("ID: "+Student)){
                            flag = 1;
                        }
                        else if(lineFromFile.contains("ID: "+Student)){
                            flag = 0;
                            break;
                        }
                }
                if (flag == 0){
                    Schedule s = new Schedule(SportCenterID,Schedule,Student);
                    s.WritetoFile();
                    Verifier.setText(Student+ "Succesfully Registered. "+"ID of SC" +s.getID());
                    StudentField.setText("");
                    ScheduleField.setText("DD/MM/YYYY");
                    }
                else if (flag == 1){
                    Verifier.setText("Invalid Student ID");
                }
            } 
            catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(this, "Error:Student Records Unavailable.\nAdd Student Records First.", "Error!", JOptionPane.ERROR_MESSAGE);
            }
        }
                                                          
    }//GEN-LAST:event_RegButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        this.setVisible(false);
        AddRecScreen a = new AddRecScreen();
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
            @Override
            public void run() {
                new AddSchedule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton RegButton;
    private javax.swing.JFormattedTextField ScheduleField;
    private javax.swing.JLabel ScheduleLabel;
    private javax.swing.JTextField StudentField;
    private javax.swing.JLabel StudentLabel;
    private javax.swing.JLabel Title;
    private javax.swing.JTextField Verifier;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
