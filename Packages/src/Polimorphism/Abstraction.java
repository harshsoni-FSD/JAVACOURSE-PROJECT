package Polimorphism;
abstract class Aeroplan{
    abstract public void takeOff();
   abstract public void fly();
   public void landing(){
    System.out.println("Landing...");
   }
}
class cargoPlan extends Aeroplan{
    public void takeOff(){
        System.out.println("cargo is ready to fly");

    }
    public void fly(){
        System.out.println("cargo is ready to fly...");

    }
    public void alert(){
        System.out.println("alert...");
    }
}
class Passengerplan extends Aeroplan{
    public void takeOff(){
        System.out.println("passenger is ready to takeoff");

    }
    public void fly(){
        System.out.println("passengerplan] is ready to takeoff");

    }
}
class fighterplan extends Aeroplan{
    public void takeOff(){
        System.out.println("fighter is ready to takeoff");

    }
    public void fly(){
        System.out.println("fighter is ready to takeoff");

    }
}
class Airport{
public void poly(Aeroplan ar){
    ar.takeOff();
    ar.fly();
}
}





public class Abstraction {
     public static void main(String[] args) {
        cargoPlan cp=new cargoPlan();
        fighterplan fp=new fighterplan();
        Passengerplan pp= new Passengerplan();
        // p=cp;
        // p.takeOff();/// this p.takeOff p.fly same thing write two time and get different behavior this is polymorphism
        // p.fly();

        // Passengerplan pp=new Passengerplan();
        // p=pp;
        // p.takeOff();
        // p.fly();
        // cp.takeOff();
        // cp.fly();
        // Airport a=new Airport();
        // a.poly(cp);
        // a.poly(fp);
        // a.poly(pp);
        Aeroplan ae=new cargoPlan();
        ae.fly();
        ae.takeOff();
       // ae.landing();
      // ((cargoPlan) ae).alert();
    }
}
