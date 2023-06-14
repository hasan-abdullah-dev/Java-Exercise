public class Task3 {
    public static void main(String[]args){
        int start=0, end=600, sum=0;
        for(start=0;start<=end;start++){
            if(start%7==0 || start%9==0 || start%7==0 & start%9==0){
                sum += start;
                System.out.println(start);
            }
        }
        System.out.println("Sum: "+sum);
    }
}
