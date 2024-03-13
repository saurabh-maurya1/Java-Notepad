/********************************
        Static variable
********************************/


  class Test6 {
     int id;  // non-static variable 
 String course; 
 String name;
static String company = "Ducat";
static int st;  // static variable which is not initialize

 public static void main(String[] args) {
     Test6 s = new Test6();
     st= 8;
    s.id = 1;
     s.course = "java" ;
    s.name = "deepak";  
    System.out.println(s.id+" "+s.course+" "+s.name+" "+company+" "+st);
 Test6 s1 = new Test6();
  st =9;
 s1.id = 2;
 s1.name ="Saurabh";
 s1.course = "java";
System.out.println(s1.id+" "+s1.course+" "+s1.name+" "+company+" "+st);
Test6 s2 = new Test6();
System.out.println(s2.st);
    }
 }