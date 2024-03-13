import java.util.Scanner;
 class Demo {
     public static void main(String[] args) {
       int size,sum=0; 
    Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size of array");
           size = sc.nextInt();
         int[] list = new int[size];
       System.out.println("Enter the element "+size);
           for(int i=0; i<size; i++) {
                list[i] = sc.nextInt();
               }
       for(int i=0; i<size; i++) {
            sum = (sum+list[i]);
          }
 System.out.println("Sum is :"+sum);
      }
}