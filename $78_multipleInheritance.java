class A {
  public void a(){
  System.out.println("A class property");
 }
}
class B extends A {
public void b() {
System.out.println("B class property");
 }
}
class C extends B {
  C(){
  b();
  a();
  c();
 }
public void c() {
 System.out.println("C class property");
 }}
class Test {
  public static void main(String[] args) {
  C cc = new C();
 }
}
   