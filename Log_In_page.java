/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg_module;

import java.security.cert.PKIXRevocationChecker.Option;
import static java.lang.String.valueOf;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Kamlesh Lovewanshi
 */
public class Log_In_page extends javax.swing.JFrame {

    public static int index;
    ResultSet rs;
      
     
    public Log_In_page() {
        initComponents();
       bl_U.setVisible(false);
       bl_P.setVisible(false); 
   

        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Option = new javax.swing.JComboBox<>();
        jPasswordField1_passworn_LogIN = new javax.swing.JPasswordField();
        jTextField2_Username_LOg_In = new javax.swing.JTextField();
        jButton1_back_home = new javax.swing.JButton();
        jButton2_st_dashboard = new javax.swing.JButton();
        jcreate_new_account = new javax.swing.JButton();
        bl_U = new javax.swing.JLabel();
        bl_P = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TG - Module System");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("Log In From");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/truba.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icons8-shutdown-40.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(303, 303, 303))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(165, 165, 165))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(415, 415, 415)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8))
                .addGap(25, 25, 25))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Select any Option");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("UserName");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Password");

        Option.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Option.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin Or Faculty", "Student" }));
        Option.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OptionActionPerformed(evt);
            }
        });

        jPasswordField1_passworn_LogIN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jTextField2_Username_LOg_In.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField2_Username_LOg_In.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2_Username_LOg_InActionPerformed(evt);
            }
        });

        jButton1_back_home.setBackground(new java.awt.Color(204, 204, 204));
        jButton1_back_home.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1_back_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icons8-back-arrow-24.png"))); // NOI18N
        jButton1_back_home.setText("Back");
        jButton1_back_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_back_homeActionPerformed(evt);
            }
        });

        jButton2_st_dashboard.setBackground(new java.awt.Color(204, 204, 204));
        jButton2_st_dashboard.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2_st_dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icons8-shutdown-24.png"))); // NOI18N
        jButton2_st_dashboard.setText("Log In");
        jButton2_st_dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_st_dashboardActionPerformed(evt);
            }
        });

        jcreate_new_account.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jcreate_new_account.setForeground(new java.awt.Color(255, 0, 0));
        jcreate_new_account.setText("click here to create a new account");
        jcreate_new_account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcreate_new_accountActionPerformed(evt);
            }
        });

        bl_U.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        bl_U.setForeground(new java.awt.Color(255, 0, 51));
        bl_U.setText("* please enter username");

        bl_P.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        bl_P.setForeground(new java.awt.Color(255, 0, 51));
        bl_P.setText("* please enter password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1_back_home)
                .addGap(143, 143, 143)
                .addComponent(jButton2_st_dashboard)
                .addGap(202, 202, 202))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField2_Username_LOg_In, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bl_U))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPasswordField1_passworn_LogIN, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(bl_P))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(34, 34, 34)
                                .addComponent(Option, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jcreate_new_account, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(86, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Option, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2_Username_LOg_In, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(bl_U))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPasswordField1_passworn_LogIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(bl_P)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1_back_home)
                    .addComponent(jButton2_st_dashboard))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcreate_new_account)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OptionActionPerformed

    private void jTextField2_Username_LOg_InActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2_Username_LOg_InActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2_Username_LOg_InActionPerformed

    private void jButton1_back_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_back_homeActionPerformed
        Home_page lgf = new Home_page();
        lgf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1_back_homeActionPerformed

    private void jcreate_new_accountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcreate_new_accountActionPerformed
        Registration2 lgf = new Registration2();
        lgf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jcreate_new_accountActionPerformed
int xx, xy;
    private void jButton2_st_dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_st_dashboardActionPerformed
         String access = (Option.getSelectedItem().toString());
        if (access == "Admin Or Faculty") {
            bl_U.setVisible(false);
            bl_P.setVisible(false);
            if (jTextField2_Username_LOg_In.getText().equals("")) {
                bl_U.setVisible(true);
            }
            if (String.valueOf(jPasswordField1_passworn_LogIN.getPassword()).equals("")) {
                bl_P.setVisible(true);
            } else {
                Connection con = Connection.getConnection();
                PreparedStatement pst;
                try {
                    pst = con.prepareStatement("SELECT * FROM Admin_Reg_Table WHERE Username = ? AND Password = ?");
                    pst.setString(1, jTextField2_Username_LOg_In.getText());
                    pst.setString(2, String.valueOf(jPasswordField1_passworn_LogIN.getPassword()));

                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {
                        JOptionPane.showMessageDialog(null, "Login Successfully!");
                        Admin_DashBoard admin = new Admin_DashBoard();
                        admin.setVisible(true);
                        this.dispose();

                        admin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Please Enter Correct Username or Password !");
                    }

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }

        }else{

        Signin_for_Student();
        }

    }//GEN-LAST:event_jButton2_st_dashboardActionPerformed

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
            java.util.logging.Logger.getLogger(Log_In_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Log_In_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Log_In_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Log_In_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Log_In_page().setVisible(true);
            }
        });
    }
void Signin_for_Student() {
        bl_U.setVisible(false);
        bl_P.setVisible(false);
        if (jTextField2_Username_LOg_In.getText().equals("")) {
            bl_U.setVisible(true);
        }
        if (String.valueOf(jPasswordField1_passworn_LogIN.getPassword()).equals("")) {
            bl_P.setVisible(true);
        } else {
            Connection con = Connection.getConnection();
            PreparedStatement pst;
            try {
                pst = con.prepareStatement("SELECT * FROM Student_Reg_Table WHERE Username = ? AND Password = ?");
                pst.setString(1, jTextField2_Username_LOg_In.getText());
                pst.setString(2, String.valueOf(jPasswordField1_passworn_LogIN.getPassword()));

                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "Login Successfully!");
                    Student_DashBoard dashboard = new Student_DashBoard();
                    dashboard.setVisible(true);
                   
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Please Enter Correct Username or Password !");
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }

    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Option;
    private javax.swing.JLabel bl_P;
    private javax.swing.JLabel bl_U;
    private javax.swing.JButton jButton1_back_home;
    private javax.swing.JButton jButton2_st_dashboard;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1_passworn_LogIN;
    private javax.swing.JTextField jTextField2_Username_LOg_In;
    private javax.swing.JButton jcreate_new_account;
    // End of variables declaration//GEN-END:variables
}
