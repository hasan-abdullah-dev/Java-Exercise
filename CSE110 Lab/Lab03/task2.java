import java.util.Scanner;
public class task2 {
    public static void main(String[]args){
        try (Scanner myScanner = new Scanner(System.in)) {
            System.out.println("Enter the First Interger Number");
            int first_number = myScanner.nextInt();
            System.out.println("Enter the Second Interger Number");
            int second_number = myScanner.nextInt();
            System.out.println("Sum : "+ (first_number+second_number));
            System.out.println("Product : "+(first_number*second_number));
            if(first_number>second_number){
                System.out.println("Difference : "+(first_number-second_number));
            }
            else{
                System.out.println("Difference : "+(second_number-first_number));
            }
        }
    }
}
