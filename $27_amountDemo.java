import java.util.Scanner;
  class Demo {
   public static void main(String[] args) {
  int amount; 
Scanner sc = new Scanner(System.in);
System.out.println("Enter amount");
  amount = sc.nextInt();
 if (amount>=1000) {
  System.out.println("I hava "+amount+" Rs");
System.out.println("Coffee in Starbucks");
 }
 else if(amount>=700) {
  System.out.println("I hava "+amount+" Rs");
System.out.println("Coffee in CCD");
}
else if(amount>=500) {
  System.out.println("I hava "+amount+" Rs");
System.out.println("Coffee in normal shop");
}
else {
System.out.println("lets have tea");
}
System.out.println("lets go home");
}}