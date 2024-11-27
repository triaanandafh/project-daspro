import java.util.Scanner;
public class forMultiples21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int multiple, sum, counter;
        double average;
        sum = 0;
        counter = 0;

        System.out.print("Input the multiple: ");
        multiple = scanner.nextInt();

        for(int i = 1; i<=50; i++){
            if(i % multiple == 0) {
                sum += i;
                counter++;
            }
        }

        System.out.printf("There are %d number that are multiple of %d in range 1 to 50.\n", counter, multiple);
        System.out.printf("The sum of all multiples of %d in range 1 to 50 is %d \n", multiple, sum);

        average = sum / counter;
        System.out.println("The average of all specified multiples is " + average);
    }
}