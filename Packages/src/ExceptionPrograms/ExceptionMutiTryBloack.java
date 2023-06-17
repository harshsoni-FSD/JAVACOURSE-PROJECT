package ExceptionPrograms;

import javax.sound.midi.Synthesizer;

public class ExceptionMutiTryBloack {
    public static void main(String[] args) {
        int num1=10;
        int num2=5;
        int result=0;
        int values[]={2,4,5,6};
        try{
            result=num1/num2;
            System.out.println(values[7]);
        }
        catch(ArithmeticException e){
            System.out.println(e);

        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println(result);
        System.out.println("bye");
    }
}
