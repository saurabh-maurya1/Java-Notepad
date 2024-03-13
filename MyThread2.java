class MyThread extends Thread {
   public void run() {
this.run(1);
for(int i=0; i<=10; i++ ) {
  System.out.println("User Thread1");
 }
}
public void run(int a) {
for(int i=0; i<=10; i++ ) {
  System.out.println("User Thread2");
 }
}
public static void main(String[] args) {
MyThread t1 = new MyThread();
t1.start();
for(int i=0;i<=10; i++) {
System.out.println("Main Thread") ;
 }
}
}