package com.app;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/app")
public class RestAppConfig extends ResourceConfig{
public RestAppConfig(){
	packages("com.RestFul");
}
}
