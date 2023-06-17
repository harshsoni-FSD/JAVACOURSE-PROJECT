package Collection;
import java.util.*;
import java.util.concurrent.*;
public class FailFastandFailSafe {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(100);
        al.add(20);
        al.add(40);
        al.add(60);
        System.out.println(al);

        // for(int i=0;i<al.size();i++){
        //       System.out.println(al.get(i)); 
        //        al.add(120);
               
        // }
        //////////////............FAIL FAST.............../////
                   Iterator itr=al.iterator();
             while(itr.hasNext()){
                System.out.println(itr.next());
                al.add(120);

              }
            //  ListIterator litr=al.listIterator(al.size());
            //  while(litr.hasPrevious()){
            //     System.out.println(litr.previous());
            //  }

            //////////////......FAIL SAFE......../////////////
        CopyOnWriteArrayList al1=new CopyOnWriteArrayList();
        al.add(100);
        al.add(20);
        al.add(40);
        al.add(60);
        System.out.println(al);
         Iterator itr1=al1.iterator();
          while(itr1.hasNext()){
                System.out.println(itr1.next());
                al1.add(120);
    }
}


