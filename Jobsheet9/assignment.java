import java.util.Scanner;
public class assignment {
    public static void main(String[] args) {
        Scanner input21 =  new Scanner(System.in);
        int numArray;
         System.out.print("Enter the number of array: ");
        numArray = input21.nextInt();

        int array[] = new int[numArray];
        for(int i=0; i < numArray; i++){
            System.out.print("Enter array element " + i+ ": ");
            array[i] = input21.nextInt();
        }

        int highestNum = array[0];
        int lowestNum = array[0];
        for(int i=1; i<numArray; i++){
            if(array[i] > highestNum){
                highestNum = array[i];
                
            }
            if(array[i] < lowestNum){
                lowestNum = array[i];
                
            }
        }System.out.println("The highest number is: " + highestNum);
        System.out.println("The lowest number is: " + lowestNum);
    }
    

    
}
