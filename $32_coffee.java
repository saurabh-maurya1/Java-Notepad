import java.util.Scanner;
  class Demo {
     public static void main(String[] args) {
   double amount, age;
 Scanner sc = new Scanner(System.in);
 System.out.println("enter you amount");
   amount= sc.nextDouble();
  if(amount>=2000) {
      System.out.println("Enter your age");
       age = sc.nextDouble();
        if( age >23 )
          { 
            System.out.println("lets have wine");
          }
          else { 
            System.out.println("Coffee in starbucks");
            }
    }
   else {
       if(amount>=1000) {
         System.out.println("coffee in ccd");
          }
        else{ 
            System.out.println("lets have tea");
       }
    }
System.out.println("lets go home");
 }}
       
