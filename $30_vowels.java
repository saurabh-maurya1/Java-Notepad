import java.util.Scanner;
 class Demo {
     public static void main(String[] args) {
     String str;
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the Character");
     str = sc.next();
      if(str.matches("[a-zA-Z]")) { 
                char ch = str.charAt(0);
               if(ch =='A' ||ch=='E' ||  ch =='I' ||ch=='O'||ch =='U' 
                 ||ch =='a' ||ch=='e'||  ch =='i' ||ch=='o'||ch =='u') {
                      System.out.println("It is Vowels : ");
                    }
             else { 
                   System.out.println("It is Consonant : ");
                  }
                }
         else {
              System.out.println("Invalid Character");
              }
         } 
 }