import java.util.Arrays;

public class Loops {

    public static void main(String[] args){

        String[] vars = {"*","*","*","*","*","*","*"};
        for (int i=0; i < vars.length; i++) {
            vars[i] = String.valueOf(i + 1);
            System.out.println(Arrays.toString(vars));
        }

        System.out.println();

        String[] vars3 = {"*","*","*","*","*","*","*"};
        for (int k=0; k < vars3.length; k++) {
            vars3[k] = (k + 1) + "";
            System.out.println(Arrays.toString(vars3));
        }

        System.out.println();

        String vars1= "*******";
        char[] vars2 = vars1.toCharArray();
        for (int j=0; j < vars2.length; j++) {
            vars2[j] = (char) (j+1);
            System.out.println(Arrays.toString(vars2));
        }

        System.out.println();

        for (int i=1; i<8; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(j);
            }
            for (int j=i; j<7; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
