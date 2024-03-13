import java.util.Scanner;
  class Demo {
   public static void main(String[] args) {
   int num ;
   String Day=null;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number 1 to 7");
      num = sc.nextInt();
   switch(num) {
    case 1:
         Day = "Monday";
        break;
 case 2:
        Day = "Tuesday";
        break;
 case 3:
       Day = "Wednesday";
        break;
 case 4:
       Day = "Thursday";
        break;
case 5:
        Day = "Friday";
        break;
 case 6:
       Day = "Saturday";
        break;
 case 7:
       Day = "Sunday";
        break;
default: 
      System.out.println("Invalid entry");
}
System.out.println(Day);

}
}