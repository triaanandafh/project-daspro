import java.util.Scanner;
public class doWhileLeaveEntitlement21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int leaveEntitlement, numLeave;
        String confirmation;

        System.out.print("Input the number of leave entitlement: ");
        leaveEntitlement = scanner.nextInt();

        do{
            System.out.print("Do you want to take a leave (y/n)? ");
            confirmation = scanner.next();

            if(confirmation.equalsIgnoreCase("y")) {
                System.out.print("How many day(s)? ");
                numLeave = scanner.nextInt();
                if(numLeave <= leaveEntitlement){
                    leaveEntitlement -= numLeave;
                    System.out.println("Remaining leave entitlement: " + leaveEntitlement);
                } else {
                    System.out.println("You dont have enough leave entitlement");
                    System.out.println("Please enter the right number: ");
                    numLeave = scanner.nextInt();
                    leaveEntitlement -= numLeave;
                    System.out.println("Remaining leave entitlement: " + leaveEntitlement);
                }
            } else {
                System.out.println("Exit");
                break;
        }
            
        } while(leaveEntitlement > 0);
    } 
}
