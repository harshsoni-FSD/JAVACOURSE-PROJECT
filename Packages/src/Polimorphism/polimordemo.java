package Polimorphism;


class Aeroplan{
    public void takeOff(){
        System.out.println("flight is going to takoff");
    }
    public void fly(){
        System.out.println("aeroplan is going to fly");
    }
}
class cargoPlan extends Aeroplan{
    public void takeOff(){
        System.out.println("cargo is ready to takeoff");

    }
    public void fly(){
        System.out.println("cargo is ready to takeoff");

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
public class polimordemo {
    public static void main(String[] args) {
        cargoPlan cp=new cargoPlan();
        Aeroplan p;
        p=cp;
        p.takeOff();/// this p.takeOff p.fly same thing write two time and get different behavior this is polymorphism
        p.fly();

        Passengerplan pp=new Passengerplan();
        p=pp;
        p.takeOff();
        p.fly();
        // cp.takeOff();
        // cp.fly();
    }
}
