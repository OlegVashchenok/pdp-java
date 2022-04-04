package proxy.logger;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

public interface DataBaseQuery {

    List<HashMap<String, String>> select(String query) throws SQLException;

    void update(String query) throws SQLException;

    void delete(String query) throws SQLException;
}
