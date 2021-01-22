package SwingUI;

import AbstractDal.JDBCBaglanti;
import DAO.Veritabanı;
import DAO.ÜrünlerDAO;
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
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

public class Satıslar extends javax.swing.JFrame {

    Connection con;
    ResultSet rs;
    PreparedStatement prs;
    Statement st;
    String dbUrl = "jdbc:mysql://localhost:3306/stoktakipotomasyonu";
    DateFormat date = new SimpleDateFormat("dd/MM/yyyy");
    Calendar cal = Calendar.getInstance();
    ÜrünlerDAO islemler =  new ÜrünlerDAO();
    Veritabanı veritabanı = new Veritabanı();
    
    JDBCBaglanti jDBCBaglanti = new JDBCBaglanti() {

        @Override
        public String connectionStatus() throws SQLException {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };

    public Satıslar() throws SQLException{
        initComponents();
        databaseBaglanti();
        satıslarTablo();
        this.setLocationRelativeTo(null);

        satısSatısTarih.setText(date.format(cal.getTime()));
    }

    public void databaseBaglanti() {
        try {
            con = DriverManager.getConnection(dbUrl, "root", "");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Veritabanı Bağlantısı Başarısız Oldu...");
        }
    }

    public void satıslarTablo() {
        try {
            String sql = "select id as Id ,ürün_adi as Ürün_Adi,ürün_kategorisi as Ürün_Kategorisi,ürün_stok as Ürün_Stok,"
                    + "ürün_af as Ürün_Alış_Fiyatı,ürün_sf as Ürün_Satış_Fiyatı,tarih as tarih from ürünler order by ürün_kategorisi asc";
            prs = con.prepareStatement(sql);
            rs = prs.executeQuery();
            satıslarTablo.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "a");
            ex.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        satısÜrünAdı = new javax.swing.JLabel();
        satısÜrünKategorisi = new javax.swing.JLabel();
        satısÜrünStok = new javax.swing.JLabel();
        satısÜrünAlısFiyatı = new javax.swing.JLabel();
        satışSatısFiyatı = new javax.swing.JLabel();
        satısSatısTarih = new javax.swing.JLabel();
        satıslarSatısAdedi = new javax.swing.JTextField();
        satıslarSatısButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        satıslarToplamPara = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        satıslarKar = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        satıslarTablo = new javax.swing.JTable();
        satıslarSıralama = new javax.swing.JTextField();
        satıslarGelismisSıralama = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Satış Ekranı\n");

        jLabel3.setText("Ürün Adı");

        jLabel4.setText("Ürün Kategorisi");

        jLabel5.setText("Ürün Stoğu");

        jLabel6.setText("Ürün Alış Fiyatı");

        jLabel7.setText("Ürün Satış Fiyatı");

        jLabel8.setText("Satış Tarihi");

        satısÜrünAdı.setText("-");

        satısÜrünKategorisi.setText("-");

        satısÜrünStok.setText("-");

        satısÜrünAlısFiyatı.setText("-");

        satışSatısFiyatı.setText("-");

        satısSatısTarih.setText("-");

        satıslarSatısButton.setText("Satış Yap");
        satıslarSatısButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                satıslarSatısButtonActionPerformed(evt);
            }
        });

        jLabel9.setText("Satış Adedi :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(satısÜrünAdı, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(satısÜrünKategorisi, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(satısÜrünStok, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(satısÜrünAlısFiyatı, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(satışSatısFiyatı, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(satısSatısTarih, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel9)
                        .addGap(34, 34, 34)
                        .addComponent(satıslarSatısAdedi, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(satıslarSatısButton, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(159, 159, 159))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(satısÜrünAdı))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(satısÜrünKategorisi))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(satısÜrünStok)
                    .addComponent(jLabel9)
                    .addComponent(satıslarSatısAdedi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(satısÜrünAlısFiyatı))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(satışSatısFiyatı)
                    .addComponent(satıslarSatısButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(satısSatısTarih))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jLabel17.setText("Kazanç");

        satıslarToplamPara.setText("0");

        jLabel10.setText("Kar");

        satıslarKar.setText("0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(satıslarKar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(satıslarToplamPara, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(satıslarToplamPara)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(satıslarKar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        satıslarTablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        satıslarTablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                satıslarTabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(satıslarTablo);

        satıslarSıralama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                satıslarSıralamaKeyPressed(evt);
            }
        });

        satıslarGelismisSıralama.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ürün Kategorisine Göre", "Ürün Adına Göre", "Stok Miktarına Göre Düşükten Yükseğe", "Stok Miktarına Göre Yüksekten Düşüğe" }));
        satıslarGelismisSıralama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                satıslarGelismisSıralamaActionPerformed(evt);
            }
        });

        jLabel1.setText("Arama");

        jLabel2.setText("Gelişmiş Arama");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(satıslarSıralama, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(300, 300, 300)
                        .addComponent(jLabel2)
                        .addGap(57, 57, 57)
                        .addComponent(satıslarGelismisSıralama, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(satıslarSıralama, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(satıslarGelismisSıralama, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(148, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void satıslarTabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_satıslarTabloMouseClicked
        try {
            int row = satıslarTablo.getSelectedRow();
            String tableClick = (satıslarTablo.getModel().getValueAt(row, 0).toString());
            String sqlString = "select * from ürünler where id='" + tableClick + "'  ";
            prs = con.prepareStatement(sqlString);
            rs = prs.executeQuery();
            if (rs.next()) {
                String add1 = rs.getString("ürün_adi");
                satısÜrünAdı.setText(add1);
                String add2 = rs.getString("ürün_kategorisi");
                satısÜrünKategorisi.setText(add2);
                String add3 = rs.getString("ürün_stok");
                satısÜrünStok.setText(add3);
                String add4 = rs.getString("ürün_af");
                satısÜrünAlısFiyatı.setText(add4);
                String add5 = rs.getString("ürün_sf");
                satışSatısFiyatı.setText(add5);
                String add6 = rs.getString("tarih");
                satısSatısTarih.setText(add6);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_satıslarTabloMouseClicked

    private void satıslarSatısButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_satıslarSatısButtonActionPerformed
        try {

            String urun = satısÜrünAdı.getText();
            String geciciUrunAdeti = satısÜrünStok.getText();
            int gecici = Integer.parseInt(geciciUrunAdeti);
            String satilacakAdet = satıslarSatısAdedi.getText();
            int geciciSatilacakAdet = Integer.parseInt(satilacakAdet);

            int stokMiktar = Integer.parseInt(satısÜrünStok.getText());
            int satisMiktar = Integer.parseInt(satıslarSatısAdedi.getText());
            //Stok durumu kontrol
            if (satisMiktar > stokMiktar) {
                JOptionPane.showMessageDialog(null, "Stokta o kadar ürün yok\nStoktaki Ürün Adedi : " + stokMiktar, "Stok Yetersiz", NORMAL);

            } else {
                int kalanAdet = gecici - geciciSatilacakAdet;
                //-------------------------
                int satisFiyat = Integer.parseInt(satışSatısFiyatı.getText());
                int alisFiyat = Integer.parseInt(satısÜrünAlısFiyatı.getText());
                int satisMiktari = Integer.parseInt(satıslarSatısAdedi.getText());
                int ürünKari = (satisFiyat - alisFiyat) * satisMiktari;

                String query = ("update ürünler set ürün_stok='" + kalanAdet + "' where ürün_adi='" + urun + "'");
                st = con.createStatement();
                st.executeUpdate(query);

                String ekleSql = ("insert into satislar(satilan_ürün,satis_miktari,satis_tarihi,ürün_kari,satis_fiyati) "
                        + "values('" + satısÜrünAdı.getText() + "','" + satıslarSatısAdedi.getText() + "','" + satısSatısTarih.getText() + "','" + ürünKari + "','" + satisFiyat + "')");

                   // String ekleSql = ("insert into satislar(satilan_ürün,satis_miktari,satis_tarihi,satis_fiyati) "
                //       + "values('" + satısÜrünAdı.getText() + "','" + satısÜrünStok.getText() + "','"  + ",'" + satısSatısTarih.getText() + "','" + ürünKari + "','" + satışSatısFiyatı.getText() + "')");
                st = con.createStatement();
                st.executeUpdate(ekleSql);
                //Ürün Karlarını hesapla-yolla
                try {
                    String sql = "select sum(ürün_kari) from satislar where satis_tarihi='" + satısSatısTarih.getText() + "'";
                    prs = con.prepareStatement(sql);
                    rs = prs.executeQuery();
                    while (rs.next()) {
                        String result = rs.getString(1);
                        satıslarKar.setText(result + " TL");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                //Ürünlerin Satış Fiyatını Hesapla ve yolla
                try {
                    String sql = "select sum(satis_fiyati) from satislar where satis_tarihi='" + satısSatısTarih.getText() + "'";
                    prs = con.prepareStatement(sql);
                    rs = prs.executeQuery();
                    while (rs.next()) {
                        String result = rs.getString(1);
                        satıslarToplamPara.setText(result + " TL");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

                JOptionPane.showMessageDialog(null, "Ürün Satıldı", "Ürün Satıldı", ICONIFIED);
            }
            satısÜrünAdı.setText("-");
            satısÜrünKategorisi.setText("-");
            satısÜrünStok.setText("-");
            satısÜrünAlısFiyatı.setText("-");
            satışSatısFiyatı.setText("-");
            satısSatısTarih.setText("-");
            satıslarSatısAdedi.setText("");
            satıslarTablo();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ürün Satılamadı Lütfen Tekrar Deneyin", "Ürün Satılamadı", NORMAL);
            e.printStackTrace();
        }


    }//GEN-LAST:event_satıslarSatısButtonActionPerformed

    private void satıslarGelismisSıralamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_satıslarGelismisSıralamaActionPerformed
        String c = String.valueOf(satıslarGelismisSıralama.getSelectedItem());
        if (c == "Ürün Kategorisine Göre") {
            try {
                String sql = "select * from ürünler order by ürün_kategorisi asc";
                prs = con.prepareStatement(sql);
                rs = prs.executeQuery();
                satıslarTablo.setModel(DbUtils.resultSetToTableModel(rs));
                satıslarTablo.getColumnModel().getColumn(0).setMaxWidth(40);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        } else if (c == "Ürün Adına Göre") {
            try {
                String sql = "select * from ürünler order by ürün_adi asc";
                prs = con.prepareStatement(sql);
                rs = prs.executeQuery();
                satıslarTablo.setModel(DbUtils.resultSetToTableModel(rs));
                satıslarTablo.getColumnModel().getColumn(0).setMaxWidth(40);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        } else if (c == "Stok Miktarına Göre Düşükten Yükseğe") {
            try {
                String sql = "select * from ürünler order by ürün_stok asc";
                prs = con.prepareStatement(sql);
                rs = prs.executeQuery();
                satıslarTablo.setModel(DbUtils.resultSetToTableModel(rs));
                satıslarTablo.getColumnModel().getColumn(0).setMaxWidth(40);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        } else if (c == "Stok Miktarına Göre Yüksekten Düşüğe") {
            try {
                String sql = "select * from ürünler order by ürün_stok desc";
                prs = con.prepareStatement(sql);
                rs = prs.executeQuery();
                satıslarTablo.setModel(DbUtils.resultSetToTableModel(rs));
                satıslarTablo.getColumnModel().getColumn(0).setMaxWidth(40);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }

    }//GEN-LAST:event_satıslarGelismisSıralamaActionPerformed

    private void satıslarSıralamaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_satıslarSıralamaKeyPressed
        TableRowSorter<TableModel> sorter = new TableRowSorter<>((DefaultTableModel) satıslarTablo.getModel());
        sorter.setRowFilter(RowFilter.regexFilter(this.satıslarSıralama.getText()));
        satıslarTablo.setRowSorter(sorter);
        satıslarTablo();
    }//GEN-LAST:event_satıslarSıralamaKeyPressed

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
            java.util.logging.Logger.getLogger(Satıslar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Satıslar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Satıslar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Satıslar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Satıslar().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Satıslar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel satısSatısTarih;
    private javax.swing.JComboBox satıslarGelismisSıralama;
    private javax.swing.JLabel satıslarKar;
    private javax.swing.JTextField satıslarSatısAdedi;
    private javax.swing.JButton satıslarSatısButton;
    private javax.swing.JTextField satıslarSıralama;
    private javax.swing.JTable satıslarTablo;
    private javax.swing.JLabel satıslarToplamPara;
    private javax.swing.JLabel satısÜrünAdı;
    private javax.swing.JLabel satısÜrünAlısFiyatı;
    private javax.swing.JLabel satısÜrünKategorisi;
    private javax.swing.JLabel satısÜrünStok;
    private javax.swing.JLabel satışSatısFiyatı;
    // End of variables declaration//GEN-END:variables
}
