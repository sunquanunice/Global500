package com.sunquan.global500.services;


import org.json.simple.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by SUN on 24/05/2016.
 */
@Path("/test")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorldService {

    @GET
    public Response helloWorld() {
        return Response.status(Response.Status.OK).entity("Hello World").build();
    }
}
