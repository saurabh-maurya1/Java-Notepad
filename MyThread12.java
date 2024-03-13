class Passport extends Thread {
public void run() {
try{
System.out.println("Form start");
Thread.sleep(3000);
System.out.println("Form Completed");
}
catch(InterruptedException ie){
ie.printStackTrace();
}}}
class OfficerCall extends Thread {
public void run(){
try{
System.out.println("Document Verification start");
Thread.sleep(3000);
System.out.println("Document Verification Completed");
}
catch(InterruptedException ie){
ie.printStackTrace();
}}}
class Recived extends Thread {
public void run(){
try {
System.out.println("visit passport Office");
Thread.sleep(3000);
System.out.println("Finaly recieved passport");
}
 catch(InterruptedException ie){
ie.printStackTrace();
}}
public static void main(String[] args) throws InterruptedException {
Passport p = new Passport();
p.start();
p.join();
OfficerCall o= new OfficerCall();
o.start();
o.join();
Recived r = new Recived();
r.start();
r.join();
}}