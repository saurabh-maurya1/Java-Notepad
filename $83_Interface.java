interface Data {
   public void add() ;
 }
class Test implements Data{
 int a =	10, b = 20 ;
 public void add() {
 System.out.println("the sum is "+(a+b));
 }
public static void main(String[] args) {
 Test t1 = new Test();
t1.add();
 }
}