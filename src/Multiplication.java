import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        int n=1;
        while( n <= 10){
            int sum = b*n;
            System.out.println("4 *"+ n +"="+sum);
            n++;
        }
    }
}
