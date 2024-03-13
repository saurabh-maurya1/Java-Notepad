import java.util.*;
class Demo{
public static  void main(String[] args){
LinkedHashMap<Integer,String> map=new LinkedHashMap<Integer,String>();
map.put(1,"deepak");
map.put(2,"anu");
map.put(3,"deepak");
map.put(4,"anu");
map.remove(1);
for(Map.Entry m: map.entrySet()) {
System.out.println(m.getKey()+" "+m.getValue());
}}}