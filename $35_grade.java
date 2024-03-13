import java.util.Scanner;
    class Demo {
         public static void main(String[] args) { 
         int marks;   
         char grade;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks");
         marks = sc.nextInt();
         if(marks>=0 && marks<=100) 
        {
         switch(marks/10) {
          case 10 :
          case 9 :
                   grade = 'A';
                     break;
          case 8 :
                   grade = 'B';
                     break;
          case 7 :
                   grade = 'C';
                     break;
          case 6 :
                   grade = 'D';
                     break;
          case 5 :
                   grade = 'E';
                     break;

           default : 
                    grade = 'F';
             }
          System.out.println("Grade : "+grade);
       }
         else {
               System.out.println("Invalid marks");
             }
   }
}