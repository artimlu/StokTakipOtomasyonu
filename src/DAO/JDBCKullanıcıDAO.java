package DAO;

import AbstractDal.JDBCBaglanti;
import com.mysql.jdbc.StringUtils;

import java.sql.SQLException;


final public class JDBCKullanıcıDAO extends JDBCBaglanti {


    public JDBCKullanıcıDAO() throws SQLException {
        try {
            veritabanı = new Veritabanı();
            connection = veritabanı.getConnection();
            System.out.println("Bağlantı Başarılı.");
        } catch (SQLException exception) {
            veritabanı.showErrorMessage(exception);
        }
    }

    public boolean kullanıcı_var_mı(String kullanıcıAdı, String kullanıcıSifre) throws SQLException {
        if (StringUtils.isEmptyOrWhitespaceOnly(kullanıcıAdı) || StringUtils.isEmptyOrWhitespaceOnly(kullanıcıSifre)) {
            return false;
        }
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select kullanici_adi,kullanici_sifre from kullanici_giris");
            while (resultSet.next()) {
                if (kullanıcıAdı.equals(resultSet.getString("kullanici_adi")) && kullanıcıSifre.equals(resultSet.getString("kullanici_sifre"))) {
                    return true;
                }
            }
            return false;
        } catch (SQLException exception) {
            veritabanı.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
        return false;
    }

    @Override
    public String connectionStatus() throws SQLException {
        if(connection.isClosed() == false)
            return "Bağlı Değil\n";

        else
            return "Bağlı \n";
    }
}
