package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SimpleCompare {
    public static void main(String[] args) {
        List<String> listNames = new ArrayList<>();
        listNames.add("Tom");
        listNames.add("Ivan");
        listNames.add("John");
        listNames.add("Alex");
        System.out.println("Unsorted names:" + listNames);
        Collections.sort(listNames);
        System.out.println("Sorted names:" + listNames);
    }
}
