import java.util.Scanner;
public class cinemaWithScanner21 {
    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);
        String [][] audience = new String[4][2];
        String name, next;
        int row, column, choice;
        while(true){
            System.out.println("Cinema21 Menu");
            System.out.println("1. Input audience data");
            System.out.println("2. Show audience list");
            System.out.println("3. Exit");
            System.out.print("Choose a menu option (1-3): ");
            choice = input21.nextInt();
            input21.nextLine();

            switch (choice) {
                case 1:
                while (true) {
                    System.out.print("Enter a name: ");
                    name = input21.nextLine();

                    while (true) {
                        
                        System.out.print("Enter row number: ");
                        row = input21.nextInt();
                        System.out.print("Enter column number: ");
                        column = input21.nextInt();
                        input21.nextLine();

                        if(row >= 1 && row <= 4 && column >=1 && column <=2){
                            if(audience[row-1][column-1] == null){
                                audience[row-1][column-1] = name;
                                break;
                            } System.out.println("Sorry, the seata is already taken by "+ audience[row-1][column-1]);
                            
                        } else{
                            System.out.println("Invalid input.Please input the right number.");
                        }

                       
                        
                    }System.out.print("Are there any other audience to be added? (y/n): ");
                    next = input21.nextLine();
        
                    if(next.equalsIgnoreCase("n")){
                        break;
                    }

                    }
                    break;
            
                case 2:
                System.out.println("\nAudience List: ");
                for(int i = 0; i < audience.length; i++){
                    for(int j=0; j<audience[i].length; j++){
                        String displayName = (audience[i][j] == null) ? "***" : audience[i][j];
                        System.out.print(displayName + "\t");
                    }
                    System.out.println();
                }
                    break;

                case 3:
                System.out.println("Exit from the program");
                input21.close();
                return;
            }
        }
        
            

          
        }
    }

