//wap a program to make calculater using do while loop
     import java.util.Scanner;
   class Demo {
         public static void main(String[] args) {
          char op,choice;
      do {
             double num1,num2,result =0;
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter first number : ");
            num1 = sc.nextDouble();
         System.out.println("Enter Second number : ");
            num2 = sc.nextDouble();
        System.out.println("Enter operator (+,-,*,/) : ");
            op =sc.next().charAt(0);
          switch(op)  {
             case '+' :
                       result = num1+num2;
                            break;
             case '-' :
                       result = num1-num2;
                            break;

             case '*' :
                       result = num1*num2;
                            break;

             case '/' :
                       result = num1/num2;
                            break;
             default : System.out.println("Invalid");
      } 
            System.out.println("Result is : "+result);
            System.out.println("Are you want to continue Programme (Y/N)");
                choice = sc.next().charAt(0);
          } while(choice == 'y' || choice == 'Y');
      }
}
            
 