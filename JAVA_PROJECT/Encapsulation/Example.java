class Student{
    private int age;
     private String name;
     public void setData(){
        age=19;
        name="Rahul";
     }
      public void setData1(int age,String name){
        // Student s=new Student();
        // s.age=age;
        // s.name=name;
        this.age=age;
        this.name=name;
     }
    public void show(){
        System.out.println(age + " "+ name);
    }
}

public class Example {
    public static void main(String[] args) {
        Student s =new Student();
        // s.age=18;
        // s.name="Harsh";
        s.setData1(18,"Harsh");
        s.show();
        
    }
}
