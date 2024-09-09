import java.util.Scanner;

public class Loops{



    public static  void main(String[] args){

        // for loops
        // while loops
        // do while loops
        // break and contiune Statements
        // Nested loops
        // labelled break and continue Statements


        //elements of java loops
        
        // * Initialization Expressions
        // * Test Expression (condition)
        // * Update Expression
        // * Body of the loop

// intialization ; condition ; Increment   //  For Loop
// for(int i=0;i<5000;i++){
//     System.out.println("Hello World");

// }


Scanner sc = new Scanner(System.in);
System.out.println("Enter a Number");
int n = sc.nextInt();
for(int i=0; i<=10; i++){
    System.out.println(n+" * "+i+" = "+i*n);

    }
    
}
}

