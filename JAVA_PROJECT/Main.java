
    import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 System.out.print("Enter a string: ");
 String s = input.nextLine();
 // Create an array to store character frequency
 int[] freq = new int[256];
 // Iterate over each character of the string and update

 for(int i=0; i<s.length(); i++) {
 char c = s.charAt(i);
 freq[c]++;
 }
 // Find the character with maximum frequency
 char maxChar = 0;
 int maxFreq = 0;
 for(int i=0; i<freq.length; i++) {
 if(freq[i] > maxFreq) {
 maxChar = (char) i;
maxFreq = freq[i];
 }
 }
 System.out.println("The maximum occurring character in the string is: " + maxChar);
 }
}


