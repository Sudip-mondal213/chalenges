import java.util.Scanner;

public class SumOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter your range:");
        int range = in.nextInt();
              int result = add(range);
        System.out.println(result);

    }
    public static int add (int n) {
        int i = 1;
        int sum = 0;

        while (i <= n) {
            if (i % 2 == 0) {
                i++;
                break;
            } else {
                sum += i;
                i++;
            }
        }
        return sum ;
    }
}
