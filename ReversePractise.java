import java.util.*;
class Test {
       public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
System.out.println("Enter the String");
String s = sc.next();
StringBuffer sb=new StringBuffer(s);
 sb.reverse();
if(s.contentEquals(sb)){
System.out.println("Palindrome");
}else {
System.out.println("Not Palindrome");
}

}}

