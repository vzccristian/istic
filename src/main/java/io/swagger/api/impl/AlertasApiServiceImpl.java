package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.TodasAlertas;


import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import javax.validation.constraints.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-25T22:45:18.025Z[GMT]")

public class AlertasApiServiceImpl extends AlertasApiService {
    
    @Override
    public Response alertasGet(SecurityContext securityContext) throws NotFoundException {
        System.out.println(AlertaApiServiceImpl.alertMap);
        return Response.ok().entity(AlertaApiServiceImpl.alertMap).build();
    }
    
}

