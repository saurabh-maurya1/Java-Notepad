import java.util.*;
class Test {
 public static void main(String[] args) {
 StringBuffer sb1 = new StringBuffer("");
System.out.println(sb1.capacity());
sb1.ensureCapacity(14);
System.out.println(sb1.capacity());
sb1.ensureCapacity(16);
System.out.println(sb1.capacity());
sb1.ensureCapacity(17);
System.out.println(sb1.capacity());

}
}