package proxy.cach;

import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.core.mapper.reflect.ConstructorMapper;

import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class SQL {

    private static final Logger LOG = Logger.getGlobal();

    private static final String url = "jdbc:mysql://localhost:3306/bodyfit";
    private static final String user = "root";
    private static final String password = "root";

    private static Jdbi connect() {
        return Jdbi.create(url, user, password);
    }

    public static List<Map<String, Object>> select(String query) {
        try (var handle = connect().open()) {
            return handle.createQuery(query).mapToMap().list();
        }
    }

    public static <T> List<T> select(String query, Class<T> clazz) {
        try (var handle = connect().open()) {
            handle.registerRowMapper(ConstructorMapper.factory(clazz));
            LOG.info("Запит в бд");
            return handle.createQuery(query).mapTo(clazz).list();
        }
    }

}
