public class ThanosSort {

    public static void main(String[] args) {

        int[] arr = {66, 99, 1, 77, 6, 14, 55, 32, 67};
        int[] arr1 = {97, 25, 42, 90, 71, 16, 82, 39, 36, 74};
        int[] arr2 = {186, 338, 675, 726, 570, 382, 164, 507, 496, 674, 955, 75, 150, 825, 899, 886, 859, 811, 338, 403,
                172, 383, 137, 13, 540, 290, 397, 912, 497, 947, 713, 96, 964, 562, 579, 19, 333, 930, 243, 380, 878,
                256, 759, 542, 280, 639, 998, 955, 826, 254};

        printArr(thanosSort(arr));
        printArr(thanosSort(arr1));
        printArr(thanosSort(arr2));

    }

    public static int[] thanosSort(int[] arr) {
        if (arr.length > 0) sort(arr, 0, arr.length - 1);
        return arr;
    }

    public static void sort(int[] unsortedArr, int left, int right) {

        int sumArr = 0;

        for (int i = left; i <= right; i++) {
            sumArr += unsortedArr[i];
        }

        double average = sumArr / (right - left + 1);

        int[] subarray = new int[right - left + 1];
        int min = 0;
        int max = subarray.length - 1;
        int cursor = left;

        for (int i = left; i <= right; i++) {
            if (unsortedArr[i] <= average) {
                subarray[min++] = unsortedArr[i];
            } else {
                subarray[max--] = unsortedArr[i];
            }
        }

        for (int i = 0; i < subarray.length; i++) {
            unsortedArr[cursor++] = subarray[i];
        }

        if (right > left + 1) {
            sort(unsortedArr, left, left + min - 1);
            sort(unsortedArr, left + min, right);
        }
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

