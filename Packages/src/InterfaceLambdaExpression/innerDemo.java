package InterfaceLambdaExpression;
class A1{
    public void show(){
        System.out.println("show calls");
    }
    // class B{
    //     public void display(){
    //     System.out.println("display calls");
    // }
    static class B{
        public void display(){
        System.out.println("display calls");
    }
    }
}
public class innerDemo {
    public static void main(String[] args) {
        A1 obj=new A1();
        obj.show();
       // obj.display();
       //B b=new B();
      // A1.B b= obj.new B(); //to call or create object of b we have to use A object
      A1.B b=new A1.B();//incase of static we don't need obj of A we can use Name of A directly
       b.display();

    }
}
