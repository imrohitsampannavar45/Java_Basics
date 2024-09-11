public class Ternery_Operators{

 public static void main(String[] args){

//A ternary Operator Evaluates the test Conidtion and Executes a block of Code Based on the Result of the Condition


int a = 12;
int b = 23;
int c = 123;
int max = 0;


// if(a>b){
//     max = a ;

// }else{
//     max = b;
// }


max = a>b ?a > c ? a : c  : b >c ? b :c;
System.out.println("value of Max " +max);

    }
} 