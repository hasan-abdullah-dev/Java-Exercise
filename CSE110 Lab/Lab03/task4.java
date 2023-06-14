import java.util.Scanner;
public class task4 {
    public static void main(String[]args){
        try(Scanner myScanner = new Scanner(System.in)){
            System.out.println("Enter the Radius of Circle");
            float radius = myScanner.nextFloat();
            System.out.println("Circumference : "+(2*radius*Math.PI));
            System.out.println("Area : "+(Math.PI*radius*radius));
        }        
    }
}
