import java.util.Scanner;
    class Demo
            {
       public static void main(String[] args) {
         int num;
         Scanner sc=new Scanner(System.in);
             System.out.println("Enter positive No: ");
               num = sc.nextInt();
         while(num>0) 
        {
             System.out.println(num+" ");
                num--;
          }
    }
}