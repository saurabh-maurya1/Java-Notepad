// Thread Priority: 

class MyThread extends Thread {
public void run() {
System.out.println("Thread Running ......");
}
public static void main(String[] args) {
MyThread t1 = new MyThread();
   System.out.println(t1.getPriority());
System.out.println(Thread.MIN_PRIORITY);
System.out.println(Thread.NORM_PRIORITY);
System.out.println(Thread.MAX_PRIORITY);
t1.setPriority(9);
System.out.println(t1.getPriority()); 
}
}