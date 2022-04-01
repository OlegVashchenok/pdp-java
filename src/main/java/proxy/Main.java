package proxy;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        String query = "SELECT * FROM locale";
        var sql = new LoggedSQL();
        ResultSet rs = sql.select(query);
        while (rs.next())
            System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
    }
}
