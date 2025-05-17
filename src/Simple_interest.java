import java.util.Scanner;

public class Simple_interest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float P = in.nextFloat();
        float T = in.nextFloat();
        float R = in.nextFloat();
        float interest = (P*R*T)/100;
        System.out.println(interest);
    }
}
