import javax.swing.plaf.synth.SynthScrollPaneUI;

public class StringExample {
    public static void main(String[] args) {
        String brand="Harsh is FSD";
        System.out.println(brand);
        brand.concat("hi I am");
        System.out.println(brand);
        StringBuilder str=new StringBuilder("Harsh is HFB");
        System.out.println(str);
        str.append("I am");
        System.out.println(str);
        String a="gate";
        System.out.println(a);
        String n=new String("qalified");
        System.out.println(n);
        char c[]={'p','w'};
        String d= new String(c);
        System.out.println(d);

        String s1="PWSKILLSGATE";
        String s2= new String("PWSKILLSGATE");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
System.out.println();
System.out.println();
        String s3="Hello";
        String s4=new String("HEllo");
        String s5=new String("Hello");
        System.out.println(s3==s4);
        System.out.println(s4==s5);
        System.out.println(s3.equalsIgnoreCase(s4));
        System.out.println(s4.equals(s5));
        System.out.println();
System.out.println();
System.out.println();
System.out.println();
String s6=new String("PW");
s6=s6.concat("SKILLS");
System.out.println(s6);
System.out.println();
System.out.println();
System.out.println();
String s8="PW";
String s9=s8.concat("JAVA");
String s10=new String("PWSKILL");
s10=s10.concat("hiIamPW");
System.out.println(s8);
System.out.println(s9);
System.out.println(s10);
System.out.println();
System.out.println();
System.out.println();
String f="PW";
String g="pw"+"java";
String h="pw"+"java"+"skill";
String j=f+g;
//s10=s10.concat("hiIamPW");
System.out.println(f);//PW
System.out.println(g);//pwjava
System.out.println(h);//pwjavaskill
System.out.println(j);//PWpwjava

String str1="PW"+100+99;
System.out.println(str1);
//String st=str1.concat(99);

String q ="hi i am harsh soni";
System.out.println(q);
System.out.println(q.toUpperCase());
System.out.println(q.toLowerCase());
System.out.println(q.length());
System.out.println(q.charAt(1));
System.out.println(q.substring(3,8));
System.out.println(q.indexOf("s"));
System.out.println(q.lastIndexOf("s"));


    }
}
