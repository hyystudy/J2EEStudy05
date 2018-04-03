package com.company;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ResponseHeader {

    public static void main(String[] args) throws IOException {

        URL url = new URL("http://www.runoob.com");

        URLConnection urlConnection = url.openConnection();

        Map<String, List<String>> headerFields = urlConnection.getHeaderFields();

        Set<String> strings = headerFields.keySet();

        for (String key :
                strings) {
            String headerField = urlConnection.getHeaderField(key);
            System.out.println(key + ": " + headerField);
        }

        System.out.println(new Date(urlConnection.getDate()));
    }

}
