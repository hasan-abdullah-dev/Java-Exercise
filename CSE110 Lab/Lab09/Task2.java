import java.util.Scanner;
public class Task2 {
    public static void main(String[]args){
        try(Scanner myScanner = new Scanner(System.in)){
            int[] myArray = new int[10];
            System.out.println("Enter 10 Numbers");
            for(int index=0;index<10;index++){
                myArray[index] = myScanner.nextInt();
            }
            System.out.println("Enter the Array Index");
            int userIndex = myScanner.nextInt();
            System.out.println(myArray[userIndex]);
        }
    }
}
