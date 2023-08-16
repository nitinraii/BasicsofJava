public class printreverseno{
    public static void main(String args[]){
        int n = 99801;
        while(n > 0 ){
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n /=10;
        }
    }
}