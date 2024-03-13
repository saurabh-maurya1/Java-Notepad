interface First {
   public void add();
 }
interface Second {
   public void sub();
 }
interface Third extends First,Second {
   public void multi();
 }
class Test implements Third {
   int a =10, b=30;
  public void multi(){
     System.out.println("Multiplication :"+(a*b));
  }
public void add(){
   System.out.println("Addition :"+(a+b));
 }
public void sub(){
   System.out.println("Subtraction:"+(a-b));
 }
public static void main(String[] args){
  Test t1 = new Test();
  t1.multi();
  t1.add();
  t1.sub();
}}