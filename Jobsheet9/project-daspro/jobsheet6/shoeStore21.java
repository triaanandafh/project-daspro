import java.util.Scanner;
public class shoeStore21 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String brand, category;
        int size;
        Double price;

        System.out.println("Input brand : ");
        brand = sc.nextLine();
        System.out.println("Input category : ");
        category = sc.nextLine();
        System.out.println("Input size : ");
        size = sc.nextInt();

        if(brand.equalsIgnoreCase("converse")){
            if(category.equalsIgnoreCase("slip on")){
                System.out.println("The price is 800.000 IDR");
            } else {
                System.out.println("The price is 1.200.000 IDR");
            }
        } else if (brand.equalsIgnoreCase("Sketcher")){
            if(category.equalsIgnoreCase("woman")){
                System.out.println("The price is 1.000.000 IDR");
            } else {
                System.out.println("The price is 1.800.000 IDR");
            }
        } else if (brand.equalsIgnoreCase("nike")){
            if(category.equalsIgnoreCase("kids")){
                System.out.println("The price is 750.000 IDR");
            } else {
                System.out.println("The price is 1.500.000 IDR");
            }
        }
    }
}
