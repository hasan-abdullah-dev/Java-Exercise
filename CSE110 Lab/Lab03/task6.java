import java.util.Scanner;
public class task6 {
    public static void main(String[]args){
        try(Scanner myScanner = new Scanner(System.in)){
            System.out.println("Enter the First Interger Number : ");
            int first_number = myScanner.nextInt();
            System.out.println("Enter the Second Interger Number : ");
            int second_number = myScanner.nextInt();
            if(first_number>second_number){
                System.out.println("first is greater");
            }
            else{
                System.out.println("first is not greater");
            }
        }
    }    
}