class MyThread extends Thread {
public void run() {
System.out.println("Hook Functionality....");
}
public static void main(String[] args) {
MyThread t1 = new MyThread();
Runtime r= Runtime.getRuntime();
r.addShutdownHook(t1);
for(int i=0; i<=10; i++) {
System.out.println("mainThread");
try{
  Thread.sleep(1000);
} 
catch (InterruptedException ie) {
 ie.printStackTrace();
}
if(i==2) {
 System.exit(0);
   }
  }
 } 
}