import java.util.Scanner;
public class quiz2 {
    public static void stockInput (String [] book, int [][] stock, String []stockName){
        Scanner input21 = new Scanner(System.in);
        System.out.println("---Enter The Amount of Stock--- ");
        for(int i = 0; i<book.length;i++){
            System.out.println(book[i] + " book");
            for(int j=0; j<stockName.length; j++){
                System.out.print(stockName[j] + ": ");
                stock[i][j] = input21.nextInt();
            }
            input21.nextLine();
            System.out.println();
        }
    }
    public static void displayOutput(String [] book, int [][] stock, String []stockName){
        System.out.println("---Display All The Book Stock---");
        for(int i=0; i<book.length;i++){
            System.out.println(book[i] +": ");
            
            for(int j=0;j<stockName.length;j++){
                System.out.print(stockName[j] +": ");
                System.out.print(stock[i][j]+"\n");
                
            }System.out.println();
            
        }
    }

    public static int bookBorrowed(int stock[][]){
        int total=0;
        for(int i=0; i<stock.length;i++){
            total += stock[i][0];
        }
        return total;
    }

    public static void biggestInStockBook(int stock[][], String [] book){
        int total = 0;
        String bookName = "";
        for(int i=0; i<stock.length;i++){
            if(stock[i][0]> total){
                total = stock[i][0];
                bookName=book[i];
                
            }
            
        }
        System.out.println("The book with the largest in-stock that can be borrowed is "+ bookName);
        
    }

    public static void biggestDamagedBook(int stock[][], String [] book){
        int total = 0;
        String bookName = "";
        for(int i = 0; i< stock.length;i++){
            if(stock[i][1]>total){
                total = stock[i][1];
                bookName=book[i];
            }
        }
        System.out.println("Book that are heavily borrowed is "+ bookName);
    }

public static void main(String[] args) {
    String book [] = {"Database", "Mathematics", "Algorithm"};
    String stockName[]= {"in-Stock", "Damaged-Stock", "Out-Of-Stock"};
    int stock[][] = new int[3][3];
    stockInput(book, stock, stockName);
    displayOutput(book, stock, stockName);
    System.out.println("The amount of book that can still be borrowed is: "+bookBorrowed(stock));;
    biggestInStockBook(stock, book);
    biggestDamagedBook(stock, book);
}
}