package arrays;

public class NegativeElementsOrder {
        // public static void swap(int arr[], int j, int low) {
        // int temp = arr[j];
        // while (low > j) {
        // arr[j] = arr[j - 1];
        // j--;
        // }
        // arr[low] = temp;
        // System.out.println("called");
        // }

        // public static void sortElements(int arr[]) {
        // int high = arr.length - 1;
        // int low = 0;
        // if (arr[0] > 0) {
        // low++;
        // }
        // for (int i = low; i <= high;) {
        // if (arr[i] > 0) {
        // int j = i;
        // int temp = arr[j];
        // while (j > low) {
        // arr[j] = arr[j - 1];
        // j--;
        // }
        // arr[low] = temp;
        // for (int k : arr) {
        // System.out.print(k + " ");
        // }
        // System.out.println();
        // i++;
        // low++;

        // } else {
        // i++;
        // }

        // }

        // }
        // -6, -8, 2, -8, 3, 5, -2, 5

        // Without changing order Of Array Element

        public static void arrangeElements(int arr[]) {
                int temp[] = new int[arr.length];
                int j = 0;
                // assign all +ve values
                for (int i = 0; i < arr.length - 1; i++) {
                        if (arr[i] < 0) {
                                temp[j] = arr[i];
                                j++;
                        }
                }
                for (int i = 0; i <= arr.length - 1; i++) {
                        if (arr[i] > 0) {
                                temp[j] = arr[i];
                                j++;
                        }
                }
                for (int i = 0; i <= temp.length - 1; i++) {
                        arr[i] = temp[i];
                }
                for (int i : arr) {
                        System.out.print(i + " ");
                }

        }

        public static void main(String[] args) {
                int arr[] = { -6, -8, 2, -8, 3, 5, -2, 5 };
                NegativeElementsOrder.arrangeElements(arr);

        }
}