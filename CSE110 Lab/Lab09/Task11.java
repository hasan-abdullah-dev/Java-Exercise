import java.util.Scanner;
public class Task11 {
    public static void main(String[]args){
        try(Scanner myScanner = new Scanner(System.in)){
            int[] myArray = new int[10];
            System.out.println("Enter 10 Numbers");
            for(int index=0;index<10;index++){
                myArray[index] = myScanner.nextInt();
                for(int count=0;count<index;count++){
                    if(myArray[count]==myArray[index]){
                        System.out.println("Enter a Different Number");
                        index--;
                    }
                }                
            }
        }
    }
}
