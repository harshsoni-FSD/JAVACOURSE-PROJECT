package ExceptionPrograms;

import javax.swing.plaf.synth.SynthScrollPaneUI;
class MyException extends Exception{
    public MyException(){

    }
    public MyException(String s){
        super(s);//Message print by Exception class so we have to call parent class constructor
    }
}
public class ExceptionthrowKeyWord {
    public static void main(String[] args) {
        int num1=6;
        int num2=-2;
        //Here two line are same so not a good practice so we have to call 
        //catch block but here exception is not there so we have create a custom exception to call a catch block
        try{
            if(num2<0){
               // System.out.println("Please Enter Valid Number");
               //Exception e=new ArithmeticException("negative number");
               Exception e=new MyException("Negative Number");
            //Exception e=new Exception();
               throw e;
            }
            else{
                int result=num1/num2;
                System.out.println("Bye");
            }
        }
        catch(Exception e){
            System.out.println("Please Enter valid number"+e);
        }
    }
}
