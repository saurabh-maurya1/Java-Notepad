class MyThread extends Thread {
 public void  run() {
}
public static void main(String[] args) {
 MyThread t1=new MyThread();
t1.start();
System.out.println(t1.getName());
MyThread t2 = new MyThread();
 t2.start();
System.out.println(t2.getName());
System.out.println(Thread.currentThread().getName());


 }
}