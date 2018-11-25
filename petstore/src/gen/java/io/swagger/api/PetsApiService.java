package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.Error;
import io.swagger.model.Pets;


import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import javax.validation.constraints.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-25T21:57:40.709Z[GMT]")

public abstract class PetsApiService {
    
    public abstract Response createPets(SecurityContext securityContext) throws NotFoundException;
    
    public abstract Response listPets( Integer limit,SecurityContext securityContext) throws NotFoundException;
    
    public abstract Response showPetById(String petId,SecurityContext securityContext) throws NotFoundException;
    
}

