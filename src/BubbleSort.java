import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args){

        //Using Math.random() and sorting from the first array element to first
        int[] array = new int[10];
        for (int m=0; m<array.length; m++){
            array[m] = (int)(Math.random() * 100);
        }
        System.out.println("Original:" + "\n" + Arrays.toString(array) + "\n");

        for (int k=array.length-1; k>0; k--) {
            for (int i = 0; i < k; i++) {
                if (array[i] > array[i+1]) {
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }
        System.out.println("Sorted:" + "\n" + Arrays.toString(array));

        System.out.println("\n" + "\n" + "\n");

        //Using Random rn = new Random() and sorting from the last array element to first
        int[] n = new int[10];
        for (int i=0; i<10; i++) {
            Random rn = new Random();
            int k = rn.nextInt(100);
            n[i] = k;
        }
        System.out.println("Original:" + "\n" + Arrays.toString(n) + "\n");

        for (int i=1; i<n.length; i++){
            for (int l=n.length-1; l>0; l--){
                if (n[l-1]>n[l]){
                    int t = n[l-1];
                    n[l-1] = n[l];
                    n[l] = t;
                }
            }
        }
        System.out.println("Sorted:" + "\n" + Arrays.toString(n) + "\n");

    }
}
