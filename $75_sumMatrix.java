
  class Demo {
   public static void main(String[] args) {
      
      int[][] arr1={{10,20,30},{40,50,60},{70,80,90}};
      int[][] arr2={{100,200,300},{400,500,600},{700,800,900}};
     int [][] arr3=new int[arr1.length][arr1.length];
    for(int i=0; i<arr1.length;i++) {
         for(int j=0; j<arr1.length;j++) {
            arr3[i][j]= arr1[i][j]+ arr2[i][j];
            }
       }
   System.out.println("Sum of Matrix is : ");
for(int i=0; i<arr1.length;i++) {
         for(int j=0; j<arr1.length;j++) {
            System.out.print(arr3[i][j]+"\t");
            }
          System.out.println();
       }
   }
 }