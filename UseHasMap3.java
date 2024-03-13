import java.util.*;
class Student {
int rollNo;
String name,email,course;
Student(int rollno,String name , String email,String course){
this.rollNo = rollno;
this.name = name;
this.email = email;
this.course = course;
}
public static void main(String[] args){
LinkedHashMap<Integer,Student> map=new LinkedHashMap<>();
Student s1=new Student(101,"deepak","deepak@gmail.com","java");
Student s2=new Student(102,"deepak","deepak@gmail.com","java");
Student s3=new Student(103,"deepak","deepak@gmail.com","java");
Student s4=new Student(104,"deepak","deepak@gmail.com","java");
map.put(1,s1);
map.put(2,s2);
map.put(3,s3);
map.put(4,s4);
for(Map.Entry<Integer,Student>  m:map.entrySet()){
Student s=m.getValue();
System.out.println(s.rollNo);
System.out.println(s.name);
System.out.println(s.email);
System.out.println(s.course);
}}}