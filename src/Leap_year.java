import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("enter your year");
        int x = a.nextInt();
        if ((x % 400 ==0 ) || ((x%4==0) && (x%100 != 0) ))
        {
            System.out.println("this is leap year");

        }
        else
        {
            System.out.println("not leapyear");
        }
    }
}
