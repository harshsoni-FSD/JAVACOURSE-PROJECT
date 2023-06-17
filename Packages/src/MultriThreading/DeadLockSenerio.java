package MultriThreading;
class Library implements Runnable{
    String res1=new String("JAVA");
    String res2=new String("SQL");
    String res3=new String("DSA");

    public void run(){
       String name= Thread.currentThread().getName();
       if(name.equals("Student1")){
        try{
            Thread.sleep(3000);
            synchronized(res1){
                System.out.println("Student1 acquired res 1"+res1);
                Thread.sleep(3000);//Thread dusra resource dundne niklega 
                synchronized(res2){
                    System.out.println("Student1 acquired res"+res2);
                    Thread.sleep(3000);//do milne ke baad vo 3 ke liye chup thodi hoga
                }
                synchronized(res3){
                    System.out.println("student1 acquired res"+res3);
                    Thread.sleep(3000);
                }
            }
        }
        catch(Exception e){
            System.out.println("some problem");
        }
       }
       else{
         try{
            Thread.sleep(3000);
            synchronized(res3){
                System.out.println("Student2 acquired res 1"+res1);
                Thread.sleep(3000);//Thread dusra resource dundne niklega 
                synchronized(res2){
                    System.out.println("Student2 acquired res"+res2);
                    Thread.sleep(3000);//do milne ke baad vo 3 ke liye chup thodi hoga
                }
                synchronized(res1){
                    System.out.println("student2 acquired res"+res3);
                    Thread.sleep(3000);
                }
            }
        }
        catch(Exception e){
            System.out.println("some problem");
        }

       }
    }
}
public class DeadLockSenerio {
    public static void main(String[] args) {
       Library l=new Library();
        Thread t1=new Thread(l);
        Thread t2=new Thread(l);
        t1.setName("Student1");
        t2.setName("Student2");
        t1.start();
        t2.start();

    }
}
