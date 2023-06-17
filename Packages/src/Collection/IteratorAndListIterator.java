package Collection;

import java.util.*;

public class IteratorAndListIterator {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(100);
        al.add(20);
        al.add(40);
        al.add(60);
        System.out.println(al);

        // for(int i=0;i<al.size();i++){
        //        Object o= al.get(i);
        //        System.out.println(o);
        // }
             Iterator itr=al.iterator();
             while(itr.hasNext()){
                System.out.println(itr.next());

             }
             ListIterator litr=al.listIterator(al.size());
             while(litr.hasPrevious()){
                System.out.println(litr.previous());
             }
    }
}
