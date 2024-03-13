import java.io.*;
class Test21 {
     public static void main(String[] args)throws Exception {
   InputStreamReader isr = new InputStreamReader(System.in);
   BufferedReader br = new BufferedReader(isr);
  int num1, num2, result;
  System.out.println("Enter num1 : ");
  num1 = Integer.parseInt(br.readLine());
  System.out.println("Enter num2 : ");
  num2 = Integer.parseInt(br.readLine());
    result = num1+num2;
 System.out.println("Sum is : "+result);
    result = num1-num2;
System.out.println("Substraction is : "+result);
    result = num1*num2;
 System.out.println("Multiplication is : "+result);
    result = num1/num2;
System.out.println("Div is : "+result);
  }
}