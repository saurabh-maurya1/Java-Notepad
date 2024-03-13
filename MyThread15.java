class Delhi {
synchronized static void form(String str){
 for(int i=1; i<=3; i++) {
System.out.println("welcome"+str);
try{
   Thread.sleep(1000);
}
catch(InterruptedException ie) {
ie.printStackTrace();
}}}}
class Deepak extends Thread {
public void run(){
Delhi.form("Deepak");
}}
 class Ajay extends Thread {
public void run(){
Delhi.form("ajay");}}
class Kiran extends Thread {
public void run(){
Delhi.form("kiran");
}}
class Test{
public static void main(String[] args){
Deepak d = new Deepak();
d.start();
Ajay a = new Ajay();
a.start();
Kiran k =new Kiran();
k.start();
}}