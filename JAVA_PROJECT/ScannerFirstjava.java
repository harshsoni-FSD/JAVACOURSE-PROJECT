import java.util.Scanner;
public class ScannerFirstjava{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age");
        int age=sc.nextInt();
        System.out.println("your age is"+age);
         System.out.println("Average is");
         double avg=sc.nextDouble();
         System.out.println("avg is " + avg);
         System.out.println("enter your name");
         String name=sc.next();
         System.out.println("your name is" + name);
    }
    
}
