import java.util.Scanner;
class Duplicate {
  public void findDuplicate(String str ) {
   char[] ch =new char[str.length()];
   for(int i=0; i<str.length(); i++) {
      ch[i] = str.charAt(i);
     }
 
for(int i= 0; i<ch.length; i++) {
     int count =1;
    for(int j=i+1; j<ch.length; j++) {
        
      if((ch[i] == ch[j]) ) {
          System.out.print(ch[i]+" ");
            count++;
           }
       }
    if(count>1) {
      System.out.print(" = "+count);
        }
      System.out.println();
    }
  }
}
 
  class Test {
       public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
     System.out.println("Enter the String : "); 
       String str = sc.next();
   Duplicate d = new Duplicate();
         d.findDuplicate(str);
      }
}
  