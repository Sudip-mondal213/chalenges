import java.lang.classfile.attribute.SyntheticAttribute;
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("enter your number");
        int x = a.nextInt();
        if(x>90){
            System.out.println("A");
        } else if (x>75) {
            System.out.println("B");
        }
        else if (x>60) {
            System.out.println("c");
        }
        else if (x>30) {
            System.out.println("D");
        }
       else{
            System.out.println("F");
        }
    }
}
