import java.util.Scanner;

public class input{

    public static void main(String[] args){
        
System.out.println("enter your first name");
Scanner sc = new Scanner(System.in);
String name = sc.nextLine();

System.out.println("enter your last name");
String lastname = sc.nextLine();

System.out.println("enter your Phone Number");
String p_num = sc.nextLine();
 
System.out.println("enter your age");
int age = sc.nextInt();




System.out.println("Your  First name is "+name);
System.out.println("Your Last name is" +lastname);
System.out.println("YOur age  is " +age);
System.out.println("Your Phone Number is " +p_num);




sc.close(); // need to close this to clear the garbage collector to avoid memory storage everytime use Scanner class

    }
}