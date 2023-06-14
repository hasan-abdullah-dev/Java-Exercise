import java.util.Scanner;
public class Task7 {
    public static void main(String[]args){
        int start,end,number;
        float max=-999999999,min=999999999,sum=0,avg;
        try(Scanner myScanner = new Scanner(System.in)){
            System.out.println("Enter the Quantity of Number");
            end = myScanner.nextInt();
            for(start=0;start<end;start++){
                System.out.println("Enter a Numbers");
                number = myScanner.nextInt();
                if (number<min){
                    min = number;
                }else if (number>max){
                    max = number;
                }
                sum +=number;
            }
        }
        avg = sum/end;
        System.out.println("Min: "+min);
        System.out.println("Max: "+max);
        System.out.println("Avg: "+avg);
    }
}
