import java.util.*;
class Demo {
    public static void main(String[] args) {
LinkedList<String> l = new LinkedList<String>();
l.add("deepak");
l.add("ajay");
l.add("deepak");
l.add("ajay");
l.set(0,"gupta");
for(String str : l){
System.out.println(str);
}
l.addFirst("anu");
System.out.println(l);
}}