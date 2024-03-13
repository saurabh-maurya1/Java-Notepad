import java.util.Scanner;
    class Array {
          public static void main(String[] args) {
           int sum=0;
       Scanner sc = new Scanner(System.in);
            System.out.println("Enter the row :");
              int row = sc.nextInt();
             System.out.println("Enter the col :");
               int col = sc.nextInt();
         int[][] arr= new int[row][col];
            System.out.println("Enter the element ");
           for(int i=0; i<arr.length; i++) {
                for(int j=0; j<arr.length; j++){
                  arr[i][j]=sc.nextInt();
               }
            }
         for(int i=0; i<arr.length; i++) {
                for(int j=0; j<arr.length; j++){
                 sum = sum+ arr[i][j];
               }
            }
         System.out.println("Total sum is :"+sum);
    }}