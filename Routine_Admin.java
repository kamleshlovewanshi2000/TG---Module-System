/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg_module;
import java.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import static tg_module.Connection.getConnection;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author Kamlesh Lovewanshi
 */

public class Routine_Admin extends javax.swing.JFrame {

    /**
     * Creates new form Routine_Admin
     */
    
    Connection con;
    ResultSet rs;
    PreparedStatement pst;
    public Routine_Admin() {
        initComponents();

  }

    
    public void RoutineDB(){
         String sql = "select * from Routine";
        
        try {
            pst=con.prepareStatement(sql);
            rs = pst.executeQuery();
            jTableRoutine.setModel(DbUtils.resultSetToTableModel(rs));
           
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxSection = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableRoutine = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxDay = new javax.swing.JComboBox<>();
        jComboBoxCourseName = new javax.swing.JComboBox<>();
        jComboBoxRoomNumber = new javax.swing.JComboBox<>();
        jComboBoxTime = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jSection = new javax.swing.JLabel();
        jAssign = new javax.swing.JButton();
        jUpdate = new javax.swing.JButton();
        Delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TG - Module System");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("Assign Class Routine");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/truba.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icons8-classroom-40.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(246, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(189, 189, 189))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(353, 353, 353))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(227, 227, 227))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jComboBoxSection.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBoxSection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", " " }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Day");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Course Name");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Room Number");

        jTableRoutine.setBackground(new java.awt.Color(204, 204, 255));
        jTableRoutine.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enter_ID", "Section", "Day", "CouseName", "RoomNumber", "Time"
            }
        ));
        jTableRoutine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableRoutineMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableRoutine);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Time");

        jComboBoxDay.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBoxDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday" }));

        jComboBoxCourseName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBoxCourseName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DBMS", "CS", "TOC", "IWT", "Python lab", "JAVA Project" }));

        jComboBoxRoomNumber.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBoxRoomNumber.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "101", "102", "103", "104", "105", "106", "107", "108", "109", "110", "111", "112", "113", "114", "115", "116", "117", "118", "119", "120", " " }));

        jComboBoxTime.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBoxTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9:45 AM - 10:15 AM", "10:15 AM - 11:00 AM", "11:00 AM - 11:45 AM", "11:45 AM - 12:45 PM", "1:15 PM - 2:00 PM", "2.00 PM - 2.45 PM", "2:45 PM - 3:30 PM", "3:30 PM - 4:15 PM" }));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icons8-back-arrow-24.png"))); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jSection.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jSection.setText("Section");

        jAssign.setBackground(new java.awt.Color(204, 204, 204));
        jAssign.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jAssign.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icons8-plus-24.png"))); // NOI18N
        jAssign.setText("Assign");
        jAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAssignActionPerformed(evt);
            }
        });

        jUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icons8-update-24(1).png"))); // NOI18N
        jUpdate.setText("Update");
        jUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUpdateActionPerformed(evt);
            }
        });

        Delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icons8-delete-bin-24.png"))); // NOI18N
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 831, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxRoomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jComboBoxTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jAssign)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jUpdate)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Delete))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSection)
                                    .addComponent(jLabel5))
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSection))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBoxRoomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jComboBoxTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jAssign)
                        .addComponent(jUpdate)
                        .addComponent(Delete)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Admin_DashBoard lfg = new Admin_DashBoard();
        lfg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAssignActionPerformed
        con =Connection.getConnection();
        if(con !=null){
        String section=(String) jComboBoxSection.getSelectedItem();
        String day=(String) jComboBoxDay.getSelectedItem();
        String coursename=(String) jComboBoxCourseName.getSelectedItem();
        String roomnumber=(String) jComboBoxRoomNumber.getSelectedItem();
        String time=(String) jComboBoxTime.getSelectedItem();
        
        
        String sql= "INSERT INTO Routine(Section,Day,CourseName,RoomNumber,Time) VALUES (?,?,?,?,?)";
            try {
                pst=con.prepareStatement(sql);
                pst.setString(1, section);
                pst.setString(2, day);
                pst.setString(3, coursename);
                pst.setString(4, roomnumber);
                pst.setString(5, time);
                pst.execute();
                
                
                JOptionPane.showMessageDialog(null,"Routine Succesfully Added!");
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Enter valid data!");
            }
            finally{
            try{
             rs.close();
             pst.close();
                    
            }catch(SQLException ex){}
        
            }
            }
        RoutineDB();
    }//GEN-LAST:event_jAssignActionPerformed

    private void jTableRoutineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableRoutineMouseClicked
        int row=jTableRoutine.getSelectedRow();
        String sjb=jTableRoutine.getModel().getValueAt(row, 0).toString();
        
        try{
        String sqwl="select * from Routine where Enter_ID="+sjb+"";
        pst=con.prepareStatement(sqwl);
        rs=pst.executeQuery();
        
        if(rs.next()){
          //get data from data
           String section=rs.getString("Section");
           String day=rs.getString("Day");
           String coursename=rs.getString("CourseName");
           String roomnumber=rs.getString("RoomNumber");
           String time=rs.getString("Time");
           
          //putting data in the fields
           
           jComboBoxSection.setSelectedItem(section);
           jComboBoxDay.setSelectedItem(day);
           jComboBoxCourseName.setSelectedItem(coursename);
           jComboBoxRoomNumber.setSelectedItem(roomnumber);
           jComboBoxTime.setSelectedItem(time);
           
           
        }
        
        }
        catch(SQLException ex){
        JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jTableRoutineMouseClicked

    private void jUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUpdateActionPerformed

       
        if(con !=null){
            String section = (String) jComboBoxSection.getSelectedItem();
            String day = (String) jComboBoxDay.getSelectedItem();
            String coursename = (String) jComboBoxCourseName.getSelectedItem();
            String roomnumber = (String) jComboBoxRoomNumber.getSelectedItem();
            String time = (String) jComboBoxTime.getSelectedItem();
            
         
            int row=jTableRoutine.getSelectedRow();
            String sjb=jTableRoutine.getModel().getValueAt(row, 0).toString();
            String sql="update Routine set Section=?,Day=?,CourseName=?,RoomNumber=?,Time=? where Enter_ID="+sjb+"";
            try {
                pst=con.prepareStatement(sql);

                pst.setString(1, section);
                pst.setString(2,day);
                pst.setString(3, coursename);
                pst.setString(4, roomnumber);
                pst.setString(5,time);
                
                pst.execute();

                JOptionPane.showMessageDialog(null, "Updated successfully!");

            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex);
            }
        }
        RoutineDB();
    }//GEN-LAST:event_jUpdateActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
       int row=jTableRoutine.getSelectedRow();
            String sjb=jTableRoutine.getModel().getValueAt(row, 0).toString();
            String sql="delete from Routine where Enter_ID="+sjb+"";
        try {
            pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Successfully Deleted");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        RoutineDB();

    }//GEN-LAST:event_DeleteActionPerformed

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
            java.util.logging.Logger.getLogger(Routine_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Routine_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Routine_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Routine_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Routine_Admin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JButton jAssign;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxCourseName;
    private javax.swing.JComboBox<String> jComboBoxDay;
    private javax.swing.JComboBox<String> jComboBoxRoomNumber;
    private javax.swing.JComboBox<String> jComboBoxSection;
    private javax.swing.JComboBox<String> jComboBoxTime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jSection;
    private javax.swing.JTable jTableRoutine;
    private javax.swing.JButton jUpdate;
    // End of variables declaration//GEN-END:variables
}
