import java.util.Scanner;
public class assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numMonths;
        String [] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        System.out.println("Enter a month number (1-12): ");
        numMonths = sc.nextInt();

        if(numMonths >=1 && numMonths <=12){
            System.out.println("Month: " + months[numMonths-1]);
        } else{
            System.out.println("Invalid input");
        }
    }
}
