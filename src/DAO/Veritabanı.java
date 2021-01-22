package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Veritabanı {
    
    private final String userName="root";
    private final String password = "";
    private final String dbUrl = "jdbc:mysql://localhost:3306/stoktakipotomasyonu";
    
    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection(dbUrl,userName,password);
    }
    
    public void showErrorMessage(SQLException exception){
        System.out.println("Hata : " + exception.getMessage());
        System.out.println("Hata Kodu: "+ exception.getErrorCode());
    }
    
}