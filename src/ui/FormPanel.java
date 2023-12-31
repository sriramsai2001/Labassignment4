/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import model.Patient;



public class FormPanel extends javax.swing.JPanel {

        JFileChooser chooser;
    BufferedImage img;
    String filename;
    File file ; 
    JPanel bottomPanel;
    
    public FormPanel(JPanel bottomPanel){
    this.bottomPanel =bottomPanel;
    initComponents();
    }
    /**
     * Creates new form FormPanel
     */
    public FormPanel() {
        initComponents();
    }
         public Patient getFieldsData () {
        String firstName = firstnameTextField.getText();
        String lastName = lastnameTextField.getText();
        String age = ageTextField.getText(); 
        String email = emailTextField.getText();
        String message = messageTextField.getText();
        String type = jComboBox1.getSelectedItem().toString();
        String gender = "";
        String date = null;
        ImageIcon photo = null;
        
         if(genderGroup.getSelection() != null){
           gender = genderGroup.getSelection().getActionCommand();
        }
        
        if(dateChooser.getDate() != null){
            date = dateChooser.getDate().toString(); 
        }
        
        
        
          try {
            if(file != null){
              img=ImageIO.read(file);
               photo = new ImageIcon(img); 
            }
            
            Patient user = new Patient(); 
            user.setAge(age);
            user.setFirstname(firstName);
            user.setLastname(lastName);
            user.setEmail(email);
            user.setType(type);
            user.setGender(gender);
            user.setMessage(message);
            user.setPhoto(photo);
            user.setDate(date);
            
            
            return user;
            
            

            }  catch(IOException e2){
            return null;
            }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        genderGroup = new javax.swing.ButtonGroup();
        MainPanel = new javax.swing.JPanel();
        lableName = new javax.swing.JLabel();
        firstnameLable = new javax.swing.JLabel();
        firstnameTextField = new javax.swing.JTextField();
        lastnameLabel = new javax.swing.JLabel();
        lastnameTextField = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        ageTextField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        messageLabel = new javax.swing.JLabel();
        messageTextField = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        targetImage = new javax.swing.JLabel();
        imageLabel = new javax.swing.JLabel();
        imageButton = new javax.swing.JButton();
        genderLabel = new javax.swing.JLabel();
        maleRadio = new javax.swing.JRadioButton();
        femaleRadio = new javax.swing.JRadioButton();
        otherRadio = new javax.swing.JRadioButton();
        typeLable = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        dateLabel = new javax.swing.JLabel();
        dateChooser = new com.toedter.calendar.JDateChooser();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        MainPanel.setBackground(new java.awt.Color(51, 255, 51));

        lableName.setBackground(new java.awt.Color(51, 255, 51));
        lableName.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lableName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lableName.setText("Patient Registration Form");

        firstnameLable.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        firstnameLable.setText("First Name:");

        firstnameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameTextFieldActionPerformed(evt);
            }
        });

        lastnameLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lastnameLabel.setText("Last Name:");

        lastnameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameTextFieldActionPerformed(evt);
            }
        });

        ageLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        ageLabel.setText("Age:");

        ageTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTextFieldActionPerformed(evt);
            }
        });

        emailLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        emailLabel.setText("Email:");

        messageLabel.setText("Message:");

        messageTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageTextFieldActionPerformed(evt);
            }
        });

        submitButton.setText("SUBMIT");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        imageLabel.setText(" Photo:");

        imageButton.setText("Select");
        imageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageButtonActionPerformed(evt);
            }
        });

        genderLabel.setText("Gender:");

        genderGroup.add(maleRadio);
        maleRadio.setText("Male");
        maleRadio.setActionCommand("MALE");
        maleRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRadioActionPerformed(evt);
            }
        });

        genderGroup.add(femaleRadio);
        femaleRadio.setText("Female");
        femaleRadio.setActionCommand("FemaleUser");

        genderGroup.add(otherRadio);
        otherRadio.setText("Others");
        otherRadio.setActionCommand("OthersUser");

        typeLable.setText("Patient type:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "chronic patient", "new patient", " ", " " }));
        jComboBox1.setSelectedIndex(-1);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        dateLabel.setText("Date:");

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(targetImage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                        .addComponent(lableName, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MainPanelLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(submitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(firstnameLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lastnameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(messageLabel)
                                    .addComponent(typeLable, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(imageLabel)
                                    .addComponent(dateLabel))
                                .addGap(64, 64, 64)
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(firstnameTextField)
                                    .addComponent(lastnameTextField)
                                    .addComponent(emailTextField)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(messageTextField)
                                    .addGroup(MainPanelLayout.createSequentialGroup()
                                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(imageButton)
                                            .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(femaleRadio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(maleRadio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(ageTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
                                            .addComponent(otherRadio))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(dateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(159, 159, 159))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lableName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(targetImage))
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstnameLable)
                    .addComponent(firstnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastnameLabel)
                    .addComponent(lastnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLabel)
                    .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(genderLabel)
                    .addComponent(maleRadio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(femaleRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(otherRadio)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(typeLable))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dateChooser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(messageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(messageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imageLabel)
                    .addComponent(imageButton))
                .addGap(18, 18, 18)
                .addComponent(submitButton)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void firstnameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameTextFieldActionPerformed

    private void lastnameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameTextFieldActionPerformed

    private void ageTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTextFieldActionPerformed

    private void messageTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_messageTextFieldActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
     
        
         String firstname       = firstnameTextField.getText();
        String lastname     = lastnameTextField.getText();
         String age       = ageTextField.getText();
        String email     = emailTextField.getText();
        String message   = messageTextField.getText();
         String type = jComboBox1.getSelectedItem().toString();
        String gender = "";
        String date = null;
        
        if(genderGroup.getSelection() != null){
           gender = genderGroup.getSelection().getActionCommand();
        }
        
        if(dateChooser.getDate() != null){
            date = dateChooser.getDate().toString(); 
        }

        
       
        
   Pattern pattern = Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}");
            Matcher isValidEmail = pattern.matcher(email);
           
           
           if(firstname.length() == 0) {
            JOptionPane.showMessageDialog(this, "Please enter a valid First Name", "Validation Error", HEIGHT);
        }else if (lastname.length() == 0) {
            JOptionPane.showMessageDialog(this, "Please enter a valid Last Name", "Validation Error", HEIGHT);
        } else if(age.length() == 0 || !age.chars().allMatch(Character::isDigit) ) {
            JOptionPane.showMessageDialog(this, "Please enter a valid Age", "Validation Error", HEIGHT);
        } else if(email.length() == 0 || !isValidEmail.matches()) {
            JOptionPane.showMessageDialog(this, "Please enter a valid Email", "Validation Error", HEIGHT);
        } else if (message.length() == 0) {
            JOptionPane.showMessageDialog(this, "Message Should not empty", "Validation Error", HEIGHT);
        
        } 
         else if (file == null ){
         JOptionPane.showMessageDialog(this, "Please select the profile image", "Validation Error", HEIGHT);
        } else {
        
           
             try {
            img=ImageIO.read(file);
            ImageIcon photo = new ImageIcon(img); 
            
            Patient user = new Patient(); 
            
            user.setFirstname(firstname);
            user.setLastname(lastname);
            user.setAge(age);
            user.setEmail(email);
            user.setType(type);
            user.setGender(gender);
            user.setMessage(message);
            user.setPhoto(photo);
            user.setDate(date);
            
            
            ViewPanel newViewPanel = new ViewPanel(user); 
            bottomPanel.add(newViewPanel);

            CardLayout layout = (CardLayout) bottomPanel.getLayout(); 
            layout.next(bottomPanel); 
            
            

            }  catch(IOException e2){}
             
         }   
    }//GEN-LAST:event_submitButtonActionPerformed

    
    
    private void imageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageButtonActionPerformed
        chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        file = chooser.getSelectedFile();

        try {
            img=ImageIO.read(file);
            ImageIcon icon = new ImageIcon(img); // ADDED
            targetImage.setIcon(icon);
            targetImage.setText("");

            targetImage.setPreferredSize(new Dimension(icon.getIconWidth(),icon.getIconHeight())); // ADDED

            targetImage.revalidate(); // ADDED
            targetImage.repaint(); // ADDED

        }
        catch(IOException e1) {
        }        // TODO add your handling code here:
    }//GEN-LAST:event_imageButtonActionPerformed

    private void maleRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleRadioActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
       try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }   //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageTextField;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JRadioButton femaleRadio;
    private javax.swing.JLabel firstnameLable;
    private javax.swing.JTextField firstnameTextField;
    private javax.swing.ButtonGroup genderGroup;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JButton imageButton;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lableName;
    private javax.swing.JLabel lastnameLabel;
    private javax.swing.JTextField lastnameTextField;
    private javax.swing.JRadioButton maleRadio;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JTextField messageTextField;
    private javax.swing.JRadioButton otherRadio;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel targetImage;
    private javax.swing.JLabel typeLable;
    // End of variables declaration//GEN-END:variables
}
