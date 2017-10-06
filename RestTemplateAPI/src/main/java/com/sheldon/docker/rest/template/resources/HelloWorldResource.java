package com.sheldon.docker.rest.template.resources;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;

@Path("/")
public class HelloWorldResource {

    @Context
    HttpServletRequest httpServletRequest;

    @GET
    @Path("/hello-world")
    @Produces(MediaType.APPLICATION_JSON)
    public Response helloWorld() {
        return Response.status(Response.Status.OK).entity(new HashMap<String, String>() {
            {
                put("message", "Hello-World!");
            }
        }).build();
    }
}
