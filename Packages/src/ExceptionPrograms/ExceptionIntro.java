package ExceptionPrograms;

public class ExceptionIntro {
    public static void main(String[] args) {
        int num1=9;
        int num2=0;
        int result=0;
        try{
            result=num1/num2;

        }
        catch(Exception e){
            System.out.println("something went wrong"+e);
        }
        System.out.println(result);
        System.out.println("bye");
    }
}
