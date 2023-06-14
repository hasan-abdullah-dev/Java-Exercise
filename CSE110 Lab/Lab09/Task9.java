import java.util.Scanner;
public class Task9 {
    static boolean value = false;
    public static void main(String[]args){
        try(Scanner myScanner = new Scanner(System.in)){
            int[] myArray = new int[10];
            System.out.println("Enter 10 Numbers");
            for(int index=0;index<10;index++){
                myArray[index] = myScanner.nextInt();
            }
            System.out.println("Enter the Number");
            int searchNumber = myScanner.nextInt();
            for(int index=0;index<10;index++){
                if(myArray[index]==searchNumber){
                    value = true;
                    break;
                }
            }
            if (value == true){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }
}
