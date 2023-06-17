import java.util.Scanner;

    
public class practice {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 System.out.print("Enter first string: ");
 String s1 = input.nextLine();
 System.out.print("Enter second string: ");
 String s2 = input.nextLine();
 boolean areAnagrams = true;
 // Check if strings are of equal length
 if(s1.length() != s2.length()) {
 areAnagrams = false;
 }else {
 // Convert strings to character arrays
 char[] s1Array = s1.toLowerCase().toCharArray();
 char[] s2Array = s2.toLowerCase().toCharArray();
 // Sort character arrays
 for(int i=0; i<s1Array.length; i++) {
 for(int j= i+1; j<s1Array.length; j++) {
 if(s1Array[i] > s1Array[j]) {
 char temp = s1Array[i];
s1Array[i] = s1Array[j];
s1Array[j] = temp;
 }
if(s2Array[i] > s2Array[j]) {
 char temp = s2Array[i];
s2Array[i] = s2Array[j];
s2Array[j] = temp;
 }
 }
 }
 System.out.println(s1Array);
 System.out.println(s2Array);
 // Compare character arrays
 for(int i=0; i<s1Array.length; i++) {
 if(s1Array[i] != s2Array[i]) {
 areAnagrams = false;
break;
 }
 }
 }
 if(areAnagrams) {
 System.out.println("The strings are anagrams.");
 }else {
 System.out.println("The strings are not anagrams.");
 }
 }
}


