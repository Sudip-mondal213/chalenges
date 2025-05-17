import java.util.Scanner;

public class Compound_interest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float P = in.nextFloat();
        float T = in.nextFloat();
        float R = in.nextFloat();
        float compound= P*(1+R/100)*T;
        System.out.println(compound);
    }
}
