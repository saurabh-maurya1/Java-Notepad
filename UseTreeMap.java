import java.util.*;
class Demo {
    public static void main(String[] args){
TreeMap<Integer,String> tree= new TreeMap<>();
tree.put(103,"deepak");
tree.put(106,"ajay");
tree.put(101,"rahul");
tree.put(102,"anu");
for(Map.Entry m:tree.entrySet()){
System.out.println(m.getValue());
}
System.out.println(tree.headMap(103,true));
}}