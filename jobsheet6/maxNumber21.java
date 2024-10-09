import java.util.Scanner;
public class maxNumber21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("Input number 1 : ");
        num1 = sc.nextInt();
        System.out.println("Input number 2 : ");
        num2 = sc.nextInt();
        System.out.println("Input number 3 : ");
        num3 = sc.nextInt();

        if(num1 > num2){
            if(num1 > num3){
                System.out.println("Number 1 is the maximum number.");
            } else {
                System.out.println("Number 3 is the maximum number.");
            }
        } else {
            if(num2 > num3){
                System.out.println("Number 2 is the  maximum number.");
            } else {
                System.out.println("Number 3 is the maximum number.");
            }
        }
    }
}
