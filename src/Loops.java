import java.util.Scanner;

public class Loops {

     public static void count (int c){

          while(c >= 100) {
              System.out.println(c);
              c--;

          }

     }
    public static void main(String[] args) {

        int c1  = 500;
       // count(c1);
        Scanner in = new Scanner(System.in);
        int i = 0;
        while (i<5){
            int n = in.nextInt();
            System.out.println("number is :" + n);
            i++;
        }

    }
}
