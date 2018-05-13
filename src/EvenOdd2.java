import java.util.Arrays;

public class EvenOdd2 {

    public static void main(String[] args) {

        int[] array = new int[10];
        for (int m = 0; m < array.length; m++) {
            array[m] = (int) (Math.random() * 100);
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

        System.out.println();

        //Checking the parity of array elements and indicating the position of the element
        for (int k=0; k<array.length; k++) {
            if (array[k]%2 == 0) {
                System.out.println(array[k] + " is even number and its position is " + (k+1));
            } else {
                System.out.println(array[k] + " is odd number and its position is " + (k+1));
            }
        }

        System.out.println();


        //Displaying all even numbers of array
        System.out.println("Even numbers are:");
        for (int k=0; k<array.length; k++) {
            if (array[k]%2 == 0) {
                System.out.println(array[k]);
            }
        }

        System.out.println();

        //Displaying all odd numbers of array
        System.out.println("Odd numbers are:");
        for (int k=0; k<array.length; k++) {
            if (array[k]%2 != 0) {
                System.out.println(array[k]);
            }
        }

    }
}
