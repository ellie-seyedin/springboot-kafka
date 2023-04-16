package collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Sample {
    public static void main(String args[])
    {
        LinkedList list = new LinkedList();
        list.add(new String("o"));
        list.add(new String("e"));
        list.add(new String("d"));
        list.add(new String("c"));
        Iterator i = list.iterator();
        Collections.reverse(list);
        Collections.sort(list);
        while(i.hasNext())
            System.out.print(i.next());
    }
}
