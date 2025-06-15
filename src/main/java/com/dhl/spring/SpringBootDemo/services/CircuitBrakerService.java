package com.dhl.spring.SpringBootDemo.services;

import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import io.github.resilience4j.circuitbreaker.CircuitBreakerRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class CircuitBrakerService {

    @io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker(name = "externalServiceCB", fallbackMethod = "fallbackMethod")
    public String callExternalService() {
        // simulate external service call
        if (new Random().nextBoolean()) {
            throw new RuntimeException("Service failed");
        }
        return "Success";
    }

    public String fallbackMethod(Throwable t) {
        return "Fallback response due to: " + t.getMessage();
    }

    @Autowired
    private CircuitBreakerRegistry circuitBreakerRegistry;

    public String callExternalApi() {
        // Get circuit breaker by name configured in application.properties
        CircuitBreaker circuitBreaker = circuitBreakerRegistry.circuitBreaker("externalServiceCB");

        /*// Decorate the supplier (any method call that might fail)
        Supplier<String> decoratedSupplier = CircuitBreaker.decorateSupplier(circuitBreaker, this::makeRemoteCall);

        // Handle result or fallback
        return Try.ofSupplier(decoratedSupplier)
                .recover(throwable -> "Fallback: " + throwable.getMessage())
                .get();*/
        return "Hitesh";
    }

    // Simulate a remote call (can be replaced with actual HTTP/WebClient call)
    private String makeRemoteCall() {
        if (Math.random() < 0.5) {
            throw new RuntimeException("Simulated service failure");
        }
        return "Remote call success";
    }

}
