import java.util.Scanner;
  class Demo {
      public static void main(String[] args){
       int num, sum = 0;
     Scanner sc = new Scanner(System.in);
         System.out.println("Enter the no 1 to 10");
            num = sc.nextInt();
         for(int i=1; i<=num; i++){
              System.out.println(i);

               sum = sum + i;
         }
         System.out.println("Total sum is : "+sum);
     }
 }