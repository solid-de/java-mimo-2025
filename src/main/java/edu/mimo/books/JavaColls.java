package edu.mimo.books;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JavaColls {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Bob");
        names.add("Bob");
        names.add("Bob");
        names.add("Bob");
        names.add("Alice");

        names.forEach(name -> {
            System.out.println(name);
        });

        System.out.println("------------------------------");
        Set<String> names2 = new HashSet<>();
        names2.add("Bob");
        names2.add("Bob");
        names2.add("Bob");
        names2.add("Bob");
        names2.add("Alice");
        names2.forEach(name -> {
            System.out.println(name);
        });

        System.out.println("------------------------------");
        List<String> inventaire = new ArrayList<>();
        for(String newId: newIds()) {
            if(inventaire.contains(newId)) {
                System.out.println("Id: " + newId + " already exists");
            } else {
                inventaire.add(newId);
            }
        }
        System.out.println(inventaire);

        System.out.println("------------------------------");
        Set<String> inventaire2 = new HashSet<>();
        for(String newId: newIds()) {
            boolean wasAdded = inventaire2.add(newId);
            if(!wasAdded) {
                System.out.println("Id: " + newId + " already exists");
            }
            
        }
        System.out.println(inventaire2);
    }


    static List<String> newIds() {
        return List.of("a", "b", "c", "a", "d", "b");
    }
}
