public class Label_Break{

    public static void main(String[] args){
    
// for(int i=0;i<19;i++){
//     for(int j=0; j<i;j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }


outerLoop:
for(int i=0; i<10;i++){
    int j=0;
    while(j <=5){
        if(j==3) break outerLoop;
        System.out.print(j+" ");
        j++;
    }
    System.out.println();

    }

    }
}