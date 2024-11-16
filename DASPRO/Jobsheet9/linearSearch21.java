import java.util.Scanner;
public class linearSearch21 {
    public static void main(String[] args) {
        Scanner input21 = new Scanner (System.in);
        int numArray;
        System.out.print("Enter the number of array elements: ");
        numArray = input21.nextInt();

        int[] arrayInt = new int [numArray];
        int key;
        int result = 0;

        for(int i = 0; i<numArray; i++){
            System.out.print("Enter array element " + i + ": ");
            arrayInt[i] = input21.nextInt();
        }

        System.out.print("Enter the key you want to search for: ");
        key = input21.nextInt();
        for (int i = 0; i < arrayInt.length; i++){
            if (arrayInt[i] == key){
                result = i;
                System.out.println("The key in the array is located at index position " + result);
                break;
            }else{
                System.out.println("Key not found");
                break;
            }
        }
        
    }
}
