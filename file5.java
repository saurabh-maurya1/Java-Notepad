//BufferedWriter class 
 import java.io.*;
class Demo{
public  static void main(String[] args) throws IOException{
File f =new File("abc.txt");
FileWriter fw = new FileWriter(f);
BufferedWriter bw = new BufferedWriter(fw);
bw.write('a');
bw.newLine();
bw.write(100);
bw.newLine();
char ch[] = {'a','b','c'};
bw.write(ch);
bw.newLine();
bw.flush();
bw.close();
}}