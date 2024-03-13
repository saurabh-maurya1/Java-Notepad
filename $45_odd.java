import java.util.Scanner;
    class Demo
            {
       public static void main(String[] args) {
         int num;
         Scanner sc=new Scanner(System.in);
             System.out.println("Enter number: ");
               num = sc.nextInt();
           for(int i=1; i<=num; i=i+2)
             {
                 System.out.println(i);
                  
             }
        
    }
}