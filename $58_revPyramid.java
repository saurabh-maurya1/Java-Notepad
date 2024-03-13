import java.util.Scanner;
  class Demo {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
           System.out.println("Enter a number");
           int num = sc.nextInt();
        for(int i=1; i<=num; i++) {
               for(int j=1; j<=num; j++) {
                  if(j>=i){
                    System.out.print("*");
 						}
                 else {
                     System.out.print(" ");
                      }
                }
                for(int k =1; k<=(num-i); k++ )
            { 
              System.out.print("*");
            } 
            System.out.println();
             }
      
     }
 }

                 