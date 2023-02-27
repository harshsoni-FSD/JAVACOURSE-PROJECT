class Calc{
//  public int add(int a,int b){
//     int result=a+b;
//     return result;
//  }
public void show(byte a){
    System.out.println("byte"+ a);
}
public void show(short a){
    System.out.println("short"+ a);
}
public void show(int a){
    System.out.println("int"+ a);
}
public void show(char a){
    System.out.println("char"+ a);
}
public void show(long a){
    System.out.println("long"+ a);
}
public void show(double a){
    System.out.println("double"+ a);
}
public void show(float a){
    System.out.println("float"+ a);
}

//  public int add1(int a,int b,int c){
//     int result=a+b+c;
//     return result;
//  }//old approach in other language java provide method overloading

// public int add(int a,int b,int c){
//     int result =a+b+c;
//     return result;
// }
// public double add(double a,double b){
//     double result =a+b;
//     return result;
// }
}


public class DemoOverloading {
public static void main(String[] args) {
    Calc c= new Calc();
    c.show(2);
//     int result=c.add(4,5);
//    // int result1=c.add1(4,5,6);
//    int result1=c.add(4,5,4);   
//    double res2=c.add(4.5,6.5);
//     System.out.println(result);
//      System.out.println(result1);
//      System.out.println(res2);


}
}
