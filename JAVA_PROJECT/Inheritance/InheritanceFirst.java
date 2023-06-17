package Inheritance;
class Human{
    private String name;
    int age;
    Human(){
        System.out.println("Human class constructor");
    }
    void sleep(){
        age=19;
        System.out.println("human is going to sleep");
        System.out.println(age);
    }
}


class Student extends Human

{
    // Student(){
    //     super();//this default constructor invoked 
    //     when its object is created and super() method call its parent class constructor 
    // }
    void display(){
        System.out.println("age is:::"+age);
     //   System.out.println("The name is "+name);
    }
}

public class InheritanceFirst {
    public static void main(String[] args) {
        Student st=new Student();
        st.sleep();
        st.display();
    }
}
