public class Q5{
    public static void main(String[] args){
        String test = "";
        int i = 0, j = 0, k = 15;
        test = "-->";
        while (i< 5){
            j = --k;
            while (j > 10 ){
                test = i + j + "-->" + test;
                System.out.println(test);
                j--;
            }
            i++;
        }
    }
}