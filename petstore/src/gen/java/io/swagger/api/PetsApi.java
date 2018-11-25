package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.PetsApiService;
import io.swagger.api.factories.PetsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.Error;
import io.swagger.model.Pets;


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


@Path("/pets")


@io.swagger.annotations.Api(description = "the pets API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-25T21:57:40.709Z[GMT]")

public class PetsApi  {
   private final PetsApiService delegate;

   public PetsApi(@Context ServletConfig servletContext) {
      PetsApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("PetsApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (PetsApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = PetsApiServiceFactory.getPetsApi();
      }

      this.delegate = delegate;
   }


    @POST
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create a pet", notes = "", response = Void.class, tags={ "pets", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Null response", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Error.class) })
    public Response createPets(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createPets(securityContext);
    }

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List all pets", notes = "", response = Pets.class, tags={ "pets", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "A paged array of pets", response = Pets.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Error.class) })
    public Response listPets(@ApiParam(value = "How many items to return at one time (max 100)") @QueryParam("limit") Integer limit
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listPets(limit,securityContext);
    }

    @GET
    @Path("/{petId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Info for a specific pet", notes = "", response = Pets.class, tags={ "pets", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Expected response to a valid request", response = Pets.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Error.class) })
    public Response showPetById(@ApiParam(value = "The id of the pet to retrieve",required=true) @PathParam("petId") String petId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.showPetById(petId,securityContext);
    }

}

