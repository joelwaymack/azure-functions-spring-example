package com.example;

import com.example.model.*;
import com.microsoft.azure.functions.*;
import com.microsoft.azure.functions.annotation.AuthorizationLevel;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.TimerTrigger;
import org.springframework.cloud.function.adapter.azure.AzureSpringBootRequestHandler;

import java.util.Optional;

public class TimerTriggerHandler extends AzureSpringBootRequestHandler<Item, ProcessedItem> {
        
        // The function name must match the Bean name.
        @FunctionName("processItem")
        public void execute(
                @TimerTrigger(name = "processItemTimerTrigger", schedule = "*/5 * * * * *") String timerInfo,
                ExecutionContext context) {
                Item item = new Item("Plane");

                // Executes the Spring Boot Bean function.
                ProcessedItem processedItem = handleRequest(item, context);

                context.getLogger().info(processedItem.getMessage());
        }
}
