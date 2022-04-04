package proxy.logger;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        String query = "SELECT * FROM locale";
        LoggedSQL sql = new LoggedSQL();
        List<HashMap<String, String>> rs = sql.select(query);
        System.out.println(rs);
    }
}