

 class Student1 {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class SetterGetter {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.setAge(19);
        s1.setName("YASH");
        Student1 s2 = new Student1();
        s2.setAge(20);
        s2.setName("harsh");

        int age = s1.getAge();
        String name = s1.getName();
        System.out.println(age + " " + (name != null ? name : ""));
    }
}