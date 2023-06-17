package Collection;
import java.util.*;
public class CollectionTreeSet {
    public static void main(String[] args) {
        TreeSet ts=new TreeSet();
        ts.add(100);
        ts.add(30);
        ts.add(10);
        ts.add(101);
        ts.add(102);
        ts.add(103);
        ts.add(110);
        ts.add(50);
        System.out.println(ts);
        ts.add(101);
        System.out.println(ts);
        System.out.println(ts.higher(50));
        System.out.println(ts.lower(50));
        System.out.println(ts.ceiling(25));
        System.out.println(ts.floor(25));
        
        
    }
}
