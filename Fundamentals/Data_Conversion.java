// Implicit Conversion 
public class Data_Conversion{


            //Implicitly Conversion
    public static void main(String[] args){
        int count = 12;
        //int can be stored in Long small bucket to large bucket 
        long countLong = count;



        long count1= 12;
//long cannot be stored in int large value bucket into small cbucket cannot be stored
        int countInt =(int) count1;
// this is called Explicit TypeCasting 
        System.out.println(countInt);




// example 2 
            int age  = 127;
            byte newAge =(byte) age;
            System.out.println(newAge);

    }
}