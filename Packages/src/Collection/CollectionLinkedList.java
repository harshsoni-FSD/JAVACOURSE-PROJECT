package Collection;

import java.util.LinkedList;

public class CollectionLinkedList {
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.add(200);
        l.add(300);
        l.add(400);

        System.out.println(l);
        System.out.println(l.get(2));
        System.out.println(l.indexOf(200));
        System.out.println(l.lastIndexOf(400));
        System.out.println(l.getFirst());
        System.out.println(l.getLast());
        l.push(10);
        System.out.println(l);
       l.pop();
        System.out.println(l);

        // LinkedList l1=new LinkedList();
        // l1.add('j');
        // l1.add(2);
        // l1.add("PwSkills");
        // System.out.println(l1);

        // LinkedList l2=new LinkedList();
        // l2.add(10);
        // l2.add(20);
        // l2.add(10);
        // l2.add(30);

        // l2.addFirst(101);
        // l2.addLast(102);
        // System.out.println(l2);
        // System.out.println(l2.peek());
        // System.out.println(l2.poll());
        // System.out.println(l2);
    }
}
