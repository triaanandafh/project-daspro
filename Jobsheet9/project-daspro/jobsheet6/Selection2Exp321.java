import java.util.Scanner;
public class Selection2Exp321 {
    public static void main(String[] args) {
      Scanner input21 = new Scanner(System.in);
      String category;
      int income, netSalary;
      double tax = 0;  

      System.out.println("Input category : ");
      category = input21.nextLine();
      System.out.println("Input income : ");
      income = input21.nextInt();

      if (category.equalsIgnoreCase("worker")){
        if(income <= 2000000){
            tax = 0.1;
        } else if (income <= 3000000){
            tax = 0.15;
        } else {
            tax = 0.2;
        }
        netSalary = (int) (income - (tax*income));
        System.out.println("Net salary = " + netSalary);
      } else if (category.equals("businessman")){
        if(income <= 2500000){
            tax = 0.15;
        }else if(income <= 3500000){
            tax = 0.2;
        } else {
            tax = 0.25;
        }
        netSalary = (int) (income - (tax*income));
        System.out.println("Net salary = " + netSalary);
      }else {
        System.out.println("Invalid category!");
      }
    }
}
