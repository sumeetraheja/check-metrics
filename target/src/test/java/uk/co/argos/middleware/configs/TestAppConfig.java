package uk.co.argos.middleware.configs;


import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * This class will hold Application Specific Beans
 */
@Configuration
@EnableConfigurationProperties
@PropertySource("classpath:application.yml")
public class TestAppConfig {


}
