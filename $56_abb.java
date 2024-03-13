import java.util.Scanner; 
  class Demo {
     public static void main(String[] args) {
        char num=65;
        Scanner sc = new Scanner(System.in);
             System.out.println("Enter a num");
             int num1 = sc.nextInt();
       for(int i=1; i<=num1; i++) {
             for(int j=1; j<=i; j++) {
                  System.out.print(num);
                 }
                  num++;
            System.out.println();     
         } 
    }
}