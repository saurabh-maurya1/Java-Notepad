// data Type Size

  class Test10 {
    public static void main(String[] args) {
      int sizeof_int = Integer.SIZE/8;
      int sizeof_char = Character.SIZE/8;
      int sizeof_short = Short.SIZE/8;
      int sizeof_byte = Byte.SIZE/8;
      int sizeof_long = Long.SIZE/8;
      int sizeof_double = Double.SIZE/8;


       System.out.println("Byte    : "+sizeof_byte);  
       System.out.println("Short   : "+sizeof_short);
       System.out.println("Char    : "+sizeof_char);
       System.out.println("Int     : "+sizeof_int);
       System.out.println("Long    : "+sizeof_long);
       System.out.println("Double  : "+sizeof_double);
     




 }
}