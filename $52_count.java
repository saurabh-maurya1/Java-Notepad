import java.util.Scanner;
 class Demo {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
           System.out.println("Enter a number");
           int count=0;
     int num = sc.nextInt();
         for(int i = 1 ; i<=num; i++)
   {
         
        for(int j=1; j<=i; j++) {
             count++;
            System.out.print(count);
    }
    System.out.println();
   }
}
}