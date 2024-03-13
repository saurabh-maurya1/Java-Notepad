 class Demo {
   public static void main(String[] args) {
      int[][] arr1={{10,20,30},{40,50,60},{70,80,90}};
      int[][] arr2={{1,2,3},{4,5,6},{7,8,9}};
     int [][] arr3=new int[arr1.length][arr1.length];
      for(int i=0; i<arr1.length; i++) {
          for(int j=0; j<arr1.length; j++) {
                int sum=0;
              for(int k=0; k<arr1.length; k++) {
                 sum = sum + (arr1[i][k]*arr2[k][j]);
                   }
                   arr3[i][j]=sum;
              }
           }
          System.out.println("Multiplication of Matrix is : ");
         for(int i=0; i<arr1.length;i++) {
            for(int j=0; j<arr1.length;j++) {
               System.out.print(arr3[i][j]+"\t");
              }
             System.out.println();
          }
       }
   }