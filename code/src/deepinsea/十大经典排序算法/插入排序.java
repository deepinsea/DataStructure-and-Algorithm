package deepinsea.十大经典排序算法;

import java.util.Arrays;

/**
 * @author deepinsea
 */
public class 插入排序 {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 6, 2, 4, 3, 5, 7, 8, 9};
        System.out.println(Arrays.toString(arr));
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 插入排序
     */
    public static int[] insertSort(int[] arr) {
        // 外循环，遍历所有的元素
        for (int i = 1; i < arr.length; i++) {
            // 内循环，寻找元素 arr[i] 合适的插入位置(临界值)
            for (int j = i; j > 0; j--) {
                // 小于前一个数，则交换顺序;否则，结束循环
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else
                    break;
            }
        }
        return arr;
    }
}
