package arrays;

/**
 * NegativeElements
 */
// Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
// 1st: -12,-13, -5, 6, -7, 5, -3, -6,11
// 2nt: -12,-13, -5,-7, 5, -3, -6,11,6
// 3rd: -12,-13, -5,-7, -3, -6,11,6,5

// Output: -12 -13 -5 -7 -3 -6 11 6 5
// Note: Order of elements is important here

public class NegativeElements {

    public static void sortElements(int arr[]) {
        int high = arr.length - 1;
        for (int i = 0; i < high;) {
            if (arr[i] > 0) {
                if (arr[high] > 0) {
                    high--;
                }
                int temp = arr[i];
                int j = i;
                while (j < arr.length - 1) {
                    arr[j] = arr[j + 1];
                    j++;
                }
                arr[j] = temp;
                for (int k : arr) {
                    System.out.print(k + " ");
                }
                System.out.println("");
                i++;
            } else {
                i++;
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
        NegativeElements.sortElements(arr);

    }
}