/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umar.iotcourseproject;

import org.eclipse.californium.core.CoapResource;
import org.eclipse.californium.core.coap.CoAP.ResponseCode;
import org.eclipse.californium.core.coap.MediaTypeRegistry;
import org.eclipse.californium.core.server.resources.CoapExchange;

/**
 *
 * @author uayusuf
 */
public class HelloWorldResource extends CoapResource {
    public HelloWorldResource(String name) { 
        super(name);
    }
    
    @Override
    public void handleGET(CoapExchange exchange) {
        exchange.respond(
                ResponseCode.CONTENT,
                "Hello World!",
                MediaTypeRegistry.TEXT_PLAIN
        );
    }
}
