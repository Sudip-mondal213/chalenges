import java.util.Scanner;

public class Ods_even {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("enter your number");
        int x = a.nextInt();
        if(x%2==0){
            System.out.println("this " + x +"is even ");
        }
        else{
            System.out.println(x+"odd");
        }
    }
}
