import java.util.Scanner;
public class Task9 {
    static int start,sum;
    public static void main(String[]args){
        try(Scanner myScanner = new Scanner(System.in)){
            System.out.println("Enter a Number");
            int number = myScanner.nextInt();
            for(start=1;start<number;start++){
                if(number%start==0){
                    sum+=start;
                }
            }
            if(number==sum){
                System.out.println("Perfect Number");
            }else{
                System.out.println("Not a Perfect Number");
            }
        }
    }
}
