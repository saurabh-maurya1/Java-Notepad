// polymorphism
class Test {
    public void add(int a, int b) {
  System.out.println("The sum is :"+(a+b));
  }
 public void add(double a , double b) {
  System.out.println("The sum is "+(a+b));
 }
 public static void main(String[] args){
Test t1 = new Test();
t1.add(111,33);
t1.add(11.3,33.21);
}}