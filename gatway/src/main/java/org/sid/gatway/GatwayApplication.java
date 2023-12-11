package org.sid.gatway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatwayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatwayApplication.class, args);
    }






   // @Bean
   // public RouteLocator routes(RouteLocatorBuilder builder) {
     //   return builder.routes()
       //         .route(r -> r.path("/customers/**").uri("lb://CUSTOMER-SERVICE"))
         //       .route(r -> r.path("/products/**").uri("lb://INVENTORY-SERVICE"))
           //     .build();
    //}


}
