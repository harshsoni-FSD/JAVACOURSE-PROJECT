class Bird{
public static int number;
    public String name;

    Bird(String name){
        this.name=name;
        number++;
    }
    public int getNumber(){
        return number;
    }
    
}




class StaticAssignment {
    public static void main(String[] args) {
       Bird b1= new Bird("spparo");
       Bird b2= new Bird("tiger");
       Bird b3 = new Bird("hdgdh");
        System.out.println(b1.getNumber());
    }
}
