package SwingUI;

import AbstractDal.JDBCBaglanti;
import DAO.Veritabanı;
import DAO.ÜrünlerDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import net.proteanit.sql.DbUtils;


public class Raporlar extends javax.swing.JFrame {
    Connection con;
    ResultSet rs;
    PreparedStatement prs;
    Statement st;
    String dbUrl = "jdbc:mysql://localhost:3306/stoktakipotomasyonu";
      ÜrünlerDAO islemler =  new ÜrünlerDAO();
    Veritabanı veritabanı = new Veritabanı();
    
    JDBCBaglanti jDBCBaglanti = new JDBCBaglanti() {

        @Override
        public String connectionStatus() throws SQLException {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };
             
    
      class Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Calendar cal = Calendar.getInstance();
            int hour = cal.get(Calendar.HOUR_OF_DAY);
            int min = cal.get(Calendar.MINUTE);
            int sec = cal.get(Calendar.SECOND);
            DateFormat date = new SimpleDateFormat("dd/MM/yyyy");
            satısTarih.setText(date.format(cal.getTime()));
            satısSaat.setText(hour + ":" + min + ":" + sec);
        }
    }
   
    public Raporlar() throws SQLException{
        initComponents();
        Timer t = new Timer(1000, new Listener());
        t.start();
        Timer tt = new Timer(1000, new yenile());
        tt.start();
        databaseBaglanti();
         listele();
        
        this.setLocationRelativeTo(null);
        tablo2();
        tablo3();
        tablo();
    }
    
    
    
     
    public void databaseBaglanti() {
        try {
            con =  DriverManager.getConnection(dbUrl, "root", "");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Veritabanı Bağlantısı Başarısız Oldu...");
        }
    }
    
    
     public void tablo() {
        try {
            String sql = "select id as Id ,satilan_ürün as Ürün_Adi,satis_miktari as Satis_Miktari from satislar";
            prs = con.prepareStatement(sql);
            rs = prs.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            jTable1.getColumnModel().getColumn(0).setMaxWidth(40);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
     public void tablo2() {
        try {
            SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
            String tarih_ilk = d.format(IlkTarih.getDate());
            String tarih_son = d.format(sonTarih.getDate());
            String sql2 = "select distinct * from satislar where satis_tarihi between '" + tarih_ilk + "' and '" + tarih_son + "'";
            prs = con.prepareStatement(sql2);
            ResultSet rs1 = prs.executeQuery();
            raporTablo.setModel(DbUtils.resultSetToTableModel(rs1));
            raporTablo.getColumnModel().getColumn(0).setMaxWidth(40);
        } catch (Exception e) {
        }
    }
     
      public void tablo3() {
        try {
            String sql = "select sum(ürün_stok) from ürünler";
            prs = con.prepareStatement(sql);
            ResultSet rs1 = prs.executeQuery();
            while (rs1.next()) {
                String s = rs1.getString(1);
                System.out.println(s);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
    }
      
         public void listele() {
        DefaultListModel listModel = new DefaultListModel();
        try {
            String s = satısTarih.getText();
            String sql = "select distinct satilan_ürün from satislar where satis_tarihi='" + s + "'";
            prs = con.prepareStatement(sql);
            rs = prs.executeQuery();
            while (rs.next()) {
                String ürünBaslik = rs.getString("satilan_ürün");
                listModel.addElement(ürünBaslik);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
         }
         
          class yenile implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            listele();
        }
    }
          
         
          public void günlükRapor() {
        
        //Ürün Karlarını hesapla-yolla
        try {
            String sql = "select sum(ürün_kari) from satislar where satis_tarihi='" + satısTarih.getText() + "'";
            prs = con.prepareStatement(sql);
            rs = prs.executeQuery();
            while (rs.next()) {
                String result = rs.getString(1);
                toplamKarLabel.setText(result + " TL");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //Ürünlerin Satış Fiyatını Hesapla ve yolla
        try {
            String sql = "select sum(satis_fiyati) from satislar where satis_tarihi='" + satısTarih.getText() + "'";
            prs = con.prepareStatement(sql);
            rs = prs.executeQuery();
            while (rs.next()) {
                String result = rs.getString(1);
                ToplamParaLabel.setText(result + " TL");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
          
         
          
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        raporTablo = new javax.swing.JTable();
        IlkTarih = new com.toedter.calendar.JDateChooser();
        sonTarih = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        satısSaat = new javax.swing.JLabel();
        satısTarih = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        ToplamParaLabel = new javax.swing.JLabel();
        toplamKarLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Raporlar\n");

        raporTablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(raporTablo);

        jButton1.setText("Satışları Getir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jLabel1.setText("Arası");

        jLabel2.setText("Tarih:");

        jLabel3.setText("Saat:");

        jButton2.setText("Hesapla");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Bugün Satışı Yapılan Ürünler");

        ToplamParaLabel.setText("0");

        toplamKarLabel.setText("0");

        jLabel7.setText("Kazanılan Toplam Para");

        jLabel8.setText("Kazanılan Toplam Kar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(IlkTarih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addComponent(sonTarih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addGap(39, 39, 39)
                .addComponent(satısTarih)
                .addGap(215, 215, 215)
                .addComponent(jLabel3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(satısSaat))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(toplamKarLabel)
                            .addComponent(ToplamParaLabel))
                        .addGap(214, 214, 214))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(793, 793, 793)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(155, 155, 155)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(90, 90, 90))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(satısSaat)
                            .addComponent(satısTarih))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IlkTarih, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sonTarih, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(58, 58, 58))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ToplamParaLabel)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(toplamKarLabel)
                                    .addComponent(jLabel8)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jButton2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       tablo2();
       tablo3();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        günlükRapor();
    }//GEN-LAST:event_jButton2ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Raporlar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Raporlar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Raporlar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Raporlar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Raporlar().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Raporlar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser IlkTarih;
    private javax.swing.JLabel ToplamParaLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable raporTablo;
    private javax.swing.JLabel satısSaat;
    private javax.swing.JLabel satısTarih;
    private com.toedter.calendar.JDateChooser sonTarih;
    private javax.swing.JLabel toplamKarLabel;
    // End of variables declaration//GEN-END:variables
}
