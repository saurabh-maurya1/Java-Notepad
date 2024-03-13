import java.util.Scanner;
class demo 
    {
  public static void main(String[] args)
 {
    char choice;
 do
 {
   double num1,num2,sum=0;
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter First No");
num1 = sc.nextDouble();
System.out.println("Enter Second No");
 num2 = sc.nextDouble();
sum = num1+num2;
 System.out.println("the sum is"+sum);
System.out.println("want to sum of another number(Y/N)");
choice = sc.next().charAt(0);
 }
 while (choice == 'y' || choice =='Y');
System.out.println("out of loop ");
}}