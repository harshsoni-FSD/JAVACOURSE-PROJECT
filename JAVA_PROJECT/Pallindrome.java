import java.util.*;
public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        String str1="";
        for(int i=str.length()-1;i>=0;i--){
            str1=str1+str.charAt(i);

        }
        System.out.println(str1);
        if(str1.equals(str)){
            System.out.println("string is palindrome");

        }
        else{
            System.out.println("string is not palindrome");
        }
    }
}
