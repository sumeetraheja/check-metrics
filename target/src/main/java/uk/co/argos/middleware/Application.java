package uk.co.argos.middleware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Main Class
 */
@SpringBootApplication
@ComponentScan({"uk.co.argos.middleware"})
public class Application {
    /**
     * Entry point for application.
     *
     * @param args The command line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
