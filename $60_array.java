import java.util.Scanner;
 class Demo {
     public static void main(String[] args) {
       int size; 
    Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size of array");
           size = sc.nextInt();
         int[] list = new int[size];
       System.out.println("Enter the element "+size);
           for(int i=0; i<size; i++) {
                list[i] = sc.nextInt();
               }
         System.out.println("After entered element are :");
       for(int i=0; i<size; i++) {
            System.out.println(list[i]);
          }
      }
}