// wap to check greater number between three no;
import java.util.Scanner;
 class Demo {
   public static void main(String[] args) {
     int num1 , num2, num3;
   Scanner sc = new Scanner(System.in);
  System.out.println("Enter the three num ");
  num1 = sc.nextInt();
    num2 = sc.nextInt();
  num3 = sc.nextInt();
   if(num1>num2 ) {
if (num1> num3) {
      System.out.println("num1 is greater : "+num1);
    }  
else
   {
      System.out.println("num3 is greater : "+num3);
   }
}
else if( num2 > num3 ) {
      System.out.println("num2 is greater : "+num2);
      }
 else {
     System.out.println("num3 is greater : "+num3);
      }
   }
}
