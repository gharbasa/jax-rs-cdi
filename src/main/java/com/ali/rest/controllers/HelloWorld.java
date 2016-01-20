package com.ali.rest.controllers;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/helloworld")
public class HelloWorld {

	// The Java method will process HTTP GET requests
    @GET
    // The Java method will produce content identified by the MIME Media
    // type "text/plain"
    @Produces("text/plain")
    @Path("/{param}")
    public String getClichedMessage(@PathParam("param") String msg) {
        // Return some cliched textual content
        return "Hello World - " + msg;
    }
    
    @PUT
    @Consumes("application/json")
    @Produces("text/plain")
    @Path("/{param}")
    public Response postMessage(@PathParam("param") String msg, String payload) {
        // Return some cliched textual content
    	String output = "Hello World - " + msg  + ", payload=" + payload; 
    	return Response.status(200).entity(output).build();
    }
}
