import java.util.Scanner;
      class Demo {
         public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num ");
        int num = sc.nextInt();
          System.out.println("Even no");
       for(int i=1; i<num; i++) 
        {
          i++;
         System.out.print(i+" ");
          }
          System.out.println();
         System.out.println("Odd no");
         for(int j=1; j<num; j++)
            {
             System.out.print(j+" ");
                   j++;
             }
     }
}
       