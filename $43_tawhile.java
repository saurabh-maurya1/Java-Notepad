import java.util.Scanner;
 class Demo {
      public static void main(String[] args) {
       int num,i=1;
     Scanner sc = new Scanner(System.in);
       System.out.println("Enter a num : ");
            num = sc.nextInt();
      while( i<=10) {
           System.out.println(num+" * "+i+" = "+(num*i));
                i++;
            }
       }
}