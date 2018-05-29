package uk.co.argos.middleware.kafka.routes.configs;

import lombok.extern.slf4j.Slf4j;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.*;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import uk.co.argos.middleware.kafka.routes.IntRouteBuilder;

/**
 * This class will contain Camel Specific Beans
 */
@Component
@EnableAutoConfiguration()
@Slf4j


public class CamelConfig {

    @Bean()
    public RouteBuilder intRouteBuilder() {
        return new IntRouteBuilder();
    }


//    @Bean
//    @DependsOn({"propertySourcesPlaceholderConfigurer"})
//    public static PropertyPlaceholderConfigurer propertySourcesPlaceholderConfigurer1() {
//        PropertyPlaceholderConfigurer ppc
//                = new PropertyPlaceholderConfigurer();
//        ppc.setLocalOverride(true);
//        Resource[] resources = new ClassPathResource[]
//                {
//                        new ClassPathResource( "/application.properties" ),
//                        new ClassPathResource( "/override-application.properties" ),
//                        new ClassPathResource( "/application.yml" )
//
//                };
//        ppc.setLocations( resources );
//        ppc.setIgnoreUnresolvablePlaceholders( true );
//        System.setProperties(ppc.);
//        return ppc;
//    }

}
