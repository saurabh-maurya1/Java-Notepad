import java.util.regex.*;
class Demo {
public static void main(String[] args){
Pattern p = Pattern.compile("ab");
Matcher m = p.matcher("abababbaab");
while(m.find()) {
System.out.println(m.start()+" "+m.group());
}}}