package com.company;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class GetIPFromName {

    public static void main(String[] args) throws UnknownHostException {

        InetAddress localhost = InetAddress.getByName("localhost");
        System.out.println(localhost.getHostName() + ":" + localhost.getHostAddress());
        //System.exit(0);

       /* String host = "localhost";
        Socket socket;

        for (int i = 0; i < 1024; i++) {
            System.out.println("Check port:" + i);
            try {
                socket = new Socket(host, i);
                System.out.println("Port:" + i + " has bean used");

            } catch (UnknownHostException e){

            } catch(IOException e) {
                e.printStackTrace();
            }

        }*/

       System.out.println(InetAddress.getLocalHost().getHostAddress());
       System.out.println(InetAddress.getLocalHost().getHostName());

        try {
            Socket socket = new Socket("localhost", 6066);
            InetAddress inetAddress = socket.getInetAddress();
            System.out.println("Connected " + inetAddress);
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
