import java.util.*;
class MapDemo{
     public static void main(String[] args){
Map<Integer,String> map = new HashMap<Integer,String>();
map.put(1,"deepak");
map.put(2,"anu");
map.put(3,"deepak");
map.put(4,"anu");
map.put(5,"deepak");
map.put(6,"anu");
for(Map.Entry m: map.entrySet()) {
System.out.println(m.getKey()+" "+m.getValue());
}}}