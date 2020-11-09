# Example Spring Boot application that runs on Azure Functions

This is a sample application to showcase the use of Spring Cloud Function on top of Azure Functions with a Timer Trigger.

## References

- [Spring Cloud Functions in Azure](https://docs.microsoft.com/en-us/azure/developer/java/spring-framework/getting-started-with-spring-cloud-function-in-azure)
- [Azure Functions Timer Trigger](https://docs.microsoft.com/en-us/azure/azure-functions/functions-bindings-timer?tabs=java)

## Build tool

This example uses __Maven__ to build the application:
 
- It uses the Azure Functions Plugin for Maven, documented at [https://github.com/microsoft/azure-maven-plugins/tree/develop/azure-functions-maven-plugin](https://github.com/microsoft/azure-maven-plugins/tree/develop/azure-functions-maven-plugin)

## Features

This is a simple timer trigger, but it uses domain objects so it's easy to extend to do something more complex.

## Getting Started

### Prerequisites

This project uses the Maven Wrapper, so all you need is Java installed.

### Quickstart

- Configure the project to use your own resource group and your own application name (it should be unique across Azure)
  - Open the `pom.xml` file and set the following properties
    - `functionResourceGroup`
    - `functionAppName`
    - `functionAppRegion`
  - Include an Azure Storage connection string in the `local.settings.json`
    - `AzureWebJobsStorage`
- Build the project: `./mvnw clean package`
- Run the project: `./mvnw azure-functions:run`

## Deploying to Azure Functions

Deploy the application on Azure Functions with the Azure Function Maven plug-in:

`./mvnw azure-functions:deploy`