package com.company;

import java.io.*;
import java.net.Socket;

public class Client {

    public static void main(String[] args){

        try {
            Socket socket = new Socket("127.0.0.1", 8888);

            //构建IO
            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();

            //将当前目录的test.txt文件上传到服务器
            //下面上传的图片到服务器打不开
           /* BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("ic_launcher_round.png")));
            //向服务器发信息
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
            String string;
            while ((string = br.readLine()) != null) {
                System.out.println(string);
                bufferedWriter.write(string);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }*/

           //第二种 以字节流的形式读写
            FileInputStream fileInputStream = new FileInputStream("ic_launcher_round.png");
            byte[] bytes = new byte[1024];
            int len;
            while ((len = fileInputStream.read(bytes)) != -1) {
                outputStream.write(bytes, 0, len);
            }
            outputStream.flush();


            //读取 服务器返回的信息
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String msg = bufferedReader.readLine();
            System.out.println(msg);


        } catch (IOException e) {
            e.printStackTrace();
        }finally {

        }
    }
}
