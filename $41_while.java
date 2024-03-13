import java.util.Scanner;
 class Demo {
        public static void main(String[] args) {
             int num;
 Scanner sc = new Scanner(System.in);
   System.out.println("Enter a number");
    num=sc.nextInt();
    int i=1;
    while(num!=0)
    { 
        int sqr;
       sqr = num*num;
       System.out.println("sqr of a Number : "+sqr);
        num = sc.nextInt();
 }
}
}