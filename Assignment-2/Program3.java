//Implement CRUD operations using Collection API (ArrayList, HashMap, TreeMap)

import java.util.*;

public class Program3 {

    public static void main(String[] args) {

        System.out.println("=== CRUD Operations using ArrayList ===");
        ArrayList<String> list = new ArrayList<>();

        list.add("John");
        list.add("Alice");
        list.add("Bob");

        System.out.print("After Adding: {");
        for (int i = 0; i < list.size(); i++) {
            System.out.print((i + 1) + "=" + list.get(i));
            if (i != list.size() - 1) System.out.print(", ");
        }
        System.out.println("}");

        System.out.println("Read Elements:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + " : " + list.get(i));
        }

        list.set(1, "Alicia"); 
        System.out.print("After Update: {");
        for (int i = 0; i < list.size(); i++) {
            System.out.print((i + 1) + "=" + list.get(i));
            if (i != list.size() - 1) System.out.print(", ");
        }
        System.out.println("}");

        list.remove(0); 
        System.out.print("After Delete: {");
        for (int i = 0; i < list.size(); i++) {
            System.out.print((i + 1) + "=" + list.get(i));
            if (i != list.size() - 1) System.out.print(", ");
        }
        System.out.println("}");

        System.out.println("\n=== CRUD Operations using HashMap ===");
        HashMap<Integer, String> hmap = new HashMap<>();

        hmap.put(1, "John");
        hmap.put(2, "Alice");
        hmap.put(3, "Bob");

        System.out.println("After Adding: " + hmap);

        System.out.println("Read Elements:");
        for (Map.Entry<Integer, String> entry : hmap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        hmap.remove(1);
        System.out.println("After Delete: " + hmap);

        System.out.println("\n=== CRUD Operations using TreeMap ===");
        TreeMap<Integer, String> tmap = new TreeMap<>();

        tmap.put(1, "Red");
        tmap.put(3, "Green");
        tmap.put(2, "Blue");
        System.out.println("After Adding: " + tmap);

        System.out.println("Read Elements:");
        for (Map.Entry<Integer, String> entry : tmap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        tmap.put(3, "Yellow");
        System.out.println("After Update: " + tmap);

        tmap.remove(1);
        System.out.println("After Delete: " + tmap);
    }
}