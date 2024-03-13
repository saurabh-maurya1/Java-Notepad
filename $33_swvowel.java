import java.util.Scanner;
    class Demo {
         public static void main(String[] args) {
            char ch;
            String str;
          Scanner sc = new Scanner(System.in);
           System.out.println("Enter your character a-z ");
               str = sc.next();
             if(str.matches("[a-zA-Z]")) {
                 ch = str.charAt(0);
                 String result;
                    switch(ch) {
                   case 'a':
                       result ="Vowel";
                       break;
                   case 'e':
                       result ="Vowel";
                       break;
                   case 'i':
                       result ="Vowel";
                       break;
                   case 'o':
                       result ="Vowel";
                       break;
                   case 'u':
                       result ="Vowel";
                       break;
                   case 'A':
                       result ="Vowel";
                       break;
                   case 'E':
                       result ="Vowel";
                       break;
                   case 'I':
                       result ="Vowel";
                       break;
                   case 'O':
                       result ="Vowel";
                       break;
                   case 'U':
                       result ="Vowel";
                       break;
                   default :
                      result = "Consonent";
              }
              System.out.println("It is "+result);
          }
           else {
                  System.out.println("Enter the valid character");
                 }  
     }
}  