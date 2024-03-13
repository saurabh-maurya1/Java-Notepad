class Stack {
 private int size;
 private int top=-1;
 private String[] arr;
 public Stack(int s) {
      this.size = s;
    arr=new String[size];
         }
  
public void push(String element) {
      if(isFull()) {
          throw new RuntimeException("Stack is OverFlow");
       }
      top++;
  arr[top]=element;
   }
 public String pop() {
     if(isEmpty()){
          throw new RuntimeException("Stack is UnderFlow");
      }
     String ele = arr[top];
         top--;
       return ele;
    }

public boolean isEmpty() {
          return top==-1; 
       }
public boolean isFull() {
         return top==size-1;
   }
}


public class Practise {
public static void main(String[] args) {
      String str ="{([((((()))))])}";
       Execution s = new Execution(str.length);
          boolean b;
       for(int i=0; i<str.length; i++) {
           b = s.result(str[i]);
          }
          System.out.println(b);
    }
  }
