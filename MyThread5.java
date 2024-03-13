class MyThread extends Thread {
     public void run() {
  }
public static void main(String[] args) {
MyThread t1 = new MyThread();
t1.start();
t1.setName("kiran");
System.out.println(t1.getName());
MyThread t2 = new MyThread();
t2.start();
t2.setName("Pooja");
System.out.println(t2.getName());
Thread.currentThread().setName("Saurabh");
System.out.println(Thread.currentThread().getName());
}
}
