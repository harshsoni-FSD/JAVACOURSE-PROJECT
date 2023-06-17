package InterfaceLambdaExpression;
interface A{
    void show();

}
interface B{
    void play();

}
class C implements A,B{
    public void show(){
        System.err.println("show is on");

    }
    public void  play(){
        System.out.println("play is off");
    }
}
public class InterfaceDemo2 {
    public static void main(String[] args) {
        C c=new C();
        c.show();
        c.play();
        A a=new C();
        a.show();
        //a.play();
    }
}
