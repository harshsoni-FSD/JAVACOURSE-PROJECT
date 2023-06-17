package Collection;
import java.util.*;
public class CollectionArrayDeque {
    public static void main(String[] args) {
        ArrayDeque ad=new ArrayDeque();
        ad.add(100);
        ad.add(200);
        ad.add(300);
        ad.add(400);
        System.out.println(ad);
        ad.addFirst(10);
        ad.addLast(20);
        System.out.println(ad);
        ad.offer(1000);
        ad.offerFirst(1);
        ad.offerLast(4000);
        System.out.println(ad);
    }
}
