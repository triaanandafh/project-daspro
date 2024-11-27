import java.util.Scanner;
public class assignment5 {
    public static void main(String[] args) {
        
       Scanner sc= new Scanner(System.in);
       int N;
       int [] numbers = {10,25, 30, 45, 50, 65, 70, 85, 90, 100};
       
       System.out.println("Enter an integer value (n): ");
        N = sc.nextInt();
        
        boolean found = false;
        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] == N){
                result = i;
                System.out.println( N+" is at index " + i + numbers[i]);
                found = true;
                // break;
            }
        }
        if (!found){
            System.out.println(N + " is not found in the array");
        }
    }
}
