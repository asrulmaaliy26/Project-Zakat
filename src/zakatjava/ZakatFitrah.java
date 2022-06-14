/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zakatjava;

import GUI.kalkulator_zakat;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ZakatFitrah extends javax.swing.JFrame {

    public ZakatFitrah() {
        initComponents();
    }
    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    float Uprice,total,flag;
    String Zakatname;
    PreparedStatement  add = null;
public void SelectProd(){
    try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zakat","root","");
            st = (Statement) con.createStatement();
            rs = st.executeQuery("select * from order");
            //ProductTable.setModel(DbUtils.resultSetToTableModel(rs));
            
    }catch(SQLException e){
            e.printStackTrace();
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        FitrahTx = new javax.swing.JTextField();
        AddBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        FitrahTbl = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        HitungBtn = new javax.swing.JButton();
        FitrahTx1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        HitungFtrh = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ZAKAT FITRAH");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("HITUNG");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Simpan Zakat Anda");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nishab = 2.8 Kg Perorangan");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        FitrahTx.setBackground(new java.awt.Color(255, 255, 255));
        FitrahTx.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FitrahTx.setForeground(new java.awt.Color(0, 0, 0));
        FitrahTx.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        FitrahTx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FitrahTxMouseClicked(evt);
            }
        });
        FitrahTx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FitrahTxActionPerformed(evt);
            }
        });
        getContentPane().add(FitrahTx, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 190, 30));

        AddBtn.setBackground(new java.awt.Color(204, 255, 204));
        AddBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(0, 0, 0));
        AddBtn.setText("Simpan");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });
        getContentPane().add(AddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        BackBtn.setBackground(new java.awt.Color(204, 255, 204));
        BackBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BackBtn.setForeground(new java.awt.Color(0, 0, 0));
        BackBtn.setText("Back");
        BackBtn.setToolTipText("");
        BackBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackBtnMouseClicked(evt);
            }
        });
        getContentPane().add(BackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        FitrahTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Jiwa", "Besar Zakat", "Total"
            }
        ));
        FitrahTbl.setIntercellSpacing(new java.awt.Dimension(0, 0));
        FitrahTbl.setRowHeight(20);
        FitrahTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FitrahTblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(FitrahTbl);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 400, 290));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 60, -1, -1));

        HitungBtn.setBackground(new java.awt.Color(204, 255, 204));
        HitungBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        HitungBtn.setForeground(new java.awt.Color(0, 0, 0));
        HitungBtn.setText("Hitung");
        HitungBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HitungBtnMouseClicked(evt);
            }
        });
        getContentPane().add(HitungBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        FitrahTx1.setBackground(new java.awt.Color(255, 255, 255));
        FitrahTx1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FitrahTx1.setForeground(new java.awt.Color(0, 0, 0));
        FitrahTx1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        FitrahTx1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FitrahTx1MouseClicked(evt);
            }
        });
        FitrahTx1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FitrahTx1ActionPerformed(evt);
            }
        });
        getContentPane().add(FitrahTx1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 190, 30));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Jumlah Jiwa Yang Membayar Zakat :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        HitungFtrh.setBackground(new java.awt.Color(204, 255, 204));
        HitungFtrh.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        HitungFtrh.setForeground(new java.awt.Color(0, 0, 0));
        HitungFtrh.setText("Bayar");
        HitungFtrh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HitungFtrhMouseClicked(evt);
            }
        });
        HitungFtrh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HitungFtrhActionPerformed(evt);
            }
        });
        getContentPane().add(HitungFtrh, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 460, -1, -1));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS_alpro/background.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 0, 800, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void FitrahTxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FitrahTxMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_FitrahTxMouseClicked

    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        // TODO add your handling code here:
        String a = "Zakat Fitrah";
        int i = Integer.valueOf(FitrahTx.getText());
        int o = i*1;
        if(FitrahTx.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Masukkan Nilai");
        }
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zakat","root","");
            add = con.prepareStatement("insert into zakatbl values(?,?)");
            add.setString(1, a);
            add.setInt(2, Integer.valueOf(FitrahTx.getText()));
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Zakat Fitrah tersimpan sebesar Rp " + o);
            con.close();
            //SelectProd();

        }catch(SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Masuk ke Bayar dan hapus Zakat Fitrah terlebih dahulu untuk menympan kembali");
        }
    }//GEN-LAST:event_AddBtnMouseClicked

    private void FitrahTxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FitrahTxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FitrahTxActionPerformed

    private void HitungBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HitungBtnMouseClicked
        // TODO add your handling code here:
        if (FitrahTx1.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Select Product and Enter Qty");
        }else{
        
        Uprice = Integer.valueOf(FitrahTx1.getText());
        float tot = (float) (Uprice * 2.8);
        float tot1 = (float) (tot * 100000);
        int tot2 = (int) (tot1*1);
        Vector v = new Vector();
        v.add(FitrahTx1.getText());
        v.add(tot);
        v.add(tot2);
        DefaultTableModel dt = (DefaultTableModel)FitrahTbl.getModel();
        dt.addRow(v);
        }
    }//GEN-LAST:event_HitungBtnMouseClicked

    private void FitrahTx1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FitrahTx1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_FitrahTx1MouseClicked

    private void FitrahTx1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FitrahTx1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FitrahTx1ActionPerformed

    private void HitungFtrhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HitungFtrhMouseClicked
        try {
            // TODO add your handling code here:
            new Order().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(ZakatFitrah.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_HitungFtrhMouseClicked

    private void HitungFtrhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HitungFtrhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HitungFtrhActionPerformed

    private void BackBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBtnMouseClicked
        // TODO add your handling code here:
        new kalkulator_zakat().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackBtnMouseClicked

    private void FitrahTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FitrahTblMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)FitrahTbl.getModel();
        int Myindex = FitrahTbl.getSelectedRow();
        FitrahTx.setText(model.getValueAt(Myindex, 2).toString());
    }//GEN-LAST:event_FitrahTblMouseClicked

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
            java.util.logging.Logger.getLogger(ZakatFitrah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ZakatFitrah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ZakatFitrah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ZakatFitrah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ZakatFitrah().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton BackBtn;
    private javax.swing.JTable FitrahTbl;
    private javax.swing.JTextField FitrahTx;
    private javax.swing.JTextField FitrahTx1;
    private javax.swing.JButton HitungBtn;
    private javax.swing.JButton HitungFtrh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
