package MultriThreading;

import javax.swing.plaf.synth.SynthStyle;

class Printing implements Runnable{
    public void run(){
        System.out.println("Child Thread Started");
        try{
            for(int i=0;i<5;i++){
                System.out.println("focus is important");
                Thread.sleep(3000);
            }
        }
        catch(Exception e){
            System.out.println("something went wrong");
        }
    }
}
public class ThreadJoinandIsalive 
    {
    public static void main(String[] args) throws Exception {
        System.out.println("Main Thread Started");
        Printing p=new Printing();
        Thread t=new Thread(p);
        System.out.println(t.isAlive());
        t.start();
        System.out.println(t.isAlive());
        t.join();
        System.out.println("Main Thread Finished The Work");
    }
}
