import java.util.Scanner;
public class Task13 {
    static int evenSum,oddSum,fiveDivisibleSum;
    public static void main(String[]args){
        try(Scanner myScanner = new Scanner(System.in)){
            int[] myArray = new int[10];
            System.out.println("Enter 10 Numbers");
            for(int index=0;index<10;index++){
                myArray[index] = myScanner.nextInt();
            }
            for(int index=0;index<10;index++){
                if(myArray[index]%2==0){
                    evenSum+=myArray[index];
                }else{
                    oddSum+=myArray[index];
                }
                if(myArray[index]%5==0){
                    fiveDivisibleSum+=myArray[index];
                }
            }
            System.out.println("Even Sum: "+evenSum);
            System.out.println("Odd Sum: "+oddSum);
            System.out.println("Five Divisible Sum: "+fiveDivisibleSum);
        }
    }
}
