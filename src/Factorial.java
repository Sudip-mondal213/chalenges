import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        fibo();
    }

    public static void fibo( ){
        Scanner in = new Scanner(System.in);
        System.out.println("enter your fibo");
        int a = in.nextInt();
        int sum = 1;
        while(a>0){
           sum = sum * a;
            a--;
        }
        System.out.println(sum);

    }
}
