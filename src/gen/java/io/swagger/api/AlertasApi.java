package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.AlertasApiService;
import io.swagger.api.factories.AlertasApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.Alerta;
import io.swagger.model.Alertas;
import io.swagger.model.TodasAlertas;


import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

import javax.validation.constraints.*;


@Path("/alertas")


@io.swagger.annotations.Api(description = "the alertas API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-24T16:46:54.821Z[GMT]")

public class AlertasApi  {
   private final AlertasApiService delegate;

   public AlertasApi(@Context ServletConfig servletContext) {
      AlertasApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("AlertasApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (AlertasApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = AlertasApiServiceFactory.getAlertasApi();
      }

      this.delegate = delegate;
   }


    @PUT
    
    @Consumes({ "application/json" })
    @Produces({ "application/json", "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "Actualizar alerta almacenada.", notes = "Actualizar una alerta almacenada.", response = Alertas.class, tags={ "alertas", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Alerta actualizada correctamente.", response = Alertas.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Error al actualizar alerta.", response = String.class) })
    public Response actualizarAlerta(@ApiParam(value = "" ) List<Alerta> body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.actualizarAlerta(body,securityContext);
    }

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "Agregar alerta de usuario.", notes = "Agregar alerta para un usuario usuario.", response = String.class, tags={ "alertas", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Alerta registrada correctamente. Devuelve ID de alerta.", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Error al insertar la alerta.", response = String.class) })
    public Response alertasPost(@ApiParam(value = "" ) Object body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.alertasPost(body,securityContext);
    }

    @DELETE
    
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "Borra una alerta", notes = "Borra una notificación especifica", response = String.class, tags={ "alertas", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "El borrado se ha realizado correctamente", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "La alerta no ha sido borrada", response = String.class) })
    public Response borrarAlerta(@ApiParam(value = "ID del usuario",required=true) @QueryParam("usuarioId") String usuarioId
,@ApiParam(value = "Identificador de la notificacion",required=true) @QueryParam("notificacionId") String notificacionId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.borrarAlerta(usuarioId,notificacionId,securityContext);
    }

    @GET
    
    
    @Produces({ "application/json", "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "Obtener todas las alertas de un usuario.", notes = "Obtener todas las alertas de un usuario.", response = Alertas.class, tags={ "alertas", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Array de alertas correspondientes al usuario", response = Alertas.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Error al obtener la alerta.", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Array de alertas para todos los usuarios.", response = TodasAlertas.class) })
    public Response obtenerAlertas(@ApiParam(value = "Devuelve todas las alertas del usuario en la ID dada.") @QueryParam("usuarioId") String usuarioId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.obtenerAlertas(usuarioId,securityContext);
    }

}

