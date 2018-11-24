package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.Alerta;
import io.swagger.model.Alertas;
import io.swagger.model.TodasAlertas;


import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import javax.validation.constraints.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-24T16:46:54.821Z[GMT]")

public abstract class AlertasApiService {
    
    public abstract Response actualizarAlerta(List<Alerta> body,SecurityContext securityContext) throws NotFoundException;
    
    public abstract Response alertasPost(Object body,SecurityContext securityContext) throws NotFoundException;
    
    public abstract Response borrarAlerta( @NotNull String usuarioId, @NotNull String notificacionId,SecurityContext securityContext) throws NotFoundException;
    
    public abstract Response obtenerAlertas( String usuarioId,SecurityContext securityContext) throws NotFoundException;
    
}

