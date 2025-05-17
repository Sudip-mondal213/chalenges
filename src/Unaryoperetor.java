import java.util.Scanner;

public class Unaryoperetor {
    public static void main(String[] args) {
        int a, b ;
        Scanner x = new Scanner(System.in);
        System.out.println("enter 1st no :");
        a = x.nextInt();
        System.out.println("enter 2nd no :");
        b =x.nextInt();
        int and = a&b;
        int or = a|b;
        int xor = a^b;
        int not = ~b;
        int lsift = a<<b;
        int rsift = a>>b;
        System.out.println(and);
        System.out.println(or);
        System.out.println(xor);
        System.out.println(not);
        System.out.println(lsift);
        System.out.println(rsift);
        if ((a&1) == 0){
            System.out.println("the " + a +"even");
        }
        else{
            System.out.println("odd");
        }


    }
}
