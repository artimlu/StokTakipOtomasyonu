package SwingUI;

import DAO.ÜrünlerDAO;
import AbstractDal.JDBCBaglanti;
import DAO.Veritabanı;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class ÜrünEkle extends javax.swing.JFrame{
 
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
             
                
    public ÜrünEkle() throws SQLException{
        initComponents();
        databaseBaglanti();
        ürünEkleTablo();
        this.setLocationRelativeTo(null);

    }
    
       public void databaseBaglanti() {
        try {
            con = DriverManager.getConnection(dbUrl, "root", "");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Veritabanı Bağlantısı Başarısız Oldu...");
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ürünEkleKaydetBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ürünEkleTablo = new javax.swing.JTable();
        ürünAdEkle = new javax.swing.JTextField();
        ürünEkleKategori = new javax.swing.JTextField();
        ürünEkleStok = new javax.swing.JTextField();
        ürünEkleAlışFiyatı = new javax.swing.JTextField();
        ürünEkleSatışFiyatı = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ekleÜrünTarihi = new com.toedter.calendar.JDateChooser();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ürün Ekle\n");

        jLabel2.setText("Ürün Kategori");

        ürünEkleKaydetBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/basket-icon small.png"))); // NOI18N
        ürünEkleKaydetBtn.setText("Ürün Ekle");
        ürünEkleKaydetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ürünEkleKaydetBtnActionPerformed(evt);
            }
        });

        jLabel4.setText("Alış Fiyatı");

        jLabel5.setText("Satış Fiyatı");

        jLabel3.setText("Stok");

        jLabel1.setText("Ürün Adı");

        ürünEkleTablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        ürünEkleTablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ürünEkleTabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ürünEkleTablo);

        jLabel6.setText("Tarih");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(115, 115, 115)
                                .addComponent(ürünAdEkle, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(94, 94, 94)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ürünEkleAlışFiyatı, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                    .addComponent(ürünEkleStok)
                                    .addComponent(ürünEkleSatışFiyatı)
                                    .addComponent(ürünEkleKategori)))
                            .addComponent(jLabel6))
                        .addComponent(ürünEkleKaydetBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(ekleÜrünTarihi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(ürünAdEkle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(ürünEkleKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(ürünEkleStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(ürünEkleAlışFiyatı, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(ürünEkleSatışFiyatı, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(ekleÜrünTarihi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(ürünEkleKaydetBtn)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ürünEkleKaydetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ürünEkleKaydetBtnActionPerformed
            
          if (ürünAdEkle.getText().length()==0&&ürünEkleKategori.getText().length()==0&&ürünEkleStok.getText().length()==0&&ürünEkleSatışFiyatı.getText().length()==0)
        {
            JOptionPane.showMessageDialog(null,"Ürün kaydı başarısız..Boş Alanları Doldurunuz");
        }
   
        else  if (ürünAdEkle.getText().length()!=0&&ürünEkleStok.getText().length()!=0&&ürünEkleAlışFiyatı.getText().length()!=0&&ürünEkleSatışFiyatı.getText().length()==0)
        {
            JOptionPane.showMessageDialog(null,"Ürün kaydı başarısız...Lütfen alanları kontrol ediniz....");
        }
        
        try {
                //String id = ürünEkleId.getText();
            String ürünAdi = ürünAdEkle.getText().trim();
            String kategori =ürünEkleKategori.getText().trim();
            String adet = ürünEkleStok.getText().trim();
            String alısFiyatı = ürünEkleAlışFiyatı.getText().trim();
            String satisFiyati = ürünEkleSatışFiyatı.getText().trim();
            SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
            String tarih = d.format(ekleÜrünTarihi.getDate());
            
            
            islemler.ürünEkle(ürünAdi,kategori,adet,alısFiyatı,satisFiyati,tarih);
            JOptionPane.showMessageDialog(null, "Ürün Başarılı Bir Şekilde Eklendi", "Ürün Eklendi", HEIGHT);

            ürünEkleTablo();
            
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Hata");
        }
       
    }//GEN-LAST:event_ürünEkleKaydetBtnActionPerformed

    private void ürünEkleTabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ürünEkleTabloMouseClicked
       try {
            int row = ürünEkleTablo.getSelectedRow();
            String tableClick = (ürünEkleTablo.getModel().getValueAt(row, 0).toString());
            String sqlString = "select * from ürünler where id='" + tableClick + "'  ";
            prs= con.prepareStatement(sqlString);
            rs = prs.executeQuery();
            if (rs.next()) {
                String add1 = rs.getString("ürün_adi");
                ürünAdEkle.setText(add1);
                String add2 = rs.getString("ürün_kategorisi");
                ürünEkleKategori.setText(add2);
                String add3 = rs.getString("ürün_stok");
                ürünEkleKategori.setText(add3);
                String add4 = rs.getString("ürün_af");
                ürünEkleAlışFiyatı.setText(add4);
                String add5 = rs.getString("ürün_sf");
                ürünEkleSatışFiyatı.setText(add5);
                String add6 = rs.getString("tarih");
                ekleÜrünTarihi.setDateFormatString(add6);
               
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_ürünEkleTabloMouseClicked

    
    
     public void ürünEkleTablo() {
        try {
            String sql = "select id as Id ,ürün_adi as Ürün_Adi,ürün_kategorisi as Ürün_Kategorisi,ürün_stok as stok,"
                    + "ürün_af as Ürün_Alış_Fiyatı,ürün_sf as Ürün_Satış_Fiyatı,tarih as tarih from ürünler order by ürün_kategorisi asc";
            prs = con.prepareStatement(sql);
            rs = prs.executeQuery();
            ürünEkleTablo.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            ex.printStackTrace();
        }
    }
     
     
     
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
            java.util.logging.Logger.getLogger(ÜrünEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ÜrünEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ÜrünEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ÜrünEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ÜrünEkle().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ÜrünEkle.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser ekleÜrünTarihi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField ürünAdEkle;
    private javax.swing.JTextField ürünEkleAlışFiyatı;
    private javax.swing.JTextField ürünEkleKategori;
    private javax.swing.JButton ürünEkleKaydetBtn;
    private javax.swing.JTextField ürünEkleSatışFiyatı;
    private javax.swing.JTextField ürünEkleStok;
    private javax.swing.JTable ürünEkleTablo;
    // End of variables declaration//GEN-END:variables
}
