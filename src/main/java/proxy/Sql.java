package proxy;


import java.sql.*;

public class Sql implements DataBaseQuery {

    private static final String url = "jdbc:mysql://localhost:3306/bodyfit";
    private static final String user = "root";
    private static final String password = "root";

    private static Statement stmt;

    public Sql() {

    }

    private static Statement connect() {
        try {
            stmt = DriverManager.getConnection(url, user, password).createStatement();
        } catch (Exception e) {
            System.out.println("Cant connect");
        }
        return stmt;
    }


    @Override
    public ResultSet select(String query) throws SQLException {
        return connect().executeQuery(query);
    }

    @Override
    public void update(String query) throws SQLException {
        connect().executeUpdate(query);
    }

    @Override
    public void delete(String query) throws SQLException {
        connect().executeQuery(query);
    }
}



