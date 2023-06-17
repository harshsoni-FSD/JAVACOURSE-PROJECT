package Collection;
import java.util.*;

import javax.swing.AbstractAction;
public class CollectionArrayList {
    public static void main(String[] args) {
        ArrayList al1=new ArrayList();
        al1.add(100);
        al1.add(200);
        al1.add(300);
        System.out.println(al1);
       System.out.println(al1.contains(200));
       System.out.println(al1.indexOf(300)); 
       System.out.println(al1.size());
       al1.ensureCapacity(10);
       al1.trimToSize();
       System.out.println(al1.size());
       al1.clear();
       System.out.println(al1);

//         System.out.println("****************************************");
//         ArrayList al2=new ArrayList();
//         al2.add("PW Skills");
//         al2.add(1.1);
//         al2.add(2);
//         al2.add('j');

//         System.out.println(al2);
// System.out.println("****************************************");
//         ArrayList al3=new ArrayList();
//         al3.add(100);
//         al3.add(101);
//         al3.addAll(al2);
//         System.out.println(al3);
//         System.out.println("****************************************");
//         al3.add(2,'T');

//         System.out.println(al3);
    }
}
