import java.util.Scanner;
 class Demo {
        public static void main(String[] args) {
        int num; 
     Scanner sc = new Scanner(System.in);
         System.out.println("Enter a number");
        num = sc.nextInt();
    for(int i=1; i<=num; i++) {
        for(int j=1; j<=5; j++) {
           for(int k=1; k<=2*i-1; k++) {
             System.out.print(i);
            }
              System.out.println();
          }       
     }
  }
}