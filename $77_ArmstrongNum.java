import java.util.Scanner;
// Check no is armstrong or not
public class Test {
    public static void main(String[] args) {
     //user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no :");
          int num = sc.nextInt();
          int count,sum;
          count = sum = 0;
         int numCopy = num;
        //count digit
        while(numCopy>0) {
            count++;
            numCopy  /=10;
        }
         numCopy = num;
        //create a loop find digit  power and sum of digit
        while(numCopy>0){
            int digit = numCopy % 10;
            sum = sum + (int)Math.pow(digit,count);
            numCopy /=10;
        }
        //Check a no if no is armstrong print else print not armstrong
        if(num == sum ) {
            System.out.println("It is Armstrong No :");
        } else {
            System.out.println("It is not Armstrong No :");
        }


    }
}
