import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = getArr(getSize());
        System.out.println("Неотсортированный массив: " + Arrays.toString(array));
        int start = 0;
        int end = array.length - 1;
        System.out.println("Отсортированный массив: " + Arrays.toString(quickSort(array, start, end)));
    }

    public static int partition(int[] array, int start, int end) {
        int marker = start;
        for (int i = start; i <= end; i++) {
            if (array[i] <= array[end]) {
                int temp = array[marker];
                array[marker] = array[i];
                array[i] = temp;
                marker += 1;
            }
        }
        return marker - 1;
    }

    public static int[] quickSort(int[] array, int start, int end) {
        if (end >= start) {
            int pivot = partition(array, start, end);
            quickSort(array, start, pivot - 1);
            quickSort(array, pivot + 1, end);
        }
//        System.out.println(Arrays.toString(array));
        return array;
    }

    public static int getSize() {
        System.out.println("Введите размер массива: ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        input.close();
        return size;
    }

    public static int[] getArr(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 10));
        }
        return arr;
    }
}
