package InterfaceLambdaExpression;
// interface A{
//     int num=9;
//     void sum();
// }
//  abstract class Computer {
//     public abstract void compileCode();

    
// } to avoid length of code if we know that we have methods in computer are abstract then we have to define this as interface
interface Computer{
    void compileCode();
}
class Desktop implements Computer{
    public void compileCode(){
        System.out.println("you got lesser error than latop");
    }
}
class Laptop implements Computer{
    public void compileCode(){
        System.out.println("you got errors, Not faster");
    }
}
class Developer {
    //Laptop lp=new Laptop(); /////./////...../2nd Step
    public void buildingApps(Computer cc){ /////////.............////step 4
        // Laptop lp=new Laptop();
        cc.compileCode();/////..............///1 step
        System.out.println("building apps");
    }
}
public class Demo {
    public static void main(String[] args) {
         Developer dev= new Developer();
        // Laptop lp=new Laptop();
        Computer cc=new Desktop();  ///............//Step5
        Computer c1=new Laptop();

        dev.buildingApps(cc);///step 4
        dev.buildingApps(c1);
    }
}
