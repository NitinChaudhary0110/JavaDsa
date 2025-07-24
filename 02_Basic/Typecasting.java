public class Typecasting {
     public static void main(String args[]){
        //Type casting  --> Narrowing conversion ,Explacit conversion 

        // Data Loss

        float math_marks = 98.9f;
        int marks_out_of_100=(int)math_marks;

        System.out.print(marks_out_of_100);//98  --> data loss,(98.9) --> 98
    }
}
