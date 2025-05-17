import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float b = in.nextFloat();
        float h = in .nextFloat();
        float area = (b*h)/2;
        System.out.println(area);
    }
}
