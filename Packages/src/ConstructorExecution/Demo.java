package ConstructorExecution;
class Demo1{
    int a,b;
    public Demo1(){
        System.out.println("Parent Class Constructor");
    }
    public Demo1(int x, int y){
         System.out.println("Parameterised Parent Class Constructor");
         a=x;
         b=y;
    }
}
class Demo2 extends Demo1{
    int m,n;
    public Demo2(){
        //super(10,20);
        this(10,20);
        //super() bydefault rhta due to this it call parent class constructor so execution start from parent and then child
        System.out.println("Child Class Constructor");
    }
    public Demo2(int x, int y){
         System.out.println("Parameterised Child Class Constructor");
         m=x;
         n=y;
    }
}

public class Demo {
    public static void main(String[] args) {
        System.out.println("hi");
        Demo2 d=new Demo2();
        //Demo2 d1=new Demo2(10,20);
    }
}
