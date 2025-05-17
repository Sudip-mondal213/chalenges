import java.util.Scanner;

public class swape {
    public static void main(String[] args) {
        int a,b,c;
        Scanner in = new Scanner(System.in);

        System.out.println("enter your a");
        a = in.nextInt();

        System.out.println("enter your b");
        b = in.nextInt();

        c=a;
        a=b;
        b=c;

        System.out.println("after swap a " +a );
        System.out.println("after swap b " + b);



    }
}
