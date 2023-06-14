import java.util.Scanner; //import the scanner class to get user input
public class task1 {
    public static void main(String[]args)
    {
        try (Scanner myScanner = new Scanner(System.in)) {
            System.out.println("Enter a Integer Number: ");
            int number = myScanner.nextInt();
            System.out.println("The Number is : " + number);
        }        
    }
}