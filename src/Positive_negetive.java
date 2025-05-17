import java.util.Scanner;

public class Positive_negetive {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("enter your number ;\n");
        int p = a.nextInt();
        if(p>0){
            System.out.println("positove");
        } else if (p<0) {
            System.out.println("negetive");

        }
        else {
            System.out.println("0");
        }

    }
}
