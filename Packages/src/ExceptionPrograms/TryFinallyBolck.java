package ExceptionPrograms;

import java.util.Scanner;

import javax.sound.midi.Synthesizer;

public class TryFinallyBolck {
    public static void main(String[] args) {
        int num1=0;
    //Scanner sc=new Scanner(System.in);
    //try with resource
    try(Scanner sc=new Scanner(System.in))
    {
        num1=sc.nextInt();
    }
    // catch(Exception e){
    //     System.out.println(e);
    // }
    // finally{
    //     sc.close();
    //     System.out.println("resource close");
    // }
    System.out.println(num1);
        
        
        
    }
}
