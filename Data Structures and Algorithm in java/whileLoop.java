/*public class whileLoop{
    public static void main(String args[]){
        int i = 0;
        while(i<100){
            System.out.println("Hello World");
            i++;
        }
        System.out.println("printed 100 times");
    }
} */

/*public class whileLoop{
    public static void main(String args[]){
        int  i = 1;
        while(i<=10){
            System.out.println(i);
            i++;
        }

    }
} */

import java.util.*;
public class whileLoop{
    public static void main(String args[]){
        int i = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(i<=n){
           
            System.out.println(i + " ");
            i++;
        }
    }
}