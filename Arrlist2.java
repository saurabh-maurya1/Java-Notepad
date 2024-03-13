import java.util.*;
class Demo {
     public static void main(String[] args){
ArrayList<String> l1 = new ArrayList<String>();
l1.add("Deepak");
l1.add("Deepak");
l1.add("ajay");
System.out.println(l1);
Collections.sort(l1);

System.out.println("**************forEachLoop********************");
for(String str:l1) 
System.out.println(str);
System.out.println("--------------get() method--------------------");
System.out.println(l1.get(2));
System.out.println("**************remove() method -----------------");
l1.remove("ajay");
System.out.println(l1);
System.out.println("**************set() method (replace) -----------------");

l1.set(1,"Anu");
System.out.println(l1);
}}