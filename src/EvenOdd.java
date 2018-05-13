import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;
import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter you integer: ");
        int number = in.nextInt();
        if (number%2 == 0) {
            System.out.println("\nEven number");
        } else {
            System.out.println("\nOdd number");
        }

    }
}
