import java.util.Scanner;
public class Task8 {
    public static void main(String[]args){
        int check=0;
        try(Scanner myScanner = new Scanner(System.in)){
            System.out.println("Enter a Number");
            int number = myScanner.nextInt();
            for(int start=1;start<=number;start++){
                if(number%start==0){
                    System.out.println(start);
                    check+=1;
                }
            }
        }
        System.out.println("Total "+check+" divisors");
    }
}
