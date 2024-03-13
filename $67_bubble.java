import java.util.Scanner;
 class Demo {
   public static void main(String[] args) {
      int size,temp=0;
  Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size");
         size = sc.nextInt();
     int[] array = new int[size];
          System.out.println("Enter the element");

        // initialization
        for(int i=0; i<size; i++) {
          array[i] = sc.nextInt();
         }
            
       // sorting
         for(int i=0; i<array.length; i++) {
             for(int j=0; j<array.length-1-i; j++) {
             if(array[j]>array[j+1]) {
                //swap
                temp = array[j];
             array[j] = array[j+1];
             array[j+1]=temp;
            }
         }
       }

               //print the array
           System.out.println("Sorted array are: ");
          for(int x: array) {
           System.out.print(x+" ");
          }
        System.out.println();

     }
   }
      
       