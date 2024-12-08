// 21_TRIA ANANDA FADILLAH
/**
 * quiz21
 */
import java.util.Scanner;
public class quiz21 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int familyMembers;
    double basicSalary, taxes, totalBpjs, netSalary;

    System.out.println("input basic salary: ");
    basicSalary = input.nextDouble();
    System.out.println("Input family members: ");
    familyMembers = input.nextInt();
    
    taxes = basicSalary * 0.15;
    totalBpjs = 100000 * familyMembers;
    netSalary = basicSalary - (taxes + totalBpjs);
    
    System.out.println("Your net salary is: " + netSalary);
    }
    
}