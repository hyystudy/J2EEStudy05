package com.company;

import java.io.*;
import java.net.URL;

public class FetchUrl {

    public static void main(String[] args) throws Exception {

        URL url = new URL("http://www.runoob.com");
        InputStream inputStream = url.openStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("data.html"));

        String line;

        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();



    }
}
