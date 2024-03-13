class MyThread extends Thread {
public void run(){
Thread.yield();
for(int i=0; i<=5; i++){
System.out.println("User Thread");
try{
Thread.sleep(1000);
}
catch(InterruptedException e){
System.out.println("interrupted method called");
}}}
public static void main(String[] args){
MyThread t1=new MyThread();
t1.start();
t1.interrupt();
}}