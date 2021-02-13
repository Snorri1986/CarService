package dbo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;


/**
 * Description: Class of user entity for store data into database
 * @autor Denys Shabelnyk
 * @since 0.3.1.4
 */
public class DataBaseProvider {

    //Logger instance
    private static final Logger log = LoggerFactory.getLogger(DataBaseProvider.class);
    // ... //

    @Autowired
    JdbcTemplate jdbao;

    // Get name of user from DB
    public void run(String ... strings) throws Exception {

        log.info("Get all user");

        // TODO: write query
        /*jdbao.query(

        );*/
    }
}
