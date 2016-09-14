package com.ganesha.resources;



import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by bhargav.naik on 13/09/16.
 */

@Path("/v1/user")
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {

    @GET
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response getUser(@PathParam("id") String id){
        return Response.ok().entity(String.format("You asked for user with id :: %s", id)).build();
    }

}
