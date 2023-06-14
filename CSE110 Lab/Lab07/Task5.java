import java.util.Scanner;
public class Task5 {
    public static void main(String[]args){
        int start,end=20,number;
        try(Scanner myScanner = new Scanner(System.in)){
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
