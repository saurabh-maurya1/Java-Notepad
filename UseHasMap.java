import java.util.*;
class Demo {
 @SuppressWarnings("unchecked")
    public static void main(String[] args) {
Map map = new HashMap();
map.put(1,"Deepak");
map.put(2,"anu");
map.put(3,"deepak");
map.put(4,"anu");
map.put(5,"deepak");
map.put(1,"anu");
Set set=map.entrySet();
Iterator itr = set.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}
}}