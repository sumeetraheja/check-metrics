package uk.co.argos.middleware.kafka.routes;


import org.apache.camel.builder.RouteBuilder;
import org.apache.commons.text.RandomStringGenerator;

import java.util.Random;

/**
 * Routing Class which Orchestrate Request Flow
 */
public class IntRouteBuilder extends RouteBuilder {


    /**
     * <b>Called on initialization to build the routes using the fluent builder syntax.</b>
     * <p>
     * This is a central method for RouteBuilder implementations to implement
     * the routes using the Java fluent builder syntax.
     *
     * @throws Exception can be thrown during configuration
     */


    private RandomStringGenerator generator = new RandomStringGenerator.Builder()
            .withinRange('a', 'z')
            .build();
    private Random rn = new Random();
    private int range = 500  ;

    private  Integer i = 0 ;

    @Override
    public void configure() throws Exception {

//        from("timer://bar?fixedRate=true&period=600").routeId("timer-route")
//                .to("direct:mainFlow");

        from("servlet:/checkmetric?httpMethodRestrict=GET")
                //.loop(simple("${header.count}"))
                .loop(header("hit"))
                .process(exchange -> {
                    exchange.getIn().setBody("OK");


                })
                .log("Counter:" +"${property.CamelLoopIndex}")
                .to("direct:mainFlow") ;

        from("direct:mainFlow").routeId("mainFlow")
                .choice()
                .when(header("flow").endsWith("sub"))
                .to("direct:subFlow")

                .when(header("delay").isNotNull())
                .log("Adding Delay: ${header.delay} ms ")
                .delay(header("delay"))
                .endChoice()
        ;

        from("direct:subFlow").routeId("subFlow")
                .delay(10 * generateInt()) ;

    }

    public  int generateInt() {
        return rn.nextInt(range) + 20;
    }

    public boolean getRandomBoolean() {
        Random random = new Random();
        return random.nextBoolean();
    }
}