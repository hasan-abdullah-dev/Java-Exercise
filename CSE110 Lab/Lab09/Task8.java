import java.util.Scanner;
public class Task8 {
    public static void main(String[]args){
        try(Scanner myScanner = new Scanner(System.in)){
            int[] myArray = new int[10];
            System.out.println("Enter 10 Numbers");
            for(int index=0;index<10;index++){
                myArray[index] = myScanner.nextInt();
            }
            for(int index=9;index>=0;index--){
                if(myArray[index]%2==0){
                    System.out.println("Reversed Order: "+myArray[index]);
                }
            }
        }
    }
}
