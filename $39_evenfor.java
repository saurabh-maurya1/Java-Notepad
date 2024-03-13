import java.util.Scanner;
  class Demo {
       public static void main(String[] args) {
       int num;
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter no 1 to 30");
      num = sc.nextInt();
     for(int i=2; i<num; i++) {
        if(i % 2 == 0 )
         { 
            System.out.print(i+" ");
         }
      }
  }
}

