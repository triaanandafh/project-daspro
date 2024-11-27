import java.util.Scanner;
public class cinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    int totalTicketSold = 0, numTickets;
    double totalTicketSales = 0, discount=0, totalPrice = 0;
    double pricePerTicket = 50000;
    String choice;

    while (true){
        System.out.print("Enter number of tickets sold: ");
        numTickets = scanner.nextInt();
        if(numTickets <= 0){
            System.out.println("Invalid input. Please input the right number: ");
            continue;
        }
        if(numTickets > 10) {
            discount = 0.15;
        }else if(numTickets > 4){
            discount = 0.1;
        }

        totalPrice = numTickets * pricePerTicket * (1 - discount);

        totalTicketSold += numTickets;
        totalTicketSales += totalPrice;

        System.out.printf("Total price for this transaction is: Rp %.2f\n", totalPrice);
        System.out.println("Do you want to continue? (y/n) : ");
        choice = scanner.next();

        if(!choice.equalsIgnoreCase("y")) {
            break;
        }
    }

    System.out.printf("Total tickets sold: %d\n", totalTicketSold);
    System.out.printf("Total Sales : Rp %.2f\n", totalTicketSales);



    }}

