class MyRunnable implements Runnable {
public void run(){
for(int i=0; i<=3; i++) {
System.out.println("User Thread");
try{
Thread.sleep(1000);
}
catch(InterruptedException ie ) {
ie.printStackTrace();
}
}}
public static void main(String[] args){
MyRunnable r=new MyRunnable();
Thread t1 = new Thread(r);
t1.start();
for(int i=0;i<=3; i++){
System.out.println("Main thread");
try{
Thread.sleep(1000);
}catch(InterruptedException ie){
ie.printStackTrace();
}}}}
