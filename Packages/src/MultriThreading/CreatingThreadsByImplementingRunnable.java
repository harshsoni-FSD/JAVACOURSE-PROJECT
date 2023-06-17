package MultriThreading;
import java.util.*;

class Calc implements Runnable{
    public void run(){
        System.out.println("My name is "+Thread.currentThread().getName());
        System.out.println("Calculation Task Started");

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1=sc.nextInt();

        System.out.println("Please enter 2nd number");
        int num2=sc.nextInt();

        int res=num1+num2;

        System.out.println(res);
        System.out.println("Calculation Task Ended");
        System.out.println("****************************************************");


    }
}
class Print implements Runnable{
    public void run(){
        System.out.println("My name is "+Thread.currentThread().getName());
        System.out.println("Displaying important message task");
        try{
            for(int i=0;i<3;i++)
        {
            System.out.println("Focus is important to master skills");
            Thread.sleep(2000);
        }
}
catch(Exception e){
    System.out.println("some error occuried");
}
       

        System.out.println("Displaying import message task ended");

        System.out.println("****************************************************");
        
    }
}
public class CreatingThreadsByImplementingRunnable {
    public static void main(String[] args) 
    {
    System.out.println("Main Thread Started");
    Calc c1=new Calc();
    Print m1=new Print();
    Thread t1=new Thread(c1);
    Thread t2=new Thread(m1);
    //t1.setName("Harsh");
    t1.start();
    t2.start();

        
    }
}
