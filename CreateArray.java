package com.company.HWClass25;

import java.sql.SQLOutput;
import java.util.ArrayList;

/**
 * Create an ArrayList that will store 5 names into it.
 * Find out whether the given ArrayList is empty or not?
 * Check whether the specific name is present in an ArrayList or not?
 * Find the size of your arrayList and print all values from that
 */
public class CreateArray {
    public static void main(String[] args) {
        ArrayList<String> subjects=new ArrayList<>();
        subjects.add("Irina");
        subjects.add("Marina");
        subjects.add("Elena");
        subjects.add("Olena");
        subjects.add("Maria");
        System.out.println(subjects.isEmpty());
        System.out.println(subjects.contains("Irina"));
        System.out.println(subjects.size());
        System.out.println(subjects);
    }
}
