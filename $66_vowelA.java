import java.util.Scanner;
class Demo {
     public static void main(String[] args) {
     int size;
   Scanner sc=new Scanner(System.in); 
     System.out.println("Enter the size of array");
     size =sc.nextInt();
  char[] array =new char[size];
     System.out.println("Enter the Character : "+size);
      for(int i=0; i<size; i++ ){
        array[i]=sc.next().charAt(0);
       } System.out.println("Vowel is :");
         for(char x:array) {
           if(x=='A'||x=='E'||x=='I'||x=='O'||x=='U'||
              x=='a'||x=='e'||x=='i'||x=='o'||x=='u') {
              System.out.print(x+" ");
            }
         }
   }
}