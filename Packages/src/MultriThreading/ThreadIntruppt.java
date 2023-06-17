package MultriThreading;
class IntrupptExample implements Runnable{
    public void run(){
        try{for(int i=0;i<4;i++){
            System.out.println("Focus is important");
            Thread.sleep(3000);
        }}
        catch(Exception e){
            System.out.println("Thread is Intruppted ");
        }
        
    }
}
public class ThreadIntruppt {
    public static void main(String[] args) {
        
        IntrupptExample e=new IntrupptExample();
        Thread t=new Thread(e);
        t.start();
        t.interrupt();
    }
}
