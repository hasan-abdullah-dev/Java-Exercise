import java.util.Scanner;
public class task9 {
    public static void main(String[]args){
        try(Scanner myScanner = new Scanner(System.in)){
            System.out.println("Enter a Interger Number : ");
            int number = myScanner.nextInt();
            if(number%2==0){
                System.out.println("The number is even");
            }
            else{
                System.out.println("The number is odd");
            }
        }
    }    
}
