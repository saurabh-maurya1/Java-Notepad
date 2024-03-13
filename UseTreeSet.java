import java.util.*;
class Demo {
   public static void main(String[] args){
  TreeSet<String> set = new TreeSet<>();
  set.add("Deepak");
  set.add("ajay");
  set.add("amit");
  set.add("anu");
 
  System.out.println("\n\n -*-print All element*-*-\n"+""+set);
  System.out.println("\n\n **Use descendingSet() :-\n"+""+set.descendingSet());

  System.out.println("\n\n ***Use hedSet() :-\n"+""+set.headSet("amit"));
  System.out.println("\n\n ***Use subSet() :-\n"+""+set.subSet("Deepak","amit"));
System.out.println("\n\n ***Use tailSet() :-\n"+""+set.tailSet("amit"));

}}



 /*

                         Output:-

 -*-print All element*-*-
[Deepak, ajay, amit, anu]


 **Use descendingSet() :-
[anu, amit, ajay, Deepak]


 ***Use hedSet() :-
[Deepak, ajay]


 ***Use subSet() :-
[Deepak, ajay]


 ***Use tailSet() :-
[amit, anu]

*/