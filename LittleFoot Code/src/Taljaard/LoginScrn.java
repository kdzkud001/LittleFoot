/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Taljaard;

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.sql.*;
import java.time.LocalDate;

/**
 *
 * @author 27649
 */
public class LoginScrn extends javax.swing.JFrame {

    //method used to validate the login information input by a user
    private void validateLogin(String inUser, String inPass) {
        String id, surname, username, password;
        
            String iD = "", sNa = "", psWo = "", uNa = "";
            char surIni = ' ';
            int nM = 0;
            LocalDate sD, eD;
            // Execute a SQL query to retrieve the user's information
            String line = Competitor.db.processResultSet(Competitor.db.executeQuery("SELECT Username FROM CompetitorRegistrationInfo WHERE Username = " + inUser + ";"));
            Scanner sc = new Scanner(line).useDelimiter("   ");
            id = sc.next();
            sNa = sc.next();
            surIni = sc.next().charAt(0);
            nM = sc.nextInt();
            sD = LocalDate.parse(sc.next());
            sD = LocalDate.parse(sc.next());
            psWo = sc.next();
            uNa = sc.next().trim();
            if (psWo.equals(inPass)) {
                MainMenuScrn menu = new MainMenuScrn();
                menu.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Username or Password Incorrect.\nPlease try again");
            }
         {
//            ex.printStackTrace();
//            JOptionPane.showMessageDialog(null, "Error occurred while validating login.");
        }
    }
//        PreparedStatement preparedStatement = Competitor.db.connection.prepareStatement(query);
//        preparedStatement.setString(1, inUser);
//        ResultSet resultSet = preparedStatement.executeQuery();
//
//        if (resultSet.next()) {
//            id = resultSet.getString("ID");
//            surname = resultSet.getString("Surname");
//            username = resultSet.getString("Username");
//            password = resultSet.getString("PasswordHash"); // Assuming you store the password as a hash
//
        // Check if the provided password matches the stored hash
//            if (psWo.equals(inPass)) {
//                MainMenuScrn menu = new MainMenuScrn();
//                menu.setVisible(true);
//                this.dispose();
//            } else {
//                JOptionPane.showMessageDialog(null, "Username or Password Incorrect.\nPlease try again");
//            }
//        } else {
//            JOptionPane.showMessageDialog(null, "Username not found.\nPlease try again");
//        }
        // Closing the result set and statement
//        resultSet.close();
//        preparedStatement.close();
    


/**
 * Creates new form LoginScrn
 */
public LoginScrn() {
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

        pnlLogin = new javax.swing.JPanel();
        lblLogin = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        lblPasswordLogin = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        btnLogin = new java.awt.Button();
        pswrdLogin = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 153));

        pnlLogin.setBackground(new java.awt.Color(204, 255, 153));

        lblLogin.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(51, 102, 0));
        lblLogin.setText("LOGIN");

        lblUserName.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        lblUserName.setText("USERNAME");

        lblPasswordLogin.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        lblPasswordLogin.setText("PASSWORD");

        txtUserName.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N

        btnLogin.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        btnLogin.setLabel("LOGIN NOW");
        btnLogin.setName(""); // NOI18N
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        pswrdLogin.setFont(new java.awt.Font("SimSun", 0, 10)); // NOI18N

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUserName)
                    .addComponent(lblPasswordLogin))
                .addGap(68, 68, 68)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUserName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pswrdLogin, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(39, 39, 39))
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(lblLogin))
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUserName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPasswordLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pswrdLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        char[] passwordChars = pswrdLogin.getPassword();
        String password = new String(passwordChars);
        validateLogin(txtUserName.getText(), password);
        MainMenuScrn mnScrn = new MainMenuScrn();
        mnScrn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(LoginScrn

.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginScrn

.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginScrn

.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginScrn

.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginScrn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnLogin;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblPasswordLogin;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPasswordField pswrdLogin;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
