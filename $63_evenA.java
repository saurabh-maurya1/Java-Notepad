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
 System.out.println("Even no is :");
       for(int i=0; i<size; i++) {
            if(list[i]%2==0) {
                sum = sum + list[i];
              System.out.print(list[i]+" ");
          }
       }

          System.out.println("\nSum of even no is : "+sum);
      }
}