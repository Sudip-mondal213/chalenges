import java.util.Scanner;

public class Greater_number {
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        System.out.println("enter your number\n");
        int x = a.nextInt();
        System.out.println("enter your 2nd number\n");
        int y  = a.nextInt();
        System.out.println("enter your last number\n");
        int z = a.nextInt();
        if(x>y && x>z){
            System.out.println("x is greater then z and y\n");
        } else if (y>z) {
            System.out.println("y is greater then x and z\n");
        }
        else{
            System.out.println("z is greater then x and y\n");
        }
    }
}
