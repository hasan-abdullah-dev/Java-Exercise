import java.util.Scanner;
public class Task10 {
    public static void main(String[]args){
        try(Scanner myScanner = new Scanner(System.in)){
            int[] myArray = new int[10];
            System.out.println("Enter 10 Numbers");
            for(int index=0;index<10;index++){
                myArray[index] = myScanner.nextInt();
                for(int count=0;count<=index;count++){
                    System.out.println(myArray[count]);
                }
            }
        }
    }
}
