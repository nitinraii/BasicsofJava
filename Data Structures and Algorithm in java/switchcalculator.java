import java.util.*;

public class switchcalculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char operator = sc.next().charAt(0);

        switch(operator){
            case '+': System.out.print(a+b);
            break;
            case '-': System.out.print(a-b);
            break;
             case '*': System.out.print(a*b);
            break;
             case '/': System.out.print(a/b);
            break;
            default:System.out.println("Dont have any operator");

        }
    }
}
