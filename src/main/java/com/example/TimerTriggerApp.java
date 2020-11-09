package com.example;

import com.example.model.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class TimerTriggerApp {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(TimerTriggerApp.class, args);
    }

    // The Bean name must match the function name. By default, it uses the method name as the Bean name.
    @Bean
    public Function<Item, ProcessedItem> processItem() {
        return item -> new ProcessedItem("Processed Item: " + item.getName());
    }
}
