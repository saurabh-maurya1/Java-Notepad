//wap to find greater number between three no using only if;
import java.util.Scanner;
class Test19 {
    public static void main(String[] args) { 
       Scanner sc = new Scanner(System.in); 
       System.out.println("Enter three no : ");
       int a, b, c;
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
  if(a>b && a>c) {
                 System.out.println("greater no is : "+a);
                 }
  if(b>c && b>a) {
                  System.out.println("greater no is : "+b);
                 }
  if(c>a && c >b){
                 System.out.println("greater no is : "+c);
                 }
  }
}
   
    
        
