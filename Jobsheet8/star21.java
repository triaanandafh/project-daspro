import java.util.Scanner;
public class star21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.print("Enter value N = ");
        N = sc.nextInt();

        for(int i=0; i<=N; i++){
            System.out.print("*");
        }
    }
}
