package DAO;


import AbstractDal.JDBCBaglanti;
import DAO.Veritabanı;
import com.mysql.jdbc.StringUtils;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

final public class ÜrünlerDAO extends JDBCBaglanti {


    public ÜrünlerDAO() throws SQLException {
        try {
            veritabanı = new Veritabanı();
            connection = veritabanı.getConnection();
            System.out.println("Bağlantı Başarılı.");
        } catch (SQLException exception) {
            veritabanı.showErrorMessage(exception);
        }
    }

    public void ürünEkle(String ürün_adı, String ürün_kategorisi, String ürün_stok, String ürün_alış_fiyatı, String ürün_satış_fiyatı,String tarih) {
        
        String sorgu = "Insert Into ürünler (ürün_adi,ürün_kategorisi,ürün_stok,ürün_af,ürün_sf,tarih ) VALUES(?,?,?,?,?,?)";
        
        try {   
            preparedStatement = connection.prepareStatement(sorgu);
            
            
            preparedStatement.setString(1, ürün_adı);
            preparedStatement.setString(2, ürün_kategorisi);
            preparedStatement.setString(3, ürün_stok);
            preparedStatement.setString(4, ürün_alış_fiyatı);
            preparedStatement.setString(5, ürün_satış_fiyatı);
            preparedStatement.setString(6, tarih);
            
            preparedStatement.executeUpdate();
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ÜrünlerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void ürünGüncelle(int id ,String ürün_adı, String ürün_kategorisi, String ürün_stok, String ürün_alış_fiyatı, String ürün_satış_fiyatı) {
        
        String sorgu = "Update ürünler set ürün_adi = ?,ürün_kategorisi = ?,ürün_stok = ?,ürün_af = ?,ürün_sf = ? where id = ?";
        
        try {
            preparedStatement = connection.prepareStatement(sorgu);
            
            
            preparedStatement.setString(1, ürün_adı);
            preparedStatement.setString(2, ürün_kategorisi);
            preparedStatement.setString(3, ürün_stok);
            preparedStatement.setString(4, ürün_alış_fiyatı);
            preparedStatement.setString(5, ürün_satış_fiyatı);
               preparedStatement.setInt(6, id);
               
               
            preparedStatement.executeUpdate();
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ÜrünlerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void ürünSil(int id ,String ürün_adı, String ürün_kategorisi, String ürün_stok, String ürün_alış_fiyatı, String ürün_satış_fiyatı) {
        
        String sorgu = "Delete from ürünler where id = ?";
        
        try {
            preparedStatement = connection.prepareStatement(sorgu);
            
           
            preparedStatement.setInt(1, id);
               
               
            preparedStatement.executeUpdate();
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ÜrünlerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
     
      
      

    @Override
    public String connectionStatus() throws SQLException {
        if(connection.isClosed() == false)
            return "Not Connected\n";

        else
            return "Connected\n";
    }
}
