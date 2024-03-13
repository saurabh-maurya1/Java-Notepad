//static variable :
class Test5 {
  static int st;
 static String sum="The sum of a and b";
 static String diff = "The difference of a and b ";
public static void main(String[] args) {
  int a=4 ,b=5;
  int c= a+b;
  int d = a-b;
System.out.println(sum+" "+c);
System.out.println(diff+" "+d);
System.out.println(st+" not initialize");
  }
}
 