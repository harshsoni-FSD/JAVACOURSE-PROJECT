package InterfaceLambdaExpression;

import javax.crypto.spec.PBEKeySpec;

public class practice {

    class Engine{//inner class
        void display(){
            System.out.println("inner class display method");
        }
    }
    public static void main(String[] args) {
        System.out.println("hello world main method");
        
        practice pp=new practice();
       practice.Engine e=pp.new Engine();
       practice.Engine e=new practice().new Engine();
        e.display();

    }
}
