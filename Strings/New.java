public class New{



    public  static void main(String[] args){
    //Basic of String
    // How to create String in Java
    // How strings are stored in Java
    // immutabiility of String
    // Comparing two strings in Java
    // java String Methods   


String name = "Rohit";
String samename = "Rohit";

String newName = new String("ROhit");


System.out.println(name);
System.out.println("Rohit Sampannavar");


// if(name == samename) {
//     System.out.println("Both are Same");
// }

// if(name == newName) {
//     System.out.println("Both are Same");
// }else{
//     System.out.println("Both are not Same");
// }



if(name.equals(newName)){
    System.out.println("name and newname have same values");
}else{
    System.out.println("Not Same");
}

if(name.equalsIgnoreCase(newName)){
    System.out.println("name and newname have same values");
}else{
    System.out.println("Not Same");
}













    }
}