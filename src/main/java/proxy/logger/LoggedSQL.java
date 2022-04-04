package proxy.logger;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

public class LoggedSQL implements DataBaseQuery {

    private static Sql sql;

    public LoggedSQL() {
        sql = new Sql();
    }


    @Override
    public List<HashMap<String, String>> select(String query) throws SQLException {
        System.out.println("Execute select query: " + query);
        return sql.select(query);
    }

    @Override
    public void update(String query) throws SQLException {
        System.out.println("Execute update query: " + query);
        sql.update(query);
    }

    @Override
    public void delete(String query) throws SQLException {
        System.out.println("Execute delete query: " + query);
        sql.delete(query);
    }
}
