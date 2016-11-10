/**
 * Created by Praktika on 10.11.2016.
 */
import java.util.Scanner;

public class exercise54 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("How many bottles of beer are there on the wall: ");
        n = in.nextInt();
    }

        public static void nLines(int n) {
            if (n == 0) {
                System.out.println("No bottles of beer on the wall,");
                System.out.println("no bottles of beer,");
                System.out.println("ya' can't take one down, ya' can't pass it around,");
                System.out.println("'cause there are no more bottles of beer on the wall!");
            } else {
                System.out.println(n + "bottles of beer on the wall,");
                System.out.println(n + "bottles of beer,");
                System.out.println("ya' take one down, ya' pass it around,");
                nLines(n - 1);
            }
        }



    }

