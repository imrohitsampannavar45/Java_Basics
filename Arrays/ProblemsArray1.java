public class ProblemsArray1{


public static void main(String[] args){


int numbers[] = {23,12,44,55,66,75};

// int sum = 0;

// for (int number: numbers){
//     sum += number;
// }
//  System.out.println("Sum is " +sum );



// int min = Integer.MAX_VALUE;

// for (int number : numbers){
//     if (number < min){
//         min = number; 
//     }
 
// }

//    System.out.println(min);


int max = Integer.MIN_VALUE;


for(int number: numbers){
    if(number > max){
        max = number;
            }
}
System.out.println(max);

}

}