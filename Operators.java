public class Operators{

//Arithmetic Operators
    public static void main(String[] args){
        int a  = 10;
        int b = 20;

    int c = a +b; // addition Operator

    int d = a - b; // substraction operator

    int e = a * b; // multiply operator

    float f = a / b ;// division operator

    int g = a % b ; // modulus Operator

    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
    System.out.println(f);
    System.out.println(g);


// Assignment Operators
int x  = 200;
int y = 2000;
int result = x += y; // x = x + y
int result2 = x -= y; // x = x-y
int result3 = x *= y; // x = x*y
int result4 = x /= y; // x = x/y

System.out.println(result);
System.out.println(result2);
System.out.println(result3);
System.out.println(result4);



// Relational Operators 

int m = 100;
int n = 1000;
boolean p = (m!=n); // is not equal to 
boolean q = (m==n); // is equal to 
boolean r = (m < n); // is less than 
boolean s = (m > n); // is greater than 
boolean t = (m <= n); //  is less than equal to  
boolean u = (m >= n);  // is greater than equal to 
System.out.println(p); 
System.out.println(q);
System.out.println(r);
System.out.println(s);
System.out.println(t); 
System.out.println(u);



//logical operators

boolean ab =  12 == 12;
boolean cd = 11  > 11;
boolean val = ab && cd ;
boolean val2 = ab || cd;
System.out.println(val) ;
System.out.println(val2) ;
System.out.println(!ab) ;


//bitwise operators
//<< => Left Shift
// >> => Right Shift
// >>>  => Unsigned Right Shift
// &  => Bitwise AND
// ^ => Bitwise Exclusive OR
// ~ => Bitwise Complement


//Other Operators

//Increment and Decrement Operators 

// Increment  Operator

int nm = 500;
nm++; // 501 
System.out.println(nm);

//decrement Operator
int abc = 1000;
abc--; // 1000 - 1 = 999
System.out.println(abc);


 
    }
}