import java.util.Scanner;
 class Demo {
      public static void main(String[] args) {
       int num;
     Scanner sc = new Scanner(System.in);
       System.out.println("Enter a num : ");
            num = sc.nextInt();
       for(int i=1; i<=10; i++) {
              if(i==5) {  break;}
                 System.out.println(i);
              
            }
       }
}



/*
import java.util.Scanner;
 class Demo {
      public static void main(String[] args) {
       int num, a=1;
     Scanner sc = new Scanner(System.in);
       System.out.println("Enter a num : ");
            num = sc.nextInt();
       for(int i=1; i<=10; i++) {
                 System.out.println(a++);
              i++;
            }
       }
}
*/