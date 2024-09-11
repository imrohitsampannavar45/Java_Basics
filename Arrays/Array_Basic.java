public class Array_Basic{

    public static void main(String[] args){

// How do the Arrays work?
// Creating and Declaring Arrays
// For-Each Loop
// Multi Dimensional Arrays

// int age[]; //declaration

// age = new int[10]; //allocation

// int age[] = new int[5]; //both declaration and allocation
// age [0] =  5;
// age [1] = 2;
// age[2] = 10;
// age[4]= 99;
// // System.out.println(age[3]);


//array length finding 
// System.out.println(age.length);



// int marks[] = {12,22,45,66,78,99};
// System.out.println(marks[0]);
// System.out.println(marks[5]);

// Exception Error Array index out of bound exception
// System.out.println(marks[10]);



String names[] = {"Ram", "Rohit", "Harish", "Monty"};


for (int i=0;i<names.length;i++){
    System.out.println("the names are " +names[i]);
}

    }
}