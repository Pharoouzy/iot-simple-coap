/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umar.iotcourseproject;

import org.eclipse.californium.core.CoapServer;

/**
 *
 * @author uayusuf
 */
public class MainServer extends CoapServer {
    public static void main(String[] args) {
        MainServer mainServer = new MainServer();
        HelloWorldResource hello = new HelloWorldResource("hello-world");
        mainServer.add(hello);
        mainServer.start();
    }
}
