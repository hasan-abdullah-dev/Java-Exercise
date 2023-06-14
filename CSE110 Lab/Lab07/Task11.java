public class Task11 {
    public static void main(String[]args){
        int check=0;
        for(int number=40;number<=50;number++){
            for(int start=1;start<=number;start++){
                if(number%start==0){
                    check+=1;
                }
            }
            if(check == 2){
                System.out.println(number+" Prime Number");
            }
            check=0;
        }
    }
}
        

