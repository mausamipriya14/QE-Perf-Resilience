import java.util.Map;

import java.util.HashMap;

class demoMap {

    public static void main(String[] args) {
        // Creating a map using the HashMap
        Map<String, Integer> colors = new HashMap<>();

        // Insert elements to the map
        colors.put("Red", 1);
        colors.put("Green", 2);
        colors.put("Yellow", 3);
        colors.put("Orange", 4);
        colors.put("White", 5);
        colors.put("Black", 6);
        System.out.println("Map: " + colors);

        // Access keys of the map
        System.out.println("Keys: " + colors.keySet());

        // Access values of the map
        System.out.println("Values: " + colors.values());

        // Access entries of the map
        System.out.println("Entries: " + colors.entrySet());

        // Remove Elements from the map
        colors.remove("Green");
        System.out.println(colors);

        System.out.println(colors.containsKey("Green"));

        System.out.println(colors.size());
    }
}