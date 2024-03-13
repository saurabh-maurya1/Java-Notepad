class MyThread extends Thread {
public void run(){
for(int i=0; i<=5; i++){
System.out.println("User Thread");
try{
   Thread.sleep(1000);
}
catch(InterruptedException ie){
ie.printStackTrace();
}
}
}
public static void main(String[] args) throws InterruptedException{
MyThread t1 = new MyThread();
t1.start();
t1.join();
for(int i=0;i<=5;i++){
System.out.println("main Thread");
try{
Thread.sleep(1000);
}
catch(InterruptedException ie) {
ie.printStackTrace();
}}}}