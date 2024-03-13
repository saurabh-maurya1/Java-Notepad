class MyThread extends Thread {
   public void run() {
this.a();
this.b();
}
public void a(){
for(int i=0; i<=10; i++ ) {
  System.out.println("User Thread1 a() method");
 }
}
public void b() {
for(int i=0; i<=10; i++ ) {
  System.out.println("User Thread2 b() method");
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