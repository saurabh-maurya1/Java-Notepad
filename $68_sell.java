class Demo {
 public static void main(String[] args) {
    int name[] = {1,4,2,5,7,3};
int temp, i,j;
 for(i=0; i<name.length; i++)
 { 
   for(j=i+1; j<name.length; j++)
 {
    if(name[i]>name[j]) 
 {
     temp = name[i];
    name[i] = name[j];
    name[j] = temp;
   }
  }
 }
for( i=0; i<name.length; i++){
       System.out.println(name[i]);
  }
 }
}