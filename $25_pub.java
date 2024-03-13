import java.util.Scanner;
  class Test22 {
     public static void main(String[] args) {
   Scanner sc = new Scanner(System.in); 
System.out.println("Enter Your Age");
    int  age = sc.nextInt();
System.out.println("Enter You Amount");
    int amount = sc.nextInt();

    if(age >= 21 && amount > 2000) {
     System.out.println("You are eligible for going  to pub");
   }
  else
 {
  System.out.println("you are not eligible");

}}}
