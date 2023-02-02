package generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("ty");
        list.add("a lot");
        list.add("for");
        list.add("reading");

        for (Object o : list){
            System.out.println(o + "length " + ((String)o).length());
        }
    }
}
