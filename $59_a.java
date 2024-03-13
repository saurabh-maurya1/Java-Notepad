import java.util.Scanner;
   class Demo {
  public static void pattern(int num) {
        // outer loop 
      for(int i=1; i<=num; i++){
        //inner loop 
      //print spaces 
     for(int j=1; j<=num-i; j++) {
        System.out.print(" ");
       }
      // print num as like loop execute
        for(int k=1; k<=i; k++) {
         System.out.print(i);
         }
         for(int l=2; l<=i; l++) {
          System.out.print(l);
        }
      // next line
         System.out.println();
        }
    }

       public static void main(String[] args) {
               pattern(8);
      }
 }