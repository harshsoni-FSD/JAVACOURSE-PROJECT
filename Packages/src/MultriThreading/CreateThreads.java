package MultriThreading;

import javax.swing.plaf.synth.SynthStyleFactory;
class MyThread extends Thread{
    public void run(){
        System.out.println("Child Thread");
    }
}
public class CreateThreads {
    public static void main(String[] args) {
        System.out.println("Main Thread");
        MyThread t=new MyThread();
        t.start();
    }
}
