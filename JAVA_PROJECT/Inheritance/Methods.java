class Aeroplan{
public void takeOff(){
System.out.println("aeroplane is takeoff");
}
public void fly(){
System.out.println("aeroplane is fly");
}
}
class Cargoplane extends Aeroplan
{//takeoff method is inherited method

    public void fly(){//overriding method
System.out.println("Cargoaeroplane is fly at lower height  ");
}

public void carrygoods(){
System.out.println("cargiplane carrygoods is flying");
}
}
class Passengerplane extends Aeroplan{
    
public void carryPassenger(){//specialized method only present in child
System.out.println("Passengerplane carrygoods is flying");
}
public void fly(){
System.out.println("Passengeraeroplane is fly at medium height");
}
}

public class Methods {
    public static void main(String[] args) {
        Cargoplane cp=new Cargoplane();
        cp.takeOff();
        cp.fly();
        Passengerplane pp =new Passengerplane();
        pp.fly();
        pp.takeOff();
    }
}
