package SwingUI;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AnaSayfa extends javax.swing.JFrame {

    public AnaSayfa(){

        initComponents();
        //this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        raporlarBtn = new javax.swing.JButton();
        ürünGüncelleBtn = new javax.swing.JButton();
        kullanicilarBtn = new javax.swing.JButton();
        satışYapBtn = new javax.swing.JButton();
        ürünEkleBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        ürünlerGösterButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Anasayfa\n");

        raporlarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/printSmall.png"))); // NOI18N
        raporlarBtn.setText("Raporlar");
        raporlarBtn.setPreferredSize(new java.awt.Dimension(72, 32));
        raporlarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raporlarBtnActionPerformed(evt);
            }
        });

        ürünGüncelleBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reload.png"))); // NOI18N
        ürünGüncelleBtn.setText("Ürün Güncelle");
        ürünGüncelleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ürünGüncelleBtnActionPerformed(evt);
            }
        });

        kullanicilarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/kullanıcıekle.png"))); // NOI18N
        kullanicilarBtn.setText("Kullanıcılar");
        kullanicilarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullanicilarBtnActionPerformed(evt);
            }
        });

        satışYapBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/satış.png"))); // NOI18N
        satışYapBtn.setText("Satış Yap");
        satışYapBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                satışYapBtnActionPerformed(evt);
            }
        });

        ürünEkleBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ürünekle.png"))); // NOI18N
        ürünEkleBtn.setText("Ürün Ekle");
        ürünEkleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ürünEkleBtnActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ürünsil.png"))); // NOI18N
        jButton1.setText("Ürün Sil");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Stok Biten Ürünler");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        ürünlerGösterButton.setText("Ürünler");
        ürünlerGösterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ürünlerGösterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ürünEkleBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ürünGüncelleBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(88, 88, 88)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(raporlarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(satışYapBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(174, 174, 174))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(ürünlerGösterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kullanicilarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(raporlarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ürünEkleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(ürünGüncelleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(kullanicilarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(satışYapBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ürünlerGösterButton))
                        .addGap(121, 121, 121))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jMenu2.setText("File");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Hakkımda");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ürünEkleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ürünEkleBtnActionPerformed

        try {
            ÜrünEkle ürünEkle = new ÜrünEkle();
            ürünEkle.setVisible(true);
            ürünEkle.setDefaultCloseOperation(ÜrünEkle.DISPOSE_ON_CLOSE);
        } catch (SQLException ex) {
            Logger.getLogger(AnaSayfa.class.getName()).log(Level.SEVERE, null, ex);
        }
        


    }//GEN-LAST:event_ürünEkleBtnActionPerformed

    private void ürünGüncelleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ürünGüncelleBtnActionPerformed
        try {
            ÜrünGüncelleme ürünGüncelleme = new ÜrünGüncelleme();
            ürünGüncelleme.setVisible(true);
            ürünGüncelleme.setDefaultCloseOperation(ÜrünGüncelleme.DISPOSE_ON_CLOSE);
        } catch (SQLException ex) {
            Logger.getLogger(AnaSayfa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ürünGüncelleBtnActionPerformed

    private void kullanicilarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullanicilarBtnActionPerformed
       Kullanıcılar kullanıcılar = new Kullanıcılar();
       kullanıcılar.setVisible(true);
       kullanıcılar.setDefaultCloseOperation(Kullanıcılar.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_kullanicilarBtnActionPerformed

    private void satışYapBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_satışYapBtnActionPerformed
        try {
            Satıslar satıslar = new Satıslar();
            satıslar.setVisible(true);
            satıslar.setDefaultCloseOperation(Satıslar.DISPOSE_ON_CLOSE);
        } catch (SQLException ex) {
            Logger.getLogger(AnaSayfa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_satışYapBtnActionPerformed

    private void raporlarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raporlarBtnActionPerformed
        try {
            Raporlar raporlar = new Raporlar();
            raporlar.setVisible(true);
            raporlar.setDefaultCloseOperation(Raporlar.DISPOSE_ON_CLOSE);
        } catch (SQLException ex) {
            Logger.getLogger(AnaSayfa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_raporlarBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            ÜrünSil ürünSil = new ÜrünSil();
            ürünSil.setVisible(true);
            ürünSil.setDefaultCloseOperation(ÜrünSil.DISPOSE_ON_CLOSE);
        } catch (SQLException ex) {
            Logger.getLogger(AnaSayfa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        StoğuBitenÜrünler stoğuBitenÜrünler = new StoğuBitenÜrünler();
        stoğuBitenÜrünler.setVisible(true);
        stoğuBitenÜrünler.setDefaultCloseOperation(StoğuBitenÜrünler.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Hakkımda hakkımda = new Hakkımda();
        hakkımda.setVisible(true);
        hakkımda.setDefaultCloseOperation(Hakkımda.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void ürünlerGösterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ürünlerGösterButtonActionPerformed
        try {
            Ürünler ürünler = new Ürünler();
            ürünler.setVisible(true);
            ürünler.setDefaultCloseOperation(Ürünler.DISPOSE_ON_CLOSE);
        } catch (SQLException ex) {
            Logger.getLogger(AnaSayfa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ürünlerGösterButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AnaSayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnaSayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnaSayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnaSayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnaSayfa().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton kullanicilarBtn;
    private javax.swing.JButton raporlarBtn;
    private javax.swing.JButton satışYapBtn;
    private javax.swing.JButton ürünEkleBtn;
    private javax.swing.JButton ürünGüncelleBtn;
    private javax.swing.JButton ürünlerGösterButton;
    // End of variables declaration//GEN-END:variables
}
