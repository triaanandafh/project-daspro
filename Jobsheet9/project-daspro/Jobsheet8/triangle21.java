import java.util.Scanner;
public class triangle21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, i;
        System.out.print("Enter value N = ");
        N = sc.nextInt();

        i=0;
        while(i <= N){
            int j = 0;
            while(j < i){
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
