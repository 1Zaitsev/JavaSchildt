package chapter19;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class CompDemo {
    public static void main(String[] args) {
//Вариант создания компоратово при помощи лямбда выражений
//Comparator<String> comp = ((aStr, bStr) -> aStr.compareTo(bStr));

        TreeSet<String> ts = new TreeSet<>(new MyComp());

        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        for(String element : ts){
            System.out.print( element + " ");
            System.out.println();
        }
    }
}
