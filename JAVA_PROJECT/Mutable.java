public class Mutable {
    public static void main(String[] args) {
       // StringBuffer sb=new StringBuffer("Virat");
       final StringBuilder sb=new StringBuilder("Virat");
        //StringBuffer sb="budfer";//invalid
        sb.append(" kohli");
       // sb=new StringBuilder("sachin");
        System.out.println(sb);
    //    final int a=10;
    //     a=20;
    //     System.out.println(a);
    }
}
