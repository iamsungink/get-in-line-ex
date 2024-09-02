package com.uno.getinlineex.controller.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

import java.util.List;

import static org.springframework.web.servlet.function.RouterFunctions.route;

@Configuration
public class APIPlaceRouter {

    @Bean
    public RouterFunction<ServerResponse> placeRouter() {
        return route()
                .GET("/api/places", request -> ServerResponse.ok().body(List.of("place1", "place2")))
                .POST("/api/places", request -> ServerResponse.ok().body(true))
                .GET("/api/places/{placeId}", request -> ServerResponse.ok().body("place " + request.pathVariable("placeId")))
                .PUT("/api/places/{placeId}", request -> ServerResponse.ok().body(true))
                .DELETE("/api/places/{placeId}", request -> ServerResponse.ok().body(true))
                .build();
    }
}
