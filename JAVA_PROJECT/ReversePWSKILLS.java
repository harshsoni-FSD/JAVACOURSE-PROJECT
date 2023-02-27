public class ReversePWSKILLS {
 public static void main(String[] args) {
    String s="PWSKILLS";
    String s1="";

    for(int i=s.length()-1;i>=0;i--){
        s1=s1+s.charAt(i);

    }
    System.out.println(s1);
////////// 2nd approach

StringBuffer sb=new StringBuffer("PWSKILLS");
sb.reverse();
System.out.println(sb);

String s2="Think Twice";
String s3="";
String arr[]=s2.split(" ");
for(String ele :arr){
for(int i=ele.length()-1;i>=0;i--){
s3=s3+ele.charAt(i);
}
s3=s3+" ";
}
System.err.println(s3);

String s4="Think Twice";
String s5="";
String arr1[]=s4.split(" ");

for(int i=arr1.length-1;i>=0;i--){
s5=s5+arr[i]+" ";
}


System.err.println(s5);




 }  
}
