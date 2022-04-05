package deepinsea.十大经典排序算法;

import java.util.Arrays;

/**
 * @author deepinsea
 * 时间复杂度：O(n^2) 最好：O(n) 最坏：O(n^2)
 */
public class 冒泡排序 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 8, 5, 6, 9, 7, 1};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 冒泡排序
     */
    public static int[] bubbleSort(int[] arr) {
        // 外循环，需要遍历的元素个数
        for (int i = 0; i < arr.length - 1; i++) {
            // 内循环，元素遍历的次数
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}