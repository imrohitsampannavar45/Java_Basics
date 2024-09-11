public class Methods1{


public static void main(String[] args){
greet();
average(3,4);
multiply(2,9);
}

//how do the functions work?
// declaring a java method
// calling a method
// method return type
//method parameters
//math library methods

 static void greet(){
    System.out.println("Hello World");
}

public static int average(int a, int b){
int sum = a + b ;
System.out.println("Sum is " +sum);
return sum;
}

public static int multiply(int a, int d){
    int multi = a*d;
    System.out.println("The total Multiplication is " + multi);
    return multi;
}





}