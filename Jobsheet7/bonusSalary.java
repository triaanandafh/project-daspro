import java.util.Scanner;
public class bonusSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double salary, bonus = 0.2, netSalary;
        int numberHours;
        

        while(true) {
            System.out.print("Input salary: ");
            salary = scanner.nextDouble();
            System.out.print("Input number of worked: ");
            numberHours = scanner.nextInt();
            if (numberHours < 0) {
                break;
            }else {
                if (numberHours > 8) {
                    netSalary = salary * bonus;
                    System.out.println("The net salary is: " + netSalary);
                } else {
                    netSalary=salary;
                    System.out.println("The net salary is: " + netSalary);
                }
            }
        }
    }
}
