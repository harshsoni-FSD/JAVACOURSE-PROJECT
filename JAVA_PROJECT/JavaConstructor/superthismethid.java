
class Teacher1{
    private int age;
    private String name;

    public Teacher1(){
        this("Rahul",56);
        System.out.println("Default constructor called");
        name="rahul";
        age=19;
    }
    public Teacher1(String name,int age){
        
        System.out.println("Parameterised constructor called");
        this.name=name;
        this.age=age;
        System.out.println(name+" "+age);

    }
    public Teacher1(String name){
        this();
        System.out.println("Singel Parameterised constructor called");
        this.name=name;
    }

    public void display(){
        System.out.println(name+" "+age);
    }

}




public class superthismethid {
     public static void main(String[] args) {
        Teacher1 t1=new Teacher1();
        t1.display();
        // Teacher1 t2=new Teacher1("Harsh",19);
        // t2.display();
        // Teacher1 t3=new Teacher1("Harsh");
        // t3.display();
    }
}
