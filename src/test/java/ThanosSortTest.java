import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ThanosSortTest {

    @Test
    public void AlreadySortedTest() {
        int[] arr = {566, 766, 788, 790, 849, 903, 1200, 1201}; // уже отсортированный массив
        int[] sortedArr = {566, 766, 788, 790, 849, 903, 1200, 1201};
        int[] result = ThanosSort.thanosSort(arr);
        Assertions.assertArrayEquals(sortedArr, result);
    }

    @Test
    public void ReverseSortedTest() {
        int[] arr = {1201, 1200, 903,  849, 790, 788,  766, 566}; // отсортированный в обратном порядке массив
        int[] sortedArr = {566, 766, 788, 790, 849, 903, 1200, 1201};
        int[] result = ThanosSort.thanosSort(arr);
        Assertions.assertArrayEquals(sortedArr, result);
    }

    @Test
    public void PartiallySortedTest() {
        int[] arr = {2988, 3013, 3766, 3841, 10800, 7563, 17890, 5069, 12900, 4444}; // частично отсортированный массив
        int[] sortedArr = {2988, 3013, 3766, 3841, 4444, 5069, 7563, 10800, 12900, 17890};
        int[] result = ThanosSort.thanosSort(arr);
        Assertions.assertArrayEquals(sortedArr, result);
    }

    @Test
    public void SameNumbersTest() {
        int[] arr = {7, 7, 7, 7, 7, 7, 7, 7, 7, 7}; // массив одинаковых значений
        int[] result = ThanosSort.thanosSort(arr);
        Assertions.assertArrayEquals(arr, result);
    }

    @Test
    public void DuplicateNumbersTest() {
        int[] arr = {23, 15, 68, 73, 43, 43, 67, 43, 38, 0}; // массив с несколькими повторяющимися элементами
        int[] sortedArr = {0, 15, 23, 38, 43, 43, 43, 67, 68, 73};
        int[] result = ThanosSort.thanosSort(arr);
        Assertions.assertArrayEquals(sortedArr, result);
    }

    @Test
    public void EvenNumbersTest() {
        int[] arr = {66, 99, 1, 77, 6, 14, 55, 32, 67};  // нечетное количество элементов
        int[] sortedArr = {1, 6, 14, 32, 55, 66, 67, 77, 99};
        int[] result = ThanosSort.thanosSort(arr);
        Assertions.assertArrayEquals(sortedArr, result);
    }

    @Test
    public void OddNumbersTest() {
        int[] arr = {33, 45, 78, 12, 7, 32, 12, 56, 99, 108, 120, 29}; // четное количество элементов
        int[] sortedArr = {7, 12, 12, 29, 32, 33, 45, 56, 78, 99, 108, 120};
        int[] result = ThanosSort.thanosSort(arr);
        Assertions.assertArrayEquals(sortedArr, result);
    }

    @Test
    public void OneNumberTest(){
        int[] arr = {8991034}; // массив с одним числом
        int[] sortedArr = {8991034};
        int[] result = ThanosSort.thanosSort(arr);
        Assertions.assertArrayEquals(sortedArr, result);
    }

    @Test
    public void EmptyTest() {
        int[] emptyArr = {}; // пустой массив
        Assertions.assertArrayEquals(emptyArr, ThanosSort.thanosSort(emptyArr));
    }

    @Test
    public void ZeroNumberTest() {
        int[] arr = {0, 0}; //  массив нулей
        int[] sortedArr = {0, 0};
        Assertions.assertArrayEquals(sortedArr, ThanosSort.thanosSort(arr));
    }

    @Test
    public void NegativeNumbersTest() {
        int[] arr = {-66, -99, -1, -77, -6, -14, -55, -32, -67};  // массив отрицательных чисел
        int[] sortedArr = {-99, -77, -67, -66, -55, -32, -14, -6, -1};
        int[] result = ThanosSort.thanosSort(arr);
        Assertions.assertArrayEquals(sortedArr, result);
    }

    @Test
    public void PositiveAndNegativeNumbersTest() {
        // массив с положительными и отрицательными значениями
        int[] arr = {245678, 2147483647, 10009878, -2147483648, 399, -1876543};
        int[] sortedArr = {-2147483648, -1876543, 399, 245678, 10009878, 2147483647};
        int[] result = ThanosSort.thanosSort(arr);
        Assertions.assertArrayEquals(sortedArr, result);
    }

}
