package proxy.logger;


import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
    public List<HashMap<String, String>> select(String query) {
        List<HashMap<String, String>> results = new ArrayList<>();
        try {
            ResultSet rs = connect().executeQuery(query);
            ResultSetMetaData resultSetMetaData = rs.getMetaData();
            while (rs.next()) {
                HashMap<String, String> row = new HashMap<>();
                for (int i = 1; i <= resultSetMetaData.getColumnCount(); i++) {
                    row.put(resultSetMetaData.getColumnName(i), rs.getString(i));
                }
                results.add(row);
            }
        } catch (SQLException e) {
            System.out.println("Cant execute query " + query);
        }
        return results;
    }

    @Override
    public void update(String query) {
        try {
            connect().executeUpdate(query);
        } catch (SQLException e) {
            System.out.println("Cant execute query: " + query);
        }
    }

    @Override
    public void delete(String query) throws SQLException {
        connect().executeQuery(query);
    }
}



