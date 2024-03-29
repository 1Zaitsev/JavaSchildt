package chapter19;

import java.util.*;

public class TreeMapDemo2A {
    public static void main(String[] args) {
        CompLastNames compLN = new CompLastNames();
        Comparator<String> compLastThenFirst = compLN.thenComparing(new CompThenFirstNames());

        TreeMap<String, Double> tm = new TreeMap<>(compLastThenFirst);

        tm.put("Джон Доу", 3434.34);
        tm.put("Том Смит", 123.340);
        tm.put("Джейн Бейкер", 1378.00);
        tm.put("Тод Холл", 99.22);
        tm.put("Ральф Смит", -19.08);

        Set<Map.Entry<String, Double>> set = tm.entrySet();

        for (Map.Entry<String, Double> me: set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        Double balance = tm.get("Джон Доу");
        tm.put("Джон Доу", balance + 1000);

        System.out.println("Новый остаток на счете Джона Доу: " + tm.get("Джон Доу"));
    }
}
