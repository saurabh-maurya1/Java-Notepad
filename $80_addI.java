import java.util.Scanner;
class A {
  public void sqr(int a, int b){
  System.out.println("Square of  "+a+" is : "+(a*a)+"\n and Square of "+b+" is : "+(b*b));
 }
}
class B extends A {
public void add(int a , int b) {
System.out.println("Sum is :"+(a+b));
 }
}

class Test {
  public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
    System.out.println("Enter two number");
      int a = sc.nextInt();
      int b = sc.nextInt();
  B  bb = new B();
     bb.add(a,b);
    bb.sqr(a,b);
 }
}