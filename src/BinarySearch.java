import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args){
        int[] array = {2,50,43,19,45,12,53,130,16,7,126,9,13,27,168,310};
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

        System.out.println("\n");

        int j = 53;
        int first = 0;
        int last = array.length;
        int middle;
        while (first<last) {
            middle = (first + last)/2;
            if (j==array[middle]){
                System.out.println("Found. Wanted array element with value " + j + " is on position " + (middle+1));
                break;
            } else if (j<array[middle]) {
                last = middle;
            } else {
                first = middle + 1;
            }
        }
    }
}
