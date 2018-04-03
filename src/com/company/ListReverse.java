package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ListReverse {

    public static void main(String[] args) {
        String[] strs = new String[]{"A", "B", "C", "D", "E"};
        List<String> list = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            list.add(strs[i]);
        }
        System.out.println("Before reverse");
        ListIterator<String> stringListIterator = list.listIterator();
        while (stringListIterator.hasNext()) {
            System.out.println(stringListIterator.next());
        }

        Collections.reverse(list);

        System.out.println("After reverse");

        stringListIterator = list.listIterator();
        while (stringListIterator.hasNext()) {
            System.out.println(stringListIterator.next());
        }

    }
}
