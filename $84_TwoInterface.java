interface Data {
 public void add();
}
interface Demo {
public void sub();
}
class Test implements Data,Demo {
int a =10, b=20;
public void add() {
System.out.println("The sum is :"+(a+b));
}
public void sub() {
System.out.println("The sub is : "+(a-b));
 }
public static void main(String[] args) {
Test t1 = new Test();
t1.add();
t1.sub();
 }
}