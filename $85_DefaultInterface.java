interface Data {
 public void add();
default void disp() {
System.out.println("Default method");
 }
}
class Test implements Data {
int a = 10 , b=20;
public void add() {
System.out.println("The sum is :"+(a+b));
}
public static void main(String[] args){
Test t1 = new Test();
     t1.add();
     t1.disp();
}}
