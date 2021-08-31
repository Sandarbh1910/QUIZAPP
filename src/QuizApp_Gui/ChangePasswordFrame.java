/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuizApp_Gui;

import QuizApp_DAO.UserDAO;
import QuizApp_Pojo.User;
import QuizApp_Pojo.UserProfile;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Sandarbh Taran
 */
public class ChangePasswordFrame extends javax.swing.JFrame {

    /**
     * Creates new form ChangePasswordFrame
     */
    Color oldcolor;
    public ChangePasswordFrame() {
        initComponents();
         lblDisplayUsername.setText("HELLO "+UserProfile.getUsername());
         oldcolor=lblLogout.getForeground();
          this.setTitle("QUIZAPP");
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
        buttonGroup1 = new javax.swing.ButtonGroup();
        ChangePasswordPanel = new javax.swing.JPanel();
        lblLogout = new javax.swing.JLabel();
        lblChangePasswordFrame = new javax.swing.JLabel();
        LoginInnerPanel = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        lblNewPassword = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtNewPassword = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        btnChangePassword = new javax.swing.JButton();
        lblRetypePassword = new javax.swing.JLabel();
        txtRetypePassword = new javax.swing.JTextField();
        rbAdmin = new javax.swing.JRadioButton();
        rbStudent = new javax.swing.JRadioButton();
        lblDisplayUsername = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        ChangePasswordPanel.setBackground(new java.awt.Color(0, 0, 0));

        lblLogout.setBackground(new java.awt.Color(0, 0, 0));
        lblLogout.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(255, 153, 51));
        lblLogout.setText("Logout");
        lblLogout.setOpaque(true);
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogoutMouseExited(evt);
            }
        });

        lblChangePasswordFrame.setBackground(new java.awt.Color(204, 255, 204));
        lblChangePasswordFrame.setFont(new java.awt.Font("Cambria", 3, 48)); // NOI18N
        lblChangePasswordFrame.setForeground(new java.awt.Color(0, 255, 0));
        lblChangePasswordFrame.setText("CHANGE PASSWORD");

        LoginInnerPanel.setBackground(new java.awt.Color(0, 0, 0));
        LoginInnerPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Enter Credentials", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 3, 36), new java.awt.Color(0, 102, 102))); // NOI18N

        lblUsername.setBackground(new java.awt.Color(0, 255, 204));
        lblUsername.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 153, 51));
        lblUsername.setText("USERNAME");

        lblNewPassword.setBackground(new java.awt.Color(0, 255, 204));
        lblNewPassword.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        lblNewPassword.setForeground(new java.awt.Color(255, 153, 51));
        lblNewPassword.setText("NEW PASSWORD");

        txtUsername.setBackground(new java.awt.Color(204, 204, 204));
        txtUsername.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N

        txtNewPassword.setBackground(new java.awt.Color(204, 204, 204));
        txtNewPassword.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N

        btnCancel.setBackground(new java.awt.Color(0, 0, 0));
        btnCancel.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 153, 51));
        btnCancel.setText("CANCEL");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnChangePassword.setBackground(new java.awt.Color(0, 0, 0));
        btnChangePassword.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
        btnChangePassword.setForeground(new java.awt.Color(255, 153, 51));
        btnChangePassword.setText("CHANGE PASSWORD");
        btnChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePasswordActionPerformed(evt);
            }
        });

        lblRetypePassword.setBackground(new java.awt.Color(204, 255, 204));
        lblRetypePassword.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        lblRetypePassword.setForeground(new java.awt.Color(255, 153, 51));
        lblRetypePassword.setText("RETYPE PASSWORD");

        txtRetypePassword.setBackground(new java.awt.Color(204, 204, 204));
        txtRetypePassword.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N

        rbAdmin.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(rbAdmin);
        rbAdmin.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        rbAdmin.setForeground(new java.awt.Color(255, 153, 51));
        rbAdmin.setText("ADMIN");

        rbStudent.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(rbStudent);
        rbStudent.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        rbStudent.setForeground(new java.awt.Color(255, 153, 51));
        rbStudent.setText("STUDENT");

        javax.swing.GroupLayout LoginInnerPanelLayout = new javax.swing.GroupLayout(LoginInnerPanel);
        LoginInnerPanel.setLayout(LoginInnerPanelLayout);
        LoginInnerPanelLayout.setHorizontalGroup(
            LoginInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginInnerPanelLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(LoginInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginInnerPanelLayout.createSequentialGroup()
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(btnChangePassword)
                        .addGap(118, 118, 118))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginInnerPanelLayout.createSequentialGroup()
                        .addGroup(LoginInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRetypePassword)
                            .addGroup(LoginInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblNewPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(LoginInnerPanelLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(rbAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(LoginInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LoginInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtUsername)
                                .addComponent(txtNewPassword)
                                .addComponent(txtRetypePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(rbStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(100, 100, 100))))
        );
        LoginInnerPanelLayout.setVerticalGroup(
            LoginInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginInnerPanelLayout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(LoginInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(LoginInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(LoginInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRetypePassword)
                    .addComponent(txtRetypePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(LoginInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbAdmin)
                    .addComponent(rbStudent))
                .addGap(42, 42, 42)
                .addGroup(LoginInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnChangePassword))
                .addGap(98, 98, 98))
        );

        lblDisplayUsername.setBackground(new java.awt.Color(0, 255, 0));
        lblDisplayUsername.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuizApp_Gui/Images/icon-setting-5.jpg"))); // NOI18N
        jLabel2.setText("jLabel1");

        javax.swing.GroupLayout ChangePasswordPanelLayout = new javax.swing.GroupLayout(ChangePasswordPanel);
        ChangePasswordPanel.setLayout(ChangePasswordPanelLayout);
        ChangePasswordPanelLayout.setHorizontalGroup(
            ChangePasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChangePasswordPanelLayout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(lblChangePasswordFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(286, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ChangePasswordPanelLayout.createSequentialGroup()
                .addGroup(ChangePasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ChangePasswordPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblDisplayUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ChangePasswordPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(ChangePasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoginInnerPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        ChangePasswordPanelLayout.setVerticalGroup(
            ChangePasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChangePasswordPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ChangePasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblLogout)
                    .addGroup(ChangePasswordPanelLayout.createSequentialGroup()
                        .addComponent(lblDisplayUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(3, 3, 3)))
                .addGap(27, 27, 27)
                .addComponent(lblChangePasswordFrame)
                .addGroup(ChangePasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ChangePasswordPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(LoginInnerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ChangePasswordPanelLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ChangePasswordPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ChangePasswordPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseEntered
        // TODO add your handling code here:
        lblLogout.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblLogoutMouseEntered

    private void lblLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseExited
        // TODO add your handling code here:
        lblLogout.setForeground(oldcolor);
    }//GEN-LAST:event_lblLogoutMouseExited

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        // TODO add your handling code here:
         LoginFrame login=new LoginFrame();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        AdminOptionFrame adminFrame=new AdminOptionFrame();
        adminFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed
    private String username;
    private String password;
    private String retype;
    
    private boolean validateInput()
{
    username=txtUsername.getText();
    password=txtNewPassword.getText();
    retype=txtRetypePassword.getText();
    
    if(username.isEmpty()||password.isEmpty()||retype.isEmpty())
    {return false;}
    return true;
}
    
     private String getUserType()
    {
        if(rbAdmin.isSelected())
            return rbAdmin.getText();
        
        else if(rbStudent.isSelected())
            return rbStudent.getText();
        
        else return null;
    }
     
    private void btnChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePasswordActionPerformed
        // TODO add your handling code here:
        if(validateInput()==false)
        {
             JOptionPane.showMessageDialog(null,"Please fill all the fields","!!!Error",JOptionPane.ERROR_MESSAGE);
             return;}
        
         String userType=getUserType();
        if(userType==null)
        {
            JOptionPane.showMessageDialog(null,"Please select a usertype","!!!Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(retype.equals(password)==false)
        {JOptionPane.showMessageDialog(null,"Passwords does not match","!Error",JOptionPane.ERROR_MESSAGE);
             return;}
        
        User user=new User(username,password,userType);
        try{
            boolean isValidUser=UserDAO.changePassword(user);
            if(isValidUser)
            {
                 JOptionPane.showMessageDialog(null,"Password changed successfully ","!SUCCESS",JOptionPane.INFORMATION_MESSAGE);
                 AdminOptionFrame adminFrame=new AdminOptionFrame();
                 adminFrame.setVisible(true);
                 this.dispose();
            
            }
            else{
                JOptionPane.showMessageDialog(null,"Could not change password","!!FAILED",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"DB ERROR ","!!!LOGIN ERROR",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        
        
        
    }//GEN-LAST:event_btnChangePasswordActionPerformed

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
            java.util.logging.Logger.getLogger(ChangePasswordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePasswordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePasswordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePasswordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePasswordFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ChangePasswordPanel;
    private javax.swing.JPanel LoginInnerPanel;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnChangePassword;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblChangePasswordFrame;
    private javax.swing.JLabel lblDisplayUsername;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblNewPassword;
    private javax.swing.JLabel lblRetypePassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JRadioButton rbAdmin;
    private javax.swing.JRadioButton rbStudent;
    private javax.swing.JTextField txtNewPassword;
    private javax.swing.JTextField txtRetypePassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
