import java.util.Scanner;
public class Task1 {
    public static void main(String[]args){
        int index, myArray[], arrayLength, startValue;
        try (Scanner myScanner = new Scanner(System.in)) {
            System.out.println("Enter the Length of Array");
            arrayLength = myScanner.nextInt();
            myArray = new int[arrayLength];
            System.out.println("Enter Start Value");
            startValue = myScanner.nextInt();
            System.out.println("Enter task number");
            char task = myScanner.next().charAt(0);
            if (task == 'a'){
                for(index=0; index<arrayLength; index++){                         
                    myArray[index] = startValue;
                    startValue = startValue - 6;               
                }
            }else if(task == 'b'){
                for(index=0; index<arrayLength; index++){                          
                    myArray[index] = startValue;
                    startValue = startValue + 5;              
                }
            }else if(task == 'c'){
                for(index=0; index<arrayLength; index++){                          
                    myArray[index] = startValue;
                    startValue = startValue + 9;              
                }
            }else if(task == 'd'){
                for(index=0; index<arrayLength; index++){ 
                    if (index%2==1){
                        myArray[index] = startValue - (2*startValue);
                    }else{                        
                        myArray[index] = startValue;
                    }
                    startValue = startValue + 9;              
                }
            }else{
                System.out.println("Errror Input");
            }
        }
        for (index=0; index<arrayLength; index++){
            System.out.println(myArray[index]);
        }
                 
    }
}
