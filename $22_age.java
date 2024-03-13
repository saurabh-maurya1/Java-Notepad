import java.util.Scanner;
  class Test21 {
     public static void main(String[] args) {
   Scanner sc = new Scanner(System.in); 
    System.out.println(" Enter Your age ");
     int age = sc.nextInt();
     if(age >=18) {
       System.out.println("You are elegible for voting");
      }
   else {
      System.out.println("You are not elegible for voting");
   }}}