package io.swagger.api.factories;

import io.swagger.api.AlertaApiService;
import io.swagger.api.impl.AlertaApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-24T17:27:27.196Z[GMT]")
public class AlertaApiServiceFactory {
    private final static AlertaApiService service = new AlertaApiServiceImpl();

    public static AlertaApiService getAlertaApi() {
        return service;
    }
}
