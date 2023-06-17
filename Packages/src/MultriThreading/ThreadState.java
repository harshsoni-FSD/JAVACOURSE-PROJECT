package MultriThreading;
class Demo implements Runnable{
    public void run(){
        System.out.println("Child Thread Started");
        
        try{Thread.sleep(3000);}
        catch(Exception e){
            System.out.println("Something went wrong");
        }
        System.out.println("Child Thread Task Completed");
    }
}
public class ThreadState {
    public static void main(String[] args) {
        System.out.println("Main Thread Started");
        Demo d=new Demo();
        Thread t=new Thread(d);
        t.start();

    }
}
