import java.util.Scanner;
public class bookshopDisc21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String category;
        int quantity, totalDiscount;
        Double discount;

        System.out.println("Input item category : ");
        category = sc.nextLine();
        System.out.println("Input quantity : ");
        quantity = sc.nextInt();

        if(category.equalsIgnoreCase("dictionary")){
            if(quantity > 2){
                discount = 0.12;
            }else {
                discount = 0.1;
            }
        } else if (category.equalsIgnoreCase("novel")){
            if(quantity > 3){
                discount = 0.09;
            } else{
                discount = 0.08;
            }
        } else{
            if(quantity > 3){
                discount = 0.05;
            } else{
                discount = 0.0;
            }
        }

        // totalDiscount = (int) (discount * quantity);
        System.out.println("Total discount: " + (discount*100) +"%");
    }
}
