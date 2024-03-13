import java.util.*;
class Emp {
  int id;
long phone;
String name,email,address;
Emp(int id,long phone,String name,String email,String address){
this.id = id;
this.phone = phone;
this.name = name; 
this.email = email;
this.address = address;
}
public static void main(String[] args){
List<Emp> e = new ArrayList<Emp>();
Emp e1 = new Emp(01,8953833470L,"Saurabh Maurya","saurabh@gmail.com","Lucknow");
Emp e2 = new Emp(02,9839392392L,"Deepak Gupta ","deepak@gmail.com","Delhi");
Emp e3 = new Emp(03,8964333470L,"Ajay Kumar","ajay@gmail.com","Mumbai");
Emp e4 = new Emp(04,9123392392L,"Ashish Singh ","ashish@gmail.com","Banglore");
e.add(e1);
e.add(e2);
e.add(e3);
e.add(e4);
for(Emp es:e){
System.out.println();s
System.out.println("Emp Id "+es.id);
System.out.println("Name "+es.name);
System.out.println("Email "+es.email);
System.out.println("Phone "+es.phone);
System.out.println("Address "+es.address);
System.out.println("\n");
}
}}