package chapter19;

import java.util.Comparator;

public class CompThenFirstNames implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int i, j;

        return o1.compareToIgnoreCase(o2);
    }
}
