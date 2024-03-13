import java.util.Scanner;
class Test18 {
     public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter first num : ");
       int a = sc.nextInt();
      System.out.println("Enter Second num : ");
        int b = sc.nextInt();
      int sum = a+b ; 
      int sub = a-b ; 
      int mul = a*b;
      double div = a/b;
     System.out.println("Sum is : "+sum);
     System.out.println("Substraction is : "+sub);
    System.out.println("Multiplication is : "+mul);
    System.out.println("Division is : "+div);
  }
}