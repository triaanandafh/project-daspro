import java.util.Scanner;
public class square21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
    int N;
    System.out.print("Enter value N = ");
    N = sc.nextInt();
    for(int j=1; j<=N ; j++){
        for(int i=0; i<=N; i++){
            System.out.print("*");
        }
        // System.out.println();
    }
    
    
    }
}
