package DAO;


import AbstractDal.JDBCBaglanti;
import DAO.Veritabanı;
import com.mysql.jdbc.StringUtils;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

final public class SatıslarDAO extends JDBCBaglanti {


    public SatıslarDAO() throws SQLException {
        try {
            veritabanı = new Veritabanı();
            connection = veritabanı.getConnection();
            System.out.println("Bağlantı Başarılı.");
        } catch (SQLException exception) {
            veritabanı.showErrorMessage(exception);
        }
    }

    
     
      
      

    @Override
    public String connectionStatus() throws SQLException {
        if(connection.isClosed() == false)
            return "Bağlı Değil\n";

        else
            return "Bağlı\n";
    }
}
