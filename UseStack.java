import java.util.*;
class UseStack{
 public static void main(String[] args) {
Stack<Integer> s = new Stack<>();
boolean b = s.empty();
System.out.println(b);
s.push(10);
s.push(20);
s.push(30);
s.push(40);
s.push(50);

System.out.println(s.empty());
s.forEach(System.out::println);
System.out.println("\n\n");
Iterator itr = s.iterator();
while(itr.hasNext()) {
System.out.println(itr.next());
}
System.out.println("\n\n");
System.out.println(s.pop());
System.out.println(s.peek());


}}