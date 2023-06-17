import javax.swing.plaf.synth.SynthPasswordFieldUI;
import java.util.*;

public class AnagramwithLeastInbuiltmethods {
    public static void main(String[] args) {
        boolean anagram=true;
    System.out.println("Enter String 1");
    Scanner sc =new Scanner(System.in);
    String str1=sc.nextLine();
    System.out.println("Enter String 2");
    String str2=sc.nextLine();

    str1=str1.replace(" ", "");
    str2=str2.replace(" ", "");

    if(str1.length() !=str2.length()){
        System.out.println("string are not anagram");
        anagram=false;

    }
    else{
        char [] c1=str1.toLowerCase().toCharArray();
        char[] c2=str2.toLowerCase().toCharArray();
//sorting
        for(int i=0;i<c1.length;i++){
            for(int j=i+1;j<c1.length;j++){
                if(c1[i]>c1[j]){
                    char temp=c1[i];
                    c1[i]=c1[j];
                    c1[j]=temp;

                }
                if(c2[i]>c2[j]){
                    char temp=c2[i];
                    c2[i]=c2[j];
                    c2[j]=temp;
                }
            }
        }
        System.out.println(c1);
        System.out.println(c2);

        for(int i=0;i<c1.length;i++){
            if(c1[i]!=c2[i]){
                anagram=false;
                break;
            }
        }

        
    }
    
if(anagram){
            System.out.println("Strings is anagram");

        }
        else{
            System.out.println("String is not an anagram");
        }

    }
}
