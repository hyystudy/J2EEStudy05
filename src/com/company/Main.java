package com.company;

import java.util.HashMap;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
	    // write your code here

        HashMap<String, String> stringStringHashMap = new HashMap<>();

        stringStringHashMap.put("1", "first");
        stringStringHashMap.put("2", "second");
        stringStringHashMap.put("3", "third");

        Iterator<String> iterator = stringStringHashMap.values().iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
