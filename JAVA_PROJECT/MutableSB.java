import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MutableSB {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        System.out.println(sb.capacity());
        sb.append("abcdefghijklmnop");
        System.out.println(sb.capacity());
        sb.append("a");
        System.out.println(sb.capacity());
        System.err.println(sb.length());
        StringBuffer sb1= new StringBuffer("Sachin");
        System.out.println(sb1);
        System.out.println(sb1.capacity());
        System.out.println(sb1.charAt(1));
        sb1.setCharAt(1, 'B');
        System.out.println(sb1);
    }
}
