  import java.util.*;
  class Emp {
   int rollNo;
   long phone;
  String name;
  String Address;
public Emp (int r,long phone,String name,String Add){
this.rollNo = r;
this.phone = phone;
this.name = name ;
this.Address = Add;
}
}
class Demo {
 public static void main(String[] args) {
  HashSet<Emp> h = new HashSet<>();
   Emp e1 = new Emp(123,894545434434L,"Saurabh Maurya","Delhi");
 Emp e2 = new Emp(23,85455434434L,"Ajay","Delhi");
 Emp e3 = new Emp(13,9845434434L,"Deepak","Noida");
 Emp e4 = new Emp(3,794545434434L,"Arun","Lucknow");
h.add(e1);
  h.add(e2);
h.add(e3);
h.add(e4);

for(Emp em : h){
System.out.println("Name "+em.name);
System.out.println("RollNo "+em.rollNo);

System.out.println("Phone "+em.phone);

System.out.println("Address "+em.Address);
System.out.println();
 }
}}