package InterfaceLambdaExpression;
interface A{
    void show();

    default void config(){
        System.err.println("default method invocked");
    }
    static void abc(){
        System.err.println("abc invoked");
    }
}
class B implements A{
    //now we have to declare on those method which is abstract
    public void show(){
        System.out.println("shoe is invoked");
    }
}
public class Java8fea {
    public static void main(String[] args) {
        A.abc();
        A a=new B();
        a.show();
        a.config();//need object to call because it is non-static method
    }
}
