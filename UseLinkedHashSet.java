import java.util.*;
class Demo {
 public static void main(String[] args){
LinkedHashSet<String> set = new LinkedHashSet<>();
set.add("deepak");
set.add("ajay");
set.add("amit");
set.add("anu");

LinkedHashSet<String> set1 = new LinkedHashSet<>();
set1.add("a");
set1.add("b");
set1.add("c");
set1.add("d");
set1.add("e");
set.addAll(set1);
for(String str :set){
System.out.println(str);
}}}
