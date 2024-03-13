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
         int max=array[0];
         int min=array[0];
         for(int x:array) {
           if(max<x) {
             max=x;
            }
           else if(min>x){
            min = x;
             }
         }
        System.out.println("Maximum value : "+max);
         System.out.println("Minmum value : "+min);

   }
}