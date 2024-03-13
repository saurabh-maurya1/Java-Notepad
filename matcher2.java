import java.util.regex.*;
class Demo {
public static void main(String[] args){
  Pattern p =Pattern.compile("\\s");
  String[] s =p.split("this is deepak gupta");
  for(String s1:s){
  System.out.println(s1);
}}}