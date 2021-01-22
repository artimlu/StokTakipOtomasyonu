
package SwingUI;

import java.awt.HeadlessException;
import static java.awt.image.ImageObserver.HEIGHT;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class Kullanıcılar extends javax.swing.JFrame {
    String dbUrl = "jdbc:mysql://localhost:3306/stoktakipotomasyonu";
    Connection con;
    ResultSet rs;
    PreparedStatement prs;
    Statement st;
    
    public Kullanıcılar() {
        initComponents();
        baglanti();
        kullaniciTablo();
        this.setLocationRelativeTo(null);
    }

    
    private void baglanti() {
         try {
            con =DriverManager.getConnection(dbUrl, "root", "");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Veritabanı Bağlantısı Başarısız");
        }
    }
    
    
    public void kullaniciTablo() {
        try {
            String sql = "select id as Id ,kullanici_yetki as Yetki,kullanici_adi as Kullanıcı_Ad,kullanici_email as Email from kullanici_giris order by kullanici_adi asc";
            prs = con.prepareStatement(sql);
            rs = prs.executeQuery();
            kullanici_tablo.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            ex.printStackTrace();
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        kullanici_combo = new javax.swing.JComboBox();
        kullanici_ad = new javax.swing.JTextField();
        kullanıcı_buton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        kullanici_id = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        kullanici_email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        kullanici_sifre = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        kullanici_tablo = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Kullanıcı Yetki");

        jLabel2.setText("Kullanıcı Ad");

        kullanici_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Müdür", "Şef", "Personel", " " }));

        kullanıcı_buton.setText("Kaydet");
        kullanıcı_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullanıcı_butonActionPerformed(evt);
            }
        });

        jButton1.setText("Güncelle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Sil");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Id");

        jLabel6.setText("Email");

        jLabel7.setText("Şifre");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1))
                        .addGap(122, 122, 122)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(kullanici_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kullanici_ad, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(kullanici_id, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kullanici_email)
                            .addComponent(kullanici_sifre)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(kullanıcı_buton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButton1)
                        .addGap(34, 34, 34)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(192, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(kullanici_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kullanici_combo)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(kullanici_ad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(kullanici_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(kullanici_sifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kullanıcı_buton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        kullanici_tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        kullanici_tablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kullanici_tabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(kullanici_tablo);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kullanıcı_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullanıcı_butonActionPerformed
        try {
            String yetki = kullanici_combo.getSelectedItem().toString();
            String ad = kullanici_ad.getText();
            String email = kullanici_email.getText();
            String sifre = kullanici_sifre.getText();
           

            String query = ("insert into kullanici_giris(kullanici_yetki,kullanici_adi,kullanici_email,kullanici_sifre) "
                    + "values('" + yetki + "','" + ad + "','" + email + "','" + sifre + "')");
                    

            st =  con.createStatement();
            st.executeUpdate(query);
          
            kullanici_combo.setSelectedItem("");
            kullanici_ad.setText("");
            kullanici_email.setText("");
            kullanici_sifre.setText("");
           
            JOptionPane.showMessageDialog(null, "Kullanıcı Başarılı Bir Şekilde Eklendi", "Kullanıcı Eklendi", HEIGHT);
            kullaniciTablo();
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Kullanıcı Eklenemedi Lütfen Kullanıcı Bilgilerini Kontrol Ediniz", "Kullanıcı Ekleme Başarısız", HEIGHT);
        }
       
    }//GEN-LAST:event_kullanıcı_butonActionPerformed

    private void kullanici_tabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kullanici_tabloMouseClicked
         try {
            int row = kullanici_tablo.getSelectedRow();
            String tableClick = (kullanici_tablo.getModel().getValueAt(row, 0).toString());
            String sqlString = "select * from kullanici_giris where id='" + tableClick + "'  ";
            prs = con.prepareStatement(sqlString);
            rs = prs.executeQuery();
            if (rs.next()) {
                String add1 = rs.getString("id");
                kullanici_id.setText(add1);
                String add2 = rs.getString("kullanici_yetki");
                kullanici_combo.setSelectedItem(add2);
                String add3 = rs.getString("kullanici_adi");
                kullanici_ad.setText(add3);
                String add4 = rs.getString("kullanici_email");
                kullanici_email.setText(add4);
             
                
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_kullanici_tabloMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try {
            int id = Integer.valueOf(kullanici_id.getText());
            String yetki = kullanici_combo.getSelectedItem().toString();
            String ad = kullanici_ad.getText();
            String email = kullanici_email.getText();
            int sifre = Integer.valueOf(kullanici_sifre.getText());
            
            
            
            String query = ("update kullanici_giris set kullanici_yetki='" +yetki + "',kullanici_adi='" + ad+"',kullanici_email='"+email
                    + "',kullanici_sifre='" + sifre + "' where id='" + id + "'");

            st = con.createStatement();
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Kullanıcı Başarılı Bir Şekilde Güncellendi", "Kullanıcı Güncellendi", HEIGHT);

            kullanici_id.setText("-");
            kullanici_combo.setSelectedItem("");
            kullanici_ad.setText("");
            kullanici_email.setText("");
           
            kullaniciTablo();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ürün Güncellenemedi Bilgileri Kontrol Ediniz veya Listeden Yeniden Seçiniz", "Ürün Güncellenemedi", HEIGHT);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         int onay = JOptionPane.showConfirmDialog(null, "Ürünü Silinecek Onaylıyor Musunuz ?", "Onaylıyor Musunuz ?", HEIGHT);
        if (onay == JOptionPane.YES_OPTION) {
            try {
                int id = Integer.valueOf(kullanici_id.getText());
                String query = "delete from kullanici_giris where id='" + id + "'";
                st = con.createStatement();
                st.executeUpdate(query);

                kullanici_combo.setSelectedItem("-");
                kullanici_ad.setText("-");
               
                
                kullaniciTablo();
            } catch (SQLException ex) {
                Logger.getLogger(AnaSayfa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                                      

        
    }//GEN-LAST:event_jButton2ActionPerformed
    
    
   
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
            java.util.logging.Logger.getLogger(Kullanıcılar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kullanıcılar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kullanıcılar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kullanıcılar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kullanıcılar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kullanici_ad;
    private javax.swing.JComboBox kullanici_combo;
    private javax.swing.JTextField kullanici_email;
    private javax.swing.JTextField kullanici_id;
    private javax.swing.JTextField kullanici_sifre;
    private javax.swing.JTable kullanici_tablo;
    private javax.swing.JButton kullanıcı_buton;
    // End of variables declaration//GEN-END:variables
}
