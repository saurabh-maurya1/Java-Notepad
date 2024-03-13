import java.io.*;
class Demo {
  public static void main(String[] args) throws IOException{
File f =new File("abc.txt");
 FileReader fr = new FileReader(f);
BufferedReader br = new BufferedReader(fr);
String data = br.readLine();
  while(data!=null){
System.out.println(data);
data = br.readLine();
}}}