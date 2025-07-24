public class Data_type {
    public static void main(String args[]){

         // (1)byte  --> 1byte

       System.out.println(Byte.MIN_VALUE);//-128
       System.out.println(Byte.MAX_VALUE);//127

         //(2)Short -->2byte

        System.out.println(Short.MIN_VALUE);//-32768
        System.out.println(Short.MAX_VALUE);//32767

         //(3)Integer --> 4byte

        System.out.println(Integer.MIN_VALUE);//-2147483648
        System.out.println(Integer.MAX_VALUE);//2147483647

        //(4)Long -->8byte

        System.out.println(Long.MIN_VALUE);//-9223372036854775808      
        System.out.println(Long.MAX_VALUE);//9223372036854775807
        
        //(5)float -->4byte
         System.out.println(Float.MIN_VALUE);//1.4E-45
         System.out.println(Float.MAX_VALUE);//3.4028235E38
      
        //(6)Double -->8 byte
         System.out.println(Double.MIN_VALUE);//4.9E-324
         System.out.println(Double.MAX_VALUE);//1.7976931348623157E308

         //(7)Char -->2byte

         System.out.println((int)Character.MIN_VALUE);//0
         System.out.println((int)Character.MAX_VALUE);//65535
        
         //(8)Boolean -->1byte

         boolean istrue=true;
         boolean isfalse=false;

         System.out.println(istrue);
         System.out.println(isfalse);




      
    }
}

