import java.util.Scanner;
public class Task1 {
    public static void main(String[]args){
        int sum=0;
        try(Scanner myScanner = new Scanner(System.in)){
            int[] myArray = new int[3];
            for(int index=0;index<3;index++){
                myArray[index]= myScanner.nextInt();
            }
            for(int index=0;index<3;index++){
                sum+=myArray[index];
            }
            System.out.println("Sum: "+sum);
        }
    }
}