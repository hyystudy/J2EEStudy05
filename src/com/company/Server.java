package com.company;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {

        try{
            ServerSocket serverSocket = new ServerSocket(8888);
            System.out.println("启动服务器。。。。");
            Socket client = serverSocket.accept();
            System.out.println("Client : " + client.getInetAddress().getHostName() + " connected to server");

            InputStream clientInputStream = client.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(clientInputStream));
            //将客户端上传的数据保存到服务器 D盘的test.txt
            /*//下面这种方式将客户端的png图片保存到服务器端 但出现打不开png图片
            BufferedWriter bufferedWriter1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\ic_launcher.png")));
            //read client msg
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                bufferedWriter1.write(s);
                bufferedWriter1.newLine();
                System.out.println(s);
                bufferedWriter1.flush();
            }*/
            //第二种方式 以字节流的形式读写
            byte[] bytes = new byte[1024];
            int len;
            FileOutputStream fileOutputStream = new FileOutputStream("D:\\hyy.png");
            while ((len = clientInputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes, 0 , len);
            }
            fileOutputStream.flush();


           /* BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));

            bufferedWriter.write(s + "\n");
            bufferedWriter.flush();*/
        }catch (Exception e){

        }
    }
}
