import java.io.*;
class Demo{
public static void main(String[] args) throws IOException {
File file = new File("abc.txt");
System.out.println(file.exists());
file.createNewFile();
System.out.println(file.exists());
}}