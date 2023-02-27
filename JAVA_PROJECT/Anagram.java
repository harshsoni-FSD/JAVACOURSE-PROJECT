import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str="School Master";
        String str1="the classroom java";

        str=str.replace(" ", "");
        str1=str1.replace(" ", "");
        str=str.toLowerCase();
        str1=str1.toLowerCase();
        char arr1[]=str.toCharArray();
        char arr2[]=str1.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1, arr2)){
            System.out.println("It is an anagram");

        }
        else{
            System.out.println("It is not an anagram");
        
        }
    }
}
