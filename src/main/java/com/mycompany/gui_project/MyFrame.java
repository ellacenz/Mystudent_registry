/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gui_project;

import java.awt.Color;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author ellac
 */
public class MyFrame extends javax.swing.JFrame {

    /**
     * Creates new form MyFrame
     */
    private StudentDBManager studentDBManager;
    private List<Student> studentList;
    private boolean isUpdate = false;

    public MyFrame() throws SQLException {
        studentDBManager = new StudentDBManager();
        studentList = studentDBManager.getStudents();
        initComponents();
        studentComboBox.setVisible(false);

//         
//         String[] studentNames = new String[studentList.size()];
//         for (int i=0; i <studentList.size(); i++){
//            studentNames[i] = studentList.get(i).getFirstName() + " " + studentList.get(i).getLastName();
//         }
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
        genderButtonGroup = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        newEntryRadioBox = new javax.swing.JRadioButton();
        submit = new javax.swing.JButton();
        lNameTextbox = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descContentTextArea = new javax.swing.JTextArea();
        lastName = new javax.swing.JLabel();
        firstName = new javax.swing.JLabel();
        fNameTextbox = new javax.swing.JTextField();
        femaleRadiobox = new javax.swing.JRadioButton();
        mailRadiobox = new javax.swing.JRadioButton();
        descriptionLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        messageLabel = new javax.swing.JLabel();
        updateRadioButton = new javax.swing.JRadioButton();
        studentComboBox = new javax.swing.JComboBox<>();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(newEntryRadioBox);
        newEntryRadioBox.setSelected(true);
        newEntryRadioBox.setText("New Entry");
        newEntryRadioBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newEntryRadioBoxActionPerformed(evt);
            }
        });

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        lNameTextbox.setToolTipText("Enter your Last Name");

        descContentTextArea.setColumns(20);
        descContentTextArea.setRows(5);
        descContentTextArea.setToolTipText("Tell us something fun about you.");
        jScrollPane1.setViewportView(descContentTextArea);

        lastName.setText("Last Name");

        firstName.setText("FirstName");

        fNameTextbox.setToolTipText("Enter your First Name");

        genderButtonGroup.add(femaleRadiobox);
        femaleRadiobox.setText("Female");
        femaleRadiobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleRadioboxActionPerformed(evt);
            }
        });

        genderButtonGroup.add(mailRadiobox);
        mailRadiobox.setText("Male");
        mailRadiobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailRadioboxActionPerformed(evt);
            }
        });

        descriptionLabel.setText("Description");

        genderLabel.setText("Gender");

        messageLabel.setBackground(new java.awt.Color(255, 255, 255));
        messageLabel.setFont(new java.awt.Font("Trebuchet MS", 3, 11)); // NOI18N
        messageLabel.setForeground(new java.awt.Color(51, 204, 0));
        messageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        messageLabel.setOpaque(true);

        buttonGroup1.add(updateRadioButton);
        updateRadioButton.setText("Update");
        updateRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateRadioButtonActionPerformed(evt);
            }
        });

        studentComboBox = new  JComboBox(studentList.toArray()) ;
        studentComboBox.setMaximumRowCount(20);
        studentComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                studentComboBoxItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastName)
                            .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lNameTextbox, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                .addComponent(fNameTextbox, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(femaleRadiobox, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(mailRadiobox, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(172, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(messageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(newEntryRadioBox)
                .addGap(18, 18, 18)
                .addComponent(updateRadioButton)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(studentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newEntryRadioBox, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(studentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(messageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstName)
                    .addComponent(fNameTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastName)
                    .addComponent(lNameTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descriptionLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(femaleRadiobox)
                    .addComponent(mailRadiobox)
                    .addComponent(genderLabel))
                .addGap(28, 28, 28)
                .addComponent(submit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void femaleRadioboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleRadioboxActionPerformed
        // TODO add your handling code here:
        //String gender = "Female";
    }//GEN-LAST:event_femaleRadioboxActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        String firstname = fNameTextbox.getText();
        String lastname = lNameTextbox.getText();
        String description = descContentTextArea.getText();
        String gender = mailRadiobox.isSelected() ? mailRadiobox.getText() : femaleRadiobox.getText();

        Student student = new Student(firstname, lastname, description, gender);

        if (student.isDetailsComplete()) {
            try {
                if (isUpdate) {
                    Student selectedStudent = (Student) studentComboBox.getSelectedItem();
                    student.setId(selectedStudent.getId());
                    studentDBManager.saveStudent(student);
                }
                else{
                    studentDBManager.saveStudent(student);
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            messageLabel.setForeground(Color.GREEN);
            messageLabel.setText("Thank you " + firstname + " your details have been captured");
            if (!isUpdate) {
                clearEntries();
            }
        } else {
            messageLabel.setText("Please complete the form");
            messageLabel.setForeground(Color.red);
        }

        // JOptionPane.showInternalMessageDialog(null, lNameTextbox.getText() + " " + fNameTextbox.getText());
    }//GEN-LAST:event_submitActionPerformed

    private void mailRadioboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailRadioboxActionPerformed
        // TODO add your handling code here:
        // String gender = "Male";
    }//GEN-LAST:event_mailRadioboxActionPerformed
    private void clearEntries() {
        fNameTextbox.setText("");
        lNameTextbox.setText("");
        descContentTextArea.setText("");
    }

    private void updateEntries(Student student) {
        fNameTextbox.setText(student.getFirstName());
        lNameTextbox.setText(student.getLastName());
        descContentTextArea.setText(student.getDescription());

        if (student.getGender().equals("Male")) {
            mailRadiobox.setSelected(true);
        } else {
            femaleRadiobox.setSelected(true);
        }
    }

    private void updateRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateRadioButtonActionPerformed
        if (updateRadioButton.isSelected()) {
            Student student = (Student) studentComboBox.getSelectedItem();
            updateEntries(student);
            isUpdate = true;
            studentComboBox.setVisible(true);
        }
    }//GEN-LAST:event_updateRadioButtonActionPerformed

    private void newEntryRadioBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newEntryRadioBoxActionPerformed
        // TODO add your handling code here:
        if (newEntryRadioBox.isSelected()) {
            isUpdate = false;
            clearEntries();
            studentComboBox.setVisible(false);
        }
    }//GEN-LAST:event_newEntryRadioBoxActionPerformed

    private void studentComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_studentComboBoxItemStateChanged
        Student student = (Student) studentComboBox.getSelectedItem();
        updateEntries(student);
    }//GEN-LAST:event_studentComboBoxItemStateChanged

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
            java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MyFrame().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(MyFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextArea descContentTextArea;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JTextField fNameTextbox;
    private javax.swing.JRadioButton femaleRadiobox;
    private javax.swing.JLabel firstName;
    private javax.swing.ButtonGroup genderButtonGroup;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lNameTextbox;
    private javax.swing.JLabel lastName;
    private javax.swing.JRadioButton mailRadiobox;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JRadioButton newEntryRadioBox;
    private javax.swing.JComboBox<String> studentComboBox;
    private javax.swing.JButton submit;
    private javax.swing.JRadioButton updateRadioButton;
    // End of variables declaration//GEN-END:variables
}
