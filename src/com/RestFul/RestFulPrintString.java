package com.RestFul;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/printstring")
public class RestFulPrintString {

@GET
@Path("/travelport")
@Produces("text/plain")
public String printMessage(){
	return "I love Travel Port and would love a job";
}
}
