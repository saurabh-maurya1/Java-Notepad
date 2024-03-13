// wap to find grande of a student using if else if statement
import java.util.Scanner;
  class Demo {
   public static void main(String[] args) {
  double marks;
  char grade=0 ;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the marks");
  marks = sc.nextDouble();
  if(marks<100&&marks>=90) {
   grade = 'A';
  } 
else if (marks>=80&&marks<90) {
   grade = 'B';
} 
else if (marks >=70&&marks<80) {
  grade = 'C';
 }
else if (marks >=60&&marks<70) {
  grade = 'D';
 }
  else if (marks >=50&&marks<60){
  grade = 'E';
} 
else if (marks >=0&&marks<50){
  grade = 'F';
}
else{
System.out.println("Enter a valid Marks");
}
System.out.println("Grade : "+grade);
}}