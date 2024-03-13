class Demo {
 int empId = 10; //non-static variable
String name = "deepak";
static String company = "TCS";//static variable
public static void dsp() {
Demo d = new Demo();
System.out.println("Emp Id : "+d.empId);
System.out.println("Emp Name : "+d.name);
System.out.println("Company Name "+company);
}
public static void main(String[] args){
Demo.dsp();
}}