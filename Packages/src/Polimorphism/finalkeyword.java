package Polimorphism;
// final class Animal1{
//     public void sleep(){
//         System.out.println("sleepoing");
//     }
// }
class Animal1{
   final int age =19;
   final void sleep(){
        System.out.println("sleepoing");
    }
}
class tiger extends Animal1{
//         void sleep(){ //final method we can't override in child class 

//         }
 }
public class finalkeyword {
    public static void main(String[] args) {
        tiger t=new tiger();
        t.sleep();
    }
}
