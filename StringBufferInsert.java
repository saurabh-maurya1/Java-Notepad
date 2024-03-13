class Test {
  public static void main(String[] args) {
 StringBuffer sb1=new StringBuffer("deepak");
sb1.insert(3,"Maurya");
System.out.println(sb1);
StringBuffer sb2 = new StringBuffer("deepak");
sb2.insert(6,123);
System.out.println(sb2);
StringBuffer sb3 = new StringBuffer("deepak");
sb3.insert(6,sb2);
System.out.println(sb3);
}
}