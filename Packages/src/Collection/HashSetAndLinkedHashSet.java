package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetAndLinkedHashSet {
    public static void main(String[] args) {
        HashSet hs=new HashSet();
        hs.add(100);
        hs.add(20);
        hs.add(40);
        hs.add(60);
        System.out.println(hs);

        LinkedHashSet lhs=new LinkedHashSet();
        lhs.add(100);
        lhs.add(20);
        lhs.add(40);
        lhs.add(60);
        System.out.println(lhs);
    }
}
