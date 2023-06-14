import java.util.Scanner;
public class Task6 {
    public static void main(String[]args){
        int start,end,number;
        try(Scanner myScanner = new Scanner(System.in)){
            System.out.println("Enter the Quantity of Number");
            end = myScanner.nextInt();
            for(start=0;start<end;start++){
                System.out.println("Enter a Numbers");
                number = myScanner.nextInt();
                if(number%2==0){
                   System.out.println("The Number is Even");
                }else{
                    System.out.println("The Number is Odd");
                }
            }
        }
    }
}
