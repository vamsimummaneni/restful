package com.test;

import static com.jayway.restassured.RestAssured.expect;
//import groovyx.net.http.ContentType;

import org.junit.Before;
import org.junit.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;

public class RestAppTest{

   @Before
   public void setUp(){
       RestAssured.basePath = "https://localhost:8086/RestFulTest1/";
   }

   @Test
   public void testApi(){
       expect().statusCode(200).contentType(ContentType.TEXT).when()
               .get("app/printstring/travelport");
   }

}