import java.util.Scanner;
public class displayTwo21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numInput;

        System.out.print("Input some number: ");
        numInput = scanner.nextInt();

        for(int i = 2; i<= numInput; i+=2){
            
                System.out.printf("%d ", i);
            
        }
        System.out.print(" %");
    }
}










// for(int i = 1; i<= numInput; i++){
//     if(i%2 == 0){
//         System.out.println("2 multiple: "+i);
//     }
// }