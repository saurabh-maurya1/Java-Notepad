import java.util.Scanner;
class Test26 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the radius of the circle");
      double radius = sc.nextDouble();
      double area = ( Math.PI *radius*radius);
      System.out.println("Area of circle is : "+area);
  }
}
   