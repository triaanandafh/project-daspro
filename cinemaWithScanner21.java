import java.util.Scanner;
public class cinemaWithScanner21 {
    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);
        String [][] audience = new String[4][2];
        String name, next;
        int row, column;
        while (true) {
            System.out.print("Enter a name: ");
            name = input21.nextLine();
            System.out.print("Enter row number: ");
            row = input21.nextInt();
            System.out.print("Enter column number: ");
            column = input21.nextInt();

            input21.nextLine();

            audience[row - 1][column - 1] = name;
            System.out.print("Are there any other audience to be added? (y/n): ");
            next = input21.nextLine();

            if(next.equalsIgnoreCase("n")){
                break;
            }
        }
    }
}
