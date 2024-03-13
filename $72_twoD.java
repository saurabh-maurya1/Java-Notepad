import java.util.Scanner;
  class Demo {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
             System.out.println("Enter row of array") ;
                int row = sc.nextInt();
             System.out.println("Enter col of array");
                int col = sc.nextInt();
           int[][] arr=new int[row][col];
            System.out.println("Enter the element");
             for(int i=0; i<arr.length;i++){
                  for(int j=0; j<arr.length; j++) {
                    arr[i][j]=sc.nextInt();
                   }
               }
            for(int k=0; k<arr.length; k++) {
                 for(int l=0; l<arr.length; l++) {
                   System.out.print(arr[k][l]+"\t");
                 }
                System.out.println();
              }
          }
}
                        