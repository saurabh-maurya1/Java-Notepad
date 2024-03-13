import java.util.Scanner;
  class Demo {
   public static void main(String[] args) {
  int num1,num2; 
  char op;
Scanner sc = new Scanner(System.in);
System.out.println("Enter num1");
  num1 = sc.nextInt();
System.out.println("Enter num2");
  num2 = sc.nextInt();
  
System.out.println("Enter the operator (+,-,*,/)");
  op = sc.next().charAt(0);

 if (op == '+') {
System.out.println("sum is : "+(num1+num2));
 }
else  if (op == '-') {
System.out.println("Substraction is : "+(num1-num2));
 }
else  if (op == '*') {
System.out.println("Multiplication is : "+(num1*num2));
 }
else  if (op == '/') {
System.out.println("Division is : "+(num1/num2));
 } 

}}