/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Taljaard;

/**
 *
 * @author 27649
 */
public class CongratsForRegistrationScrn extends javax.swing.JFrame {
 
    /**
     * Creates new form CongratsForRegistrationScrn
     */
    public CongratsForRegistrationScrn() {
        initComponents();
        txtfUserName.setText(Competitor.getUsername());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCongratsRegister = new javax.swing.JPanel();
        lblCongratsRegister = new javax.swing.JLabel();
        lblFirstSteps = new javax.swing.JLabel();
        btnContinueRegister = new javax.swing.JButton();
        lblUsername = new javax.swing.JLabel();
        txtfUserName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlCongratsRegister.setBackground(new java.awt.Color(204, 255, 153));

        lblCongratsRegister.setFont(new java.awt.Font("SimSun", 1, 28)); // NOI18N
        lblCongratsRegister.setForeground(new java.awt.Color(51, 102, 0));
        lblCongratsRegister.setText("CONGRATULATIONS ON REGISTERING!");

        lblFirstSteps.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        lblFirstSteps.setText("You Have Taken The First Steps Towards A Greener Future!");

        btnContinueRegister.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        btnContinueRegister.setText("CONTINUE");
        btnContinueRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinueRegisterActionPerformed(evt);
            }
        });

        lblUsername.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        lblUsername.setText("COMPETITION USERNAME:");

        txtfUserName.setEditable(false);
        txtfUserName.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N

        javax.swing.GroupLayout pnlCongratsRegisterLayout = new javax.swing.GroupLayout(pnlCongratsRegister);
        pnlCongratsRegister.setLayout(pnlCongratsRegisterLayout);
        pnlCongratsRegisterLayout.setHorizontalGroup(
            pnlCongratsRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCongratsRegisterLayout.createSequentialGroup()
                .addGroup(pnlCongratsRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCongratsRegisterLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(pnlCongratsRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCongratsRegister)
                            .addGroup(pnlCongratsRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnlCongratsRegisterLayout.createSequentialGroup()
                                    .addComponent(lblUsername)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtfUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lblFirstSteps, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlCongratsRegisterLayout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(btnContinueRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pnlCongratsRegisterLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblUsername, txtfUserName});

        pnlCongratsRegisterLayout.setVerticalGroup(
            pnlCongratsRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCongratsRegisterLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblCongratsRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFirstSteps)
                .addGap(37, 37, 37)
                .addGroup(pnlCongratsRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfUserName)
                    .addComponent(lblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(btnContinueRegister)
                .addGap(44, 44, 44))
        );

        pnlCongratsRegisterLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblUsername, txtfUserName});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCongratsRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCongratsRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinueRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinueRegisterActionPerformed
        ChallengeInfoPopupScrn info = new ChallengeInfoPopupScrn();
        info.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnContinueRegisterActionPerformed

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
            java.util.logging.Logger.getLogger(CongratsForRegistrationScrn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CongratsForRegistrationScrn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CongratsForRegistrationScrn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CongratsForRegistrationScrn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CongratsForRegistrationScrn().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinueRegister;
    private javax.swing.JLabel lblCongratsRegister;
    private javax.swing.JLabel lblFirstSteps;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel pnlCongratsRegister;
    private javax.swing.JTextField txtfUserName;
    // End of variables declaration//GEN-END:variables
}