package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.Alerta;
import io.swagger.model.Alertas;


import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import javax.validation.constraints.*;
import java.util.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-25T22:45:18.025Z[GMT]")

public class AlertaApiServiceImpl extends AlertaApiService {
    
    static Map<String, List<Alerta>> alertMap = new HashMap<String, List<Alerta>>();
    int numberControl = 0;
    
    @Override
    public Response alertaDelete( @NotNull String usuarioId,  @NotNull String notificacionId, SecurityContext securityContext) throws NotFoundException {
        System.out.println("DEL");
        if (alertMap.containsKey(usuarioId)) {
            List<Alerta> aux = alertMap.get(usuarioId);        
            for (int i = 0; i < aux.size(); i++) {
                if (aux.get(i).getAlertaId().equals(notificacionId)) {
                    aux.remove(i);
                    System.out.println("Borro");
                    
                }
            }
            alertMap.put(usuarioId,aux);
            return Response.ok().entity(alertMap.get(usuarioId).toString()).build();
        }
        else
            return Response.status(404).build();
    }
    
    @Override
    public Response alertaGet(String usuarioId, SecurityContext securityContext) throws NotFoundException {
        System.out.println("GET");
        System.out.println(usuarioId);
        if (alertMap.containsKey(usuarioId))
            return Response.ok().entity(alertMap.get(usuarioId).toString()).build();
        else
            return Response.status(404).build();
    }
    
    @Override
    public Response alertaPost(Alerta body, SecurityContext securityContext) throws NotFoundException {
        System.out.println("POST");
        numberControl++;
        body.setAlertaId("AL"+numberControl);
        List<Alerta> aux;
        if (alertMap.containsKey(body.getUsuarioId())) 
            aux = alertMap.get(body.getUsuarioId());        
        else 
            aux = new ArrayList<Alerta>();
        aux.add(body); 
        alertMap.put(body.getUsuarioId(),aux);
        return Response.ok().entity(body.toString()).build();
    }
    
    @Override
    public Response alertaPut(Alerta body, SecurityContext securityContext) throws NotFoundException {
        System.out.println("PUT");
        if (alertMap.containsKey(body.getUsuarioId())){
            List<Alerta> aux = alertMap.get(body.getUsuarioId());        
            for (int i = 0; i < aux.size(); i++) {
                if (aux.get(i).getAlertaId().equals(body.getAlertaId())) {
                    aux.remove(i);
                    aux.add(body);
                }
            }
            alertMap.put(body.getUsuarioId(),aux);
            return Response.ok().entity(alertMap.get(body.getUsuarioId()).toString()).build();
        }
        else
            return Response.status(404).build();
    }
    
}

