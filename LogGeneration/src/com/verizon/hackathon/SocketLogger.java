package com.verizon.hackathon;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

import org.apache.log4j.LogManager;  
import org.apache.log4j.Logger;  
import org.apache.log4j.net.SocketNode;  
import org.apache.log4j.net.SocketServer;  
import org.apache.log4j.spi.LoggerRepository;  
  
public class SocketLogger extends Thread {  
  
    private static final int DEFAULT_PORT = 4712;  
    private static Logger cat = Logger.getLogger(SocketServer.class);  
    private final int port;  
  
    public SocketLogger(int port) {  
        this.port = port;  
    }  
  
    public SocketLogger() {  
        this(DEFAULT_PORT);  
    }  
  
    @Override  
    public final void run() {  
        try {  
            cat.info("Listening on port " + port);  
            ServerSocket serverSocket = new ServerSocket(port);  
            while (true) {  
                cat.info("Waiting to accept a new client.");  
                Socket socket = serverSocket.accept();  
                InetAddress inetAddress = socket.getInetAddress();  
                cat.info("Connected to client at " + inetAddress);  
  
                LoggerRepository h = LogManager.getLoggerRepository();  
  
                cat.info("Starting new socket node.");  
                // TODO: can we use information in the socket to  
                // record the client host?  
                new Thread(new SocketNode(socket, h)).start();  
            }  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  
}
