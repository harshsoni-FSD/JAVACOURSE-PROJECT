class Teacher{
    private int age;
    private String name;

    public Teacher(){
        System.out.println("Default constructor called");
        name="rahul";
        age=19;
    }
    public Teacher(String name,int age){
        System.out.println("Parameterised constructor called");
        this.name=name;
        this.age=age;

    }
    public Teacher(String name){
        System.out.println("Singel Parameterised constructor called");
        this.name=name;
    }

    public void display(){
        System.out.println(name+" "+age);
    }

}

public class overloadongCons {
    public static void main(String[] args) {
        Teacher t1=new Teacher();
        t1.display();
        Teacher t2=new Teacher("Harsh",19);
        t2.display();
        Teacher t3=new Teacher("Harsh");
        t3.display();
    }
}
