class Person{
private int age;
    private String name;
    public Person(){
        // age=0;
        // name=null;
        System.out.println("zero params constructor by programmer");
    }
    Person(String name,int age){
        this.name=name;
        this.age=age;

     }
    public void display(){
        System.out.println(age+" "+name);
    }

    // public int getAge() {
    //     return age;
    // }

    // public void setAge(int age) {
    //     this.age = age;
    // }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class basic {
   public static void main(String[] args) {
    Person p=new Person("Harsh",19);
    Person p1=new Person();
    p.display();
    p1.display();
   } 
}
