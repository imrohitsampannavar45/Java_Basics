import java.util.Scanner;

public class LearnString{


    public static void main(String[] args){

System.out.println("Enter Your First Name");
Scanner sc = new Scanner(System.in);
// String firstname = sc.nextLine();
String firstname = sc.nextLine();

System.out.println("Enter your Last name");
String lastname = sc.next();

System.out.println("Your Full name is:" +firstname+" "+lastname);


    }
}