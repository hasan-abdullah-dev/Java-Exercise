import java.util.Scanner;
public class Task10 {
    public static void main(String[]args){
        int check=0;
        try(Scanner myScanner = new Scanner(System.in)){
            System.out.println("Enter a Number");
            int number = myScanner.nextInt();
            for(int start=1;start<=number;start++){
                if(number%start==0){
                    check+=1;
                }
            }
        }
        if(check == 2){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not Prime Number");
        }
    }
}
        

