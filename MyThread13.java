class MyThread extends Thread {
public void run(){
Thread.yield();
for(int i=0;i<=5;i++){
System.out.println(Thread.currentThread().getName()+" "+i);
try{
Thread.sleep(1000);
}catch(InterruptedException e) {
e.printStackTrace();
}}}
public static void main(String[] args)throws InterruptedException{
MyThread t1 = new MyThread();
t1.start();
for(int i=0;i<=5; i++){
System.out.println(Thread.currentThread().getName()+" "+i);
try{
Thread.sleep(1000);
}
catch(InterruptedException e){
e.printStackTrace();
}}}}