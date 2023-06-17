package MultriThreading;

public class ThreadsFirst {
    public static void main(String[] args) {
        System.out.println("Main Thread");
         System.out.println("Before Change");
        String name=Thread.currentThread().getName();
        System.out.println("Name of a thread is::"+name);
        int n=Thread.currentThread().getPriority();
        System.out.println("Priority Of Threas is::"+n);
        System.out.println("After Change");
        Thread t=Thread.currentThread();
        t.setName("PW");
        t.setPriority(1);
        System.out.println("Name of a thread is::"+Thread.currentThread().getName());
         System.out.println("Priority Of Threas is::"+Thread.currentThread().getPriority());
    }

}
