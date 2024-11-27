import java.util.Scanner;
public class segitga {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int r,c;

        for(r=0;r<10;r++){
            for(c=0;c<=r;c++){
                System.out.print("* ");
            }System.out.println();
        }
    }
}
