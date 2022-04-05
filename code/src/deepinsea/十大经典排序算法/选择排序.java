package deepinsea.十大经典排序算法;

import java.util.Arrays;

/**
 * @author deepinsea
 * 时间复杂度：O(n^2) 最好：O(n^2) 最坏：O(n^2)
 */
public class 选择排序 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 1, 5, 8, 2, 9, 7, 6};
        System.out.println(Arrays.toString(arr));
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 选择排序
     */
    public static int[] selectSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            // 默认将第一个作为最小值，依次根据下标变化当前无序列表中的最小值
            int min = arr[i];
            // 记录最小值的下标
            int index = i;
            //通过与后面的数据进行比较得出，最小值和下标
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    // 记录无序列表中的最小值与下标
                    min = arr[j];
                    index = j;
                }
            }
            // 将无序列表中的最小值与当前最小值参照物进行对比替换
            // 第一个最小值其实已经是最小的了，后面有序列表的参照物依次从小到大
            // 这样其实会造成重复比较，所以最好与最坏时间复杂度都是O(n^2)
            // 相对而言(对交换排序)，冒泡排序优于选择排序
            int temp = arr[i];
            arr[i] = min;
            arr[index] = temp;
        }
        return arr;
    }
}