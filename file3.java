import java.io.*;
class Demo {
  public static void main(String[] args)throws IOException{
  int count =0;
File file = new File("C:\\Java Notepad");
String[] str =file.list();
for(String s:str){
File fi = new File(file,s);
if(fi.isFile()){count++;
System.out.println(s);
}}
System.out.println("TotalFile "+count);
}}




/**

import java.io.*;
class Demo {
  public static void main(String[] args)throws IOException{
  int count =0;
File file = new File("C:\\Java Notepad");
String[] str =file.list();
for(String s:str){
File fi = new File(file,s);
if(fi.isDirectory()){count++;
System.out.println(s);
}}
System.out.println("TotalFile "+count);
}}

*/