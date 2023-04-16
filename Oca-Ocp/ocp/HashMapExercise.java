package ocp;

import java.util.*;

public class HashMapExercise {
    public static void main(String[] args) {
        retrieve();
        shallowCopyHashMap();
        clear();
        reInitialize();
        putAll();
        putIfAbsent();
        entrySet();

    }

    public static void retrieve() {
        Map<Student, List<IceCream>> iceCreamMap = new java.util.HashMap<>();
        List<IceCream> iceCreams = new ArrayList<>();
        iceCreams.add(IceCream.WALNUT);
        iceCreams.add(IceCream.STRAWBERRY);
        iceCreamMap.put(new Student("Eli"), iceCreams);
        System.out.println(iceCreamMap.get(new Student("Eli")));
        System.out.println(iceCreamMap.containsKey(new Student("Ahmad")));
        for (Map.Entry<Student, List<IceCream>> jj : iceCreamMap.entrySet()) {
            System.out.println("key= " + jj.getKey());
        }
    }

    static class GFG {
        public static void main(String[] args) {
            Map<Integer, String> hm1 = new java.util.HashMap<>();

            hm1.put(1, "Geeks");
            hm1.put(2, "For");
            hm1.put(3, "Geeks");

            for (Map.Entry<Integer, String> map : hm1.entrySet()) {
                System.out.println("key = " + map.getKey() + " value = " + map.getValue());
            }
        }
    }

    private static void shallowCopyHashMap() {
        HashMap<String, Integer> languages = new HashMap<>();
        languages.put("Java", 14);
        languages.put("Python", 3);
        languages.put("JavaScript", 1);
        System.out.println("HashMap: " + languages);
        System.out.println("cloneLanguages  = " + languages.clone());
    }

    private static void clear() {
        HashMap<String, Integer> languages = new HashMap<>();
        languages.put("Java", 14);
        languages.put("Python", 3);
        languages.put("JavaScript", 1);
        System.out.println("HashMap: " + languages);

        languages.clear();
        System.out.println("HashMap: " + languages);

    }

    /* Here, the process doesn't remove all items from the hashmap.
     Instead, it creates a new hashmap and assigns the newly created hashmap to numbers.
     And, the older hashmap is removed by Garbage Collector.*/
    private static void reInitialize() {
        HashMap<String, Integer> languages = new HashMap<>();
        languages.put("Java", 14);
        languages.put("Python", 3);
        languages.put("JavaScript", 1);
        System.out.println("HashMap: " + languages);
        languages = new HashMap<>();
        System.out.println("HashMap: " + languages);
        System.out.println(languages.size());
    }

    private static void putAll() {
        TreeMap<String, Integer> languages = new TreeMap<>();
        languages.put("Java", 14);
        languages.put("Python", 3);
        languages.put("JavaScript", 1);
        System.out.println("HashMap: " + languages);
        HashMap<String, Integer> language = new HashMap<>();
        language.put("Go", 2);
        language.putAll(languages);
        System.out.println(language);
    }

    private static void putIfAbsent() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Bachelor", 1);
        map.put("Master", 2);
        map.put("PHD", 3);
        map.putIfAbsent("Associate", 0);
        System.out.println("map = " + map);
//        map.remove("PHD");
        Integer phd = map.getOrDefault("PHD", 0);
        System.out.println(phd);
        System.out.println(map);
    }

    private static void entrySet() {
        HashMap<String, Integer> prices = new HashMap<>();
        prices.put("Shoes", 200);
        prices.put("Bag", 300);
        prices.put("Pant", 150);
        System.out.println("HashMap: " + prices);
        System.out.println("Set View: " + prices.entrySet());
        System.out.println("Key Set View: " + prices.keySet());
        System.out.println("value Set View: " + prices.values());
        for (Map.Entry<String, Integer> entries : prices.entrySet()) {
            System.out.print(entries);
            System.out.print(",");
        }
    }

    static class MergeHash {
        public static void main(String[] args) {
            HashMap<String, Integer> prices = new HashMap<>();
            prices.put("Shoes", 200);
            prices.put("Bag", 300);
            prices.put("Pant", 150);
            prices.put("Shirt", 150);
            System.out.println("HashMap: " + prices);
            Integer returnedValue = prices.merge("Shirt", 100, (oldValue, newValue) -> oldValue + newValue);
            System.out.println("returnedValue = " + returnedValue);
            System.out.println("updated Hashmap : " + prices);
        }
    }

    static class InsertWithDuplicateKey {
        public static void main(String[] args) {
            HashMap<String, String> countries = new HashMap<>();
            countries.put("Washington", "America");
            countries.put("Canberra", "Australia");
            countries.put("Madrid", "Spain");
            System.out.println("HashMap: " + countries);
            String merge = countries.merge("Washington", "USA", (oldValue, newValue) -> oldValue + "/" + newValue);
            System.out.println("merge " + merge);

            System.out.println("updated Hashmap : " + countries);
        }
    }

    static class MergeTwoHashMap {
        public static void main(String[] args) {
            HashMap<String, String> countries = new HashMap<>();
            countries.put("Washington", "America");
            countries.put("Canberra", "Australia");
            countries.put("London", "UK");
            System.out.println("countries = " + countries);
            HashMap<String, String> countries2 = new HashMap<>();
            countries2.put("London", "Britain");
            countries2.forEach((key, value) -> countries.merge(key, value, (oldValue, newValue) -> {
                if (newValue.startsWith("B")) {
                    return newValue;
                } else {
                    return oldValue;
                }
            }));
            System.out.println("Updated hashmap :" + countries);
        }
    }

    static class compute {
        public static void main(String[] args) {
            HashMap<String, Integer> prices = new HashMap<>();

            prices.put("Shoes", 200);
            prices.put("Bag", 300);
            prices.put("Pant", 150);
            System.out.println("HashMap: " + prices);

            Integer shoes = prices.compute("Shoes", (key, value) -> value - value * 10 / 100);
            System.out.println("Result : " + shoes);
        }

        static class putIf {
            public static void main(String[] args) {
                HashMap<String, Integer> prices = new HashMap<>();

                prices.put("Shoes", 200);
                prices.put("Bag", 300);
                prices.put("Pant", 150);
                System.out.println("HashMap: " + prices);
                prices.put("Shoes", 2222222);
                prices.putIfAbsent("Necklace", 2222222);
                System.out.println(prices);
            }
        }
    }
}