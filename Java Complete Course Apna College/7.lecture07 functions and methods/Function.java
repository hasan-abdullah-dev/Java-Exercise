import java.util.*;
public class Function {
/*     //multiply 2 numbers
    public static int multiply(int firstNumber,int secondNumber ){
        return a*b;
    }
    public static void main(String[]args){
        try(Scanner myScanner = new Scanner(System.in)){
            int a = myScanner.nextInt();
            int b = myScanner.nextInt();
            int result = multiply(firstNumber, secondNumber);
            System.out.println(result);
        }
    } */
/*     public static void printFactorial(int number){
        if(number<0){
            System.out.println("Invaild Number");
        }
        int factorial = 1;
        for(int count=number;count>=1;count--){
            factorial=factorial*count;
        }
        System.out.println(factorial);
    }
    public static void main(String[]args){
        try(Scanner myScanner = new Scanner(System.in)){
            int number = myScanner.nextInt();
            printFactorial(number);
        }
    } */
/*     public static void primeFinder(int number){
        int check=0;
        for(int count=1;count<=number;count++){
            if(number%count==0){
                check+=1;
            }
        }
       if(check==2){
        System.out.println("Prime Number");
       }else{
        System.out.println("Not a Prime Number");
       }
    }
    public static void main(String[]args){
        try(Scanner myScanner = new Scanner (System.in)){
            int number = myScanner.nextInt();
            primeFinder(number);
        }
    } */
    public static void evenFinder(int number){
        if(number%2==0){
            System.out.println("Even Number");
        }else{
            System.out.println("Not a Even Number");
        }
    }
    public static void main(String[]args){
        try(Scanner myScanner = new Scanner (System.in)){
            int number = myScanner.nextInt();
            evenFinder(number);
        }
    }
}