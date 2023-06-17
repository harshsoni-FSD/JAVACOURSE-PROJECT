package InterfaceLambdaExpression;
interface Calc{
    void display();
}
public class ConceptOfInnerLambda {
    public static void main(String[] args) {
        // Calc c=new Calc(){
        //     public void display(){
        //         System.out.println("inner class anaymous jk");
        //     }
        // };
        Calc c=()->{
            System.out.println("hello lambda");
        };
        c.display();
    }
}
