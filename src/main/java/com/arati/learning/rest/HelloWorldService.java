package com.arati.learning.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

@Path("/hello")
public class HelloWorldService {

	@GET
	@Path("input/{param}")
	public Response getMsg(@PathParam("param") String msg) {

		String output = "Jersey say : " + msg;

		return Response.status(200).entity(output).build();

	}
	@GET
	@Path("age/{param}")

	public Response getAge(@PathParam("param") int msg) {

		String output = "Jersey age : " + msg+30;

		return Response.status(200).entity(output).build();

	}
	
	@GET
	@Path("address")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response getAddress() {

		Address address = new Address();

		return Response.status(200).entity(address.getAddress()).build();

	}

}
