package ExceptionPrograms;
class Demo{
    public void A()throws Exception{
    B();
    }
    public void B()throws Exception{
        int num1=10;
        int num2=0;
        int result=num1/num2;
        System.out.println(result);
    }
}
public class ExceptionWithThrows {
    public static void main(String[] args) throws Exception{
        Demo obj=new Demo();
        obj.A();
    }
}
