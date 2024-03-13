class Student {
  String name;
  String emailId;
  long contactNo;
  String address;
  String course;
void print() {
  System.out.println("Name : "+name+"\nEmailId : "
                    +emailId+"\nContact No : "+contactNo+
                     "\nAddress : "+address+"\nCourse : "+course);

  }
}
class SubStudent extends Student {
  SubStudent(String na,String em,long co,String add,String con){
    name = na;
    emailId = em;
    contactNo = co;
    address = add;
    course = con;
 }
}
class Demo {
   public static void main(String[] args) {
  SubStudent  s = new  SubStudent("Saurabh Maurya",
"saurabh@gmail.com",8953833470L,"Lucknow","B.tech");
s.print();
  }
}
