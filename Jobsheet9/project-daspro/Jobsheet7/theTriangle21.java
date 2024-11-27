import java.util.Scanner;
public class theTriangle21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int numInput;
        int i;
        String s = "";

        System.out.print("Input some number: ");
        numInput = scanner.nextInt();

        for (i = 0 ;i < numInput; i++) {
            s += " *";
            System.out.println(s);
            
        }
    }
}
