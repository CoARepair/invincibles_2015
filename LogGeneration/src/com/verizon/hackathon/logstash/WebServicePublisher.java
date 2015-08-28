package com.verizon.hackathon.logstash;

import javax.xml.ws.Endpoint;  
//Endpoint publisher  
public class WebServicePublisher{  
  public static void main(String[] args) {  
     Endpoint.publish("http://localhost:7779/ws/hello", new WebServiceImpl());  
      }  
}  
