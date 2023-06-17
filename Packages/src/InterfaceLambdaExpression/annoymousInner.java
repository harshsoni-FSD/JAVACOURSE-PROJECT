package InterfaceLambdaExpression;

import javax.sql.rowset.spi.SyncResolver;
import javax.swing.plaf.synth.SynthSpinnerUI;
@FunctionalInterface ///annotation
interface Car{
    void drive(int avg,int time);
    // /void slow();

}
// class wangonR implements Car{
//     public void drive(){
//         System.out.println("car drive");
//     }
// }
public class annoymousInner {
    public static void main(String[] args) {
        // Car c=new wangonR();
        // Car c=new Car() 
        //     {
        //         public void drive(){
        //             System.out.println("car drive");
        //         }
        //     };
        //with lambda expression
         //Car c=avg-> System.out.println("car drive"+avg);

           Car c1=(avg,time)-> System.out.println("car drive"+avg+" "+time);
                
            
        
        c1.drive(16,5);
        
    }
}
