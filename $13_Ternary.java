class Test13 {
public static void main(String[] args) {
Test13 t1 = new Test13();
System.out.println(t1 instanceof Test13);
Thread t2 = new Thread();
System.out.println(t2 instanceof Thread);
Object obj = new Object();
System.out.println(obj instanceof Object);
//Thread t3 = new Thread();
//System.out.println(t3 instanceof String);
}
}