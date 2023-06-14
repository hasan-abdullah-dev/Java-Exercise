import java.util.Scanner;
public class task3 {
    public static void main(String[]args){
        try(Scanner myScanner = new Scanner(System.in)){
            System.out.println("Enter the First Float Number : ");
            float first_number = myScanner.nextFloat();
            System.out.println("Enter the Second Float Number : ");
            float second_number = myScanner.nextFloat();
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
