package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.Alerta;
import io.swagger.model.Alertas;


import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import javax.validation.constraints.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-25T22:45:18.025Z[GMT]")

public abstract class AlertaApiService {
    
    public abstract Response alertaDelete( @NotNull String usuarioId, @NotNull String notificacionId,SecurityContext securityContext) throws NotFoundException;
    
    public abstract Response alertaGet( String usuarioId,SecurityContext securityContext) throws NotFoundException;
    
    public abstract Response alertaPost(Alerta body,SecurityContext securityContext) throws NotFoundException;
    
    public abstract Response alertaPut(Alerta body,SecurityContext securityContext) throws NotFoundException;
    
}

