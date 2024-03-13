import java.util.regex.*;
class Demo {
public static void main(String[] args){
Pattern  p = Pattern.compile("[^abc]");
Matcher m = p.matcher("d73c#z122");
while(m.find()){
System.out.println(m.start()+"  "+m.group());
}}}