/*import java.util.*;
public class practice1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();
        System.out.println("The average of three numbers are " + (a+b+c)/3);
    }
} */

//Question 2
/*import java.util.*;
public class practice1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        int area = side * side;
        System.out.println("The area is " + area);

    }
} */

import java.util.*;

public class practice1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float pen = 20.08f;
        float pencil = 5.89f;
        float eraser= 4.45f;
        float totalCost = pen + pencil + eraser;
        System.out.println(totalCost);
        float newTotal = totalCost + (0.18f * totalCost);
        System.out.println(newTotal);
    }
}