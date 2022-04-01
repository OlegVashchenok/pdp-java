package proxy;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface DataBaseQuery {

    ResultSet select(String query) throws SQLException;

    void update(String query) throws SQLException;

    void delete(String query) throws SQLException;
}
