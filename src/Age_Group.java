import java.util.Scanner;

public class Age_Group {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("enter your age :");
        int x = a.nextInt();
        if(x<13){
            System.out.println("child");
        } else if (x<20) {
            System.out.println("Teen");
        }
        else if(x<60){
            System.out.println("adult");
        }
        else {
            System.out.println("senior");
        }
    }
}
