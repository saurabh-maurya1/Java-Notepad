import java.util.*;
class Demo {
public static void main(String[] args){
HashSet<String> set = new HashSet<String>();
set.add("deepak");
set.add("ajay");
set.add("Arun");
set.add("anu");
HashSet<String> set1 = new HashSet<String>();
set1.add("a");
set1.add("b");
set1.add("c");
set1.add("d");
set1.add("e");
set.addAll(set1);
set.forEach(System.out::println);
}}