package chapter19;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Double> hm = new HashMap<>();
        hm.put("Джон Доу", 3434.34);
        hm.put("Том Смит", 123.340);
        hm.put("Джейн Бейкер", 1378.00);
        hm.put("Тод Холл", 99.22);
        hm.put("Ральф Смит", -19.08);

        Set<Map.Entry<String, Double>> set = hm.entrySet();

        for(Map.Entry<String, Double> me: set){
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        double balance = hm.get("Джон Доу");
        hm.put("Джон Доу", balance + 1000);
        System.out.println("Новый остаток на счете Джона Доу: " + hm.get("Джон Доу"));


    }
}
