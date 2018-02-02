package chaptersix.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class JdbcSpitterDao implements SpitterDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Qualifier("dataSource")
    private DataSource dataSource;
/*


    private static final String SQL_INSERT_SPITTER =
            "insert into spitter(username, password, fullname, email, update_by_email) values(?, ?, ?, ?, ?)";
    public void addSpitter(Spitter spitter) {
        jdbcTemplate.update(SQL_INSERT_SPITTER,
                spitter.getUsername(),
                spitter.getPassword(),
                spitter.getFullName(),
                spitter.getEmail(),
       spitter.setId(queryForIdentity());

    private static final String SQL_INSERT_SPITTER = "insert into spitter (username, password, fullname) " +
                    "values(:username, :password, :fullname)";

    public void addSpitter(Spitter spitter) {
        Map<String, Object> params = new HashMap <String, Object>();
        params.put("username", spitter.getUsername());
        params.put("password", spitter.getPassword());
        params.put("fullname", spitter.getFullName());

        jdbcTemplate.update(SQL_INSERT_SPITTER, params);

    }
*/



}
