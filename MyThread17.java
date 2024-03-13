class MyRunnable {
public static void main(String[] args){
Runnable r= new Runnable(){
public void run(){
for(int i=0; i<=3; i++){
System.out.println("Main Thread");
try{
Thread.sleep(1000);
}
catch(InterruptedException ie){
ie.printStackTrace();
}}
}};
Thread t1 = new Thread(r);
t1.start();
}}