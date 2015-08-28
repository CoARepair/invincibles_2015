package com.verizon.hackathon.logstash;

import javax.jws.WebService;  
//Service Implementation  
@WebService(endpointInterface = "com.javatpoint.HelloWorld")  
public class WebServiceImpl implements WebServicesInterface{  
  @Override  
  public String getHelloWorldAsString(String name) {  
      return "Hello World JAX-WS " + name;  
  }  
}  