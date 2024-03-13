import java.util.Scanner;
class Parent {
 double child;

  Parent(){
   int count =1;
 Scanner sc =new Scanner(System.in);
 
 System.out.println("Enter Child percetage ");
 child = sc.nextDouble();


  }
}
class Child1 extends Parent {
 String str;
 Child1 (){
    a(child);
 }


 public void a(double child) {

  
  System.out.println("Child1 Grade");
  if(child >=90 && child <=100 ) {
      str = "A";
  }else if(child >=80 && child <90 ) {
         str = "B";

  }else if(child >=70 && child <80 ) {
         str = "C";
}else if(child >=60 && child <70 ) {
         str = "D";
}else if(child >=50 && child <60 ) {
         str = "E";
}else {
     str = "fail";
 }
 System.out.println(str);
}
}
class Child2 extends Parent {
   Child2 (){

    b(child); }
   String str;
 public void b(double child) {

  System.out.println("Child2 Grade");
  if(child >=90 && child <=100 ) {
      str = "A";
  }else if(child >=80 && child <90 ) {
         str = "B";

  }else if(child >=70 && child <80 ) {
         str = "C";
}else if(child >=60 && child <70 ) {
         str = "D";
}else if(child >=50 && child <60 ) {
         str = "E";
}else {
     str = "fail";
 }
 System.out.println(str);
}
}
class Test {
 public static void main(String[] args) {
   Child1 c1 = new Child1();

 
   Child2 c2 = new Child2();

   
     }}