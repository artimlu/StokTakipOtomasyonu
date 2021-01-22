package AbstractDal;

import DAO.Veritabanı;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public abstract class JDBCBaglanti {

    public Connection connection;
    public Veritabanı veritabanı;
    public Statement statement;
    public ResultSet resultSet;
    public PreparedStatement preparedStatement;

    public abstract String connectionStatus() throws SQLException;
}
