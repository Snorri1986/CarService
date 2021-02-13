/**
 * @author: Denys Shabelnyk
 * @version: 0.1.2
 */

package svs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class CarServiceApplication extends SpringBootServletInitializer {

    /**
     * @author: Denys Shabelnyk
     * @since 0.1.2
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
         return application.sources(CarServiceApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(CarServiceApplication.class,args);
    }
}

