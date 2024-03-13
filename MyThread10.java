class MyThread extends Thread {
 public  void run() {
  for(int i=0; i<=10; i++) {
  System.out.println("User thread");
 try {
    Thread .sleep(1000);
} catch (InterruptedException ie) {
 ie.printStackTrace();
}
}}
public static  void main(String[] args) {
  MyThread t1 = new MyThread();
t1.setDaemon(true);
t1.start();
for(int i=0; i<=5; i++) {
System.out.println("main thread");
try{
      Thread.sleep(1000);
}
catch(InterruptedException ie){
 ie.printStackTrace();
}
}}}
