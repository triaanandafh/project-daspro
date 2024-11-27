import java.util.Scanner;
public class assignment3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[30];

    for (int i = 0; i < 30; i++){
        System.out.print("Enter element "+ (i+1) + ": ");
        arr[i] = sc.nextInt();
    }

    System.out.println("Array elements: ");
    for(int i : arr){
        System.out.print(arr[i] + " ");
    }
    System.out.println();
    }
}
