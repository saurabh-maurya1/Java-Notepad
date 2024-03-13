import java.util.Scanner;
class Demo {
     public static void main(String[] args) {
     int size;
   Scanner sc=new Scanner(System.in); 
     System.out.println("Enter the size of array");
     size =sc.nextInt();
  int[] array =new int[size];
     System.out.println("Enter the element : "+size);
      for(int i=0; i<size; i++ ){
        array[i]=sc.nextInt();
       }
         int largest=array[0];
         int Seclargest=array[0];
         for(int x:array) {
           if(largest<x) {
            Seclargest = largest;
             largest=x;
            }
         }
        System.out.println("Largest element : "+largest);
         System.out.println("Second largest element : "+Seclargest);

   }
}