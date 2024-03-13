//wap to find duplicate character in given String :

import java.util.Scanner;

public class Duplicate {
     public void find(String str) {

        int[] charCounts = new int[256];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            charCounts[c]++;
        }

        for (int i = 0; i < 256; i++) {
            if (charCounts[i] > 1) {
                System.out.println((char) i + " = " + charCounts[i]);
            }
          }
        }
 public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.next();
Duplicate d = new Duplicate();
  d.find(str);
  
   }
}